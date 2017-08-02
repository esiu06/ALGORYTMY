package Algorytmy;

public class NaszeDrzewo extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Nasze drzewo";
    }

    String _tree[];
    int _level;
    int _height;
    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 1;
        getLevel(n);
        _tree = new String[n];

        int i;
        for (i=0; i<n; i++){
            _tree[i] = input[i+1];
        }
        System.out.println();
        System.out.printf("Poziom drzewa: %d\n", _level);
        System.out.println();
        System.out.printf("Wysokość drzewa: %d\n", _height);
        System.out.println();
        System.out.printf("Korzeniem jest: %s\n", _tree[0]);
        System.out.println();

        for(int j=0; j<_tree.length; j++){
            String elementLewy = "";
            String element = "";
            try{
                element = _tree[j];
                elementLewy = _tree[2*j+1];
            }
            catch (Exception ex){
                System.out.println("Element " + element+ " jest liściem\n");
            }
        }
        getSons("A");
        getSons("E");
    }

    private void getLevel(int n) {
        int currentSize = 0;
        int iterator = 0;
        while (currentSize < n) {
            currentSize = currentSize + (int) Math.pow(2d, (double) iterator);
            iterator++;
        }
        _level = _height = iterator-1;

    }
    private void  getSons(String father){
        int i = 0;
        for(i = 0; i< _tree.length; i++){
            if (_tree[i].equals(father))
                break;
        }
        try{
            System.out.printf("Lewym synem " + "elementu %s jest: %s\n",
                    _tree[i], _tree[2*i+1]);
            System.out.println();
            System.out.printf("Prawym synem " + "elementu %s jest: %s\n",
                    _tree[i], _tree[2*i+2]);
            System.out.println();
        }
        catch (Exception ex){
            System.out.printf("Element %s nie posiada syna", _tree[i]);
            System.out.println();
        }
    }
}
