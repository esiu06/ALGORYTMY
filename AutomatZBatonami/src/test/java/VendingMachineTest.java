import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.*;


public class VendingMachineTest {


    Kasa kasa;


    Produkty produkty;

    AutomatZBatonami testObject;

    @Before
    public void init(){
        kasa = Mockito.mock(Kasa.class);
        produkty = Mockito.mock (Produkty.class);
        testObject = new AutomatZBatonami(kasa, produkty);
    }

    @Test
    public void kiedyWkladamyDolaraKasaGoPrzyjmuje(){
        testObject.execute("D");
        verify(kasa).wlozDolar();
        sprawdzCzyZwrocilReszteInicNieZostawil();
    }

    private void sprawdzCzyZwrocilReszteInicNieZostawil() {
        verify(kasa).zwrocReszte();
        verifyNoMoreInteractions(kasa);
    }

    @Test
    public void kiedyWkladamyCwiercDolaraKasaGoPrzyjmuje(){
        testObject.execute("Q");
        verify(kasa).wlozCwiercDolar();
        sprawdzCzyZwrocilReszteInicNieZostawil();
    }
    //N
    //d

    @Test
    public void kiedyWloze2RozneMonetyKasaJePrzyjac(){
        testObject.execute("DQ");
        verify(kasa).wlozDolar();
        verify(kasa).wlozCwiercDolar();
        sprawdzCzyZwrocilReszteInicNieZostawil();
    }
    @Test
    public void kiedyWlozeNdRozneMonetyKasaJePrzyjac() {
        testObject.execute("Nd");
        verify(kasa).wlozNikiel();
        verify(kasa).wlozCent();
        sprawdzCzyZwrocilReszteInicNieZostawil();
    }
    @Test
    public void kiedyWlozeDwaDolaryKasaMaJePrzyjac() {
        testObject.execute("DD");
        verify(kasa, Mockito.times(2)).wlozDolar();
        sprawdzCzyZwrocilReszteInicNieZostawil();
    }
    //DDQNdQDNd

    @Test
    public void kiedyWlozeDolaraIWybioreDroszyProduktToDostaneGoSpowrotem(){
        when(kasa.zwrocReszte()).thenReturn("D");
        String result = testObject.execute("DA");
        verify(kasa).wlozDolar();
        sprawdzCzyZwrocilReszteInicNieZostawil();
        assertEquals("D", result);
    }
}
