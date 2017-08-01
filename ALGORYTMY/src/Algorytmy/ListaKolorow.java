package Algorytmy;

import java.util.ArrayList;

public class ListaKolorow extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Lista kolowow";
    }

    @Override
    public void runAlgoritm(String[] input) {

        ArrayList<String> listaKolorow = new ArrayList<String>();
        listaKolorow.add("niebieski");
        listaKolorow.add("czarny");
        listaKolorow.add("zolty");
        listaKolorow.add("fioletowy");

        listaKolorow.add(0, "różowy");
        listaKolorow.add(listaKolorow.size(), "zielony");

        for(String element : listaKolorow){
            System.out.println(element);
        }

    }
}
