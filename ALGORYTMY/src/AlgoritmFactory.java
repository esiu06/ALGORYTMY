import Algoritm.AbstractAlgoritm;
import Algoritm.BiednyCamelCase;
import Algoritm.Test;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgoritmFactory {
    public AbstractAlgoritm getAlgoritm(String name) throws Exception {
        switch (name.toLowerCase()){
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
                default:
                    throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
