import Algoritm.AbstractAlgoritm;

/**
 * Created by RENT on 2017-07-20.
 */
public class Main {
    public static void main(String[] args) throws Exception {

       String algoritmName = args[0];

        AlgoritmFactory factory = new AlgoritmFactory();
        AbstractAlgoritm algoritm =
                factory.getAlgoritm(algoritmName);

        algoritm.runAlgoritm(args);

    }
}
