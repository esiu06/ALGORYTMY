package Algorytmy;

import Algorytmy.Struktury.Kopiec;
import Algorytmy.Struktury.TestowanieKopca;
import Algorytmy.Struktury.TestowanieListy;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgoritmFactory {
    public AbstractAlgoritm getAlgoritm(String name) throws Exception {
        switch (name.toLowerCase()){



            case "sumaliczb":
                return new SumaLiczb();
            case "wyplata":
                return new Wypłata();


            case "silnia2":
                return new SumaLiczb2();
            case "silnia3":
                return new Silnia3();
            case "ciagfibonacciego":
                return new CiagFibonacciego();

            case "sortowanie":
                return new Sortowanie();
            case "najwiekszywspolnydzielnik":
                return new NajwiekszyWspolnyDzielnik();

            case "prostetablice":
                return new ProsteTablice();
            case "prostetablice2":
                return new ProsteTablice2();
            case "statki":
                return new Statki();

            case "dominata":
                return new Dominata();

            case "zad1":
                return new Zad1();
            case "zad2":
                return new Zad2();
            case "testowanielisty":
                return new TestowanieListy();
            case "listakolorow":
                return new ListaKolorow();
            case "naszedrzewo":
                return new NaszeDrzewo();
            case "kopiec":
                return new TestowanieKopca();

            case "onp":
                return new OdwrotnaNotacjaPolska();
            case "zadanie1":
                return new Zadanie1();
            case "zadanie2":
                return new Zadanie2();
            case "zadanie4":
                return new Zadanie4();
            case"notacja2":
                return new Notacja2();
            case "nww":
                return new Nww();

                default:
                    throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}

