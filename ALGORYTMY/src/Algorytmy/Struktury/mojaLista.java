package Algorytmy.Struktury;

import javafx.beans.binding.When;

/**
 * Created by Esiu on 2017-08-05.
 */
public class mojaLista {
    Element _head; //głowa
    Element _tail; //ogon

    int counter; //licznik

    public void doPrzoduLista(mojaLista lista) {
        Element p = lista._head;

        while (p.next != null) {
            p = p.next;
        }
    }

    public Element dodajElementPoczatek(int nowyElement, mojaLista lista) {
        Element p = new Element();
        p.data = nowyElement;
        p.prev = null;
        p.next = lista._head;
        lista._head = p;
        lista.counter++;

        if (p.next != null) {
            Element nastepnik = p.next;
            nastepnik.prev = p;
        } else {
            lista._tail = p;
        }
        return p;
    }

    public void dodajElementKoniec(int nowyElement, mojaLista lista) {
        Element p = new Element();
        p.data = nowyElement;
        p.prev = lista._tail;
        p.prev = null;
        lista._tail = p;
        lista.counter++;

        if (p.prev != null) {
            Element poprzednik = p.prev;
            poprzednik.next = p;
        } else {
            lista._head = p;
        }
    }

    public void dodajElementPrzedElementem(int dodajElement, int elementPrzed, mojaLista lista) {
        Element przed = lista.dodajElementPoczatek(elementPrzed, lista);
        if (przed == lista._head) {
            lista.dodajElementPoczatek(elementPrzed, lista);
        } else {
            Element p = new Element();
            p.data = elementPrzed;
            p.prev = przed.prev;
            p.next = przed;
            Element poprzednikPrzed = przed.prev;
            poprzednikPrzed.next = p;
            lista.counter++;
        }
    }

    public void dodajElementPoElement(int dodajElement, int elementPo, mojaLista lista) {
        Element po = lista.dodajElementPoczatek(elementPo, lista);
        if (po == lista._tail) {
            lista.dodajElementKoniec(dodajElement, lista);
        } else {
            Element p = new Element();
            p.data = dodajElement;
            p.prev = po;
            p.next = po.next;
            Element nextPo = po.next;
            nextPo.prev = p;
            po.next = p;
            lista.counter++;
        }
    }

    public void kasujemyElement(int elementUsowany, mojaLista lista) {
        Element usowany = lista.dodajElementPoczatek(elementUsowany, lista);
        lista.counter--;
        if (usowany.prev != null) {
            Element poprzednikUsowanego = usowany.prev;
            poprzednikUsowanego.next = usowany.next;
        } else {
            lista._head = usowany.next;
        }
        if (usowany.next != null) {
            Element nastepnikUsowanego = usowany.next;
            nastepnikUsowanego.prev = usowany.prev;
        } else {
            lista._tail = usowany.prev;
        }
        usowany = null;
    }

    public Element dodajElementPoczatek1(int data, mojaLista lista) {
        Element p = lista._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }
    public void drukujElementy (mojaLista lista){
        Element p = lista._head;
        while (p != null){
            System.out.println(p.data);
            p= p.next;
        }
    }
}


