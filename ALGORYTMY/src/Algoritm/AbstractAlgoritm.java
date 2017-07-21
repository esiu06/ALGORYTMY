package Algoritm;

/**
 * Created by RENT on 2017-07-21.
 */
public abstract class AbstractAlgoritm {

    public AbstractAlgoritm(){
        System.out.println("Konstruktor Abstract Algoritm");// konstruktor
    }
    public abstract String getName();
    public abstract void runAlgoritm(String[] input);
}
