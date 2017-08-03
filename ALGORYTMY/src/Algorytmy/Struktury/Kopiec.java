package Algorytmy.Struktury;

public class Kopiec {
    int[] _data;
    int _counter;
    public Object sort;


    public Kopiec (int rozmiar){
        _data = new int[rozmiar];
        _counter = 0;
    }
    public void insertElement (int element){
        int i = _counter++;

        int j = Math.floorDiv((i-1),2 );

        while (i>0 && _data[j]<element ){
            _data[i] = _data[j];
            i = j;
            j = (i-1)/2;
        }

        _data[i] = element;
    }

    public void printAllElement() {
       for (int i =0; i< _data.length; i++){
           System.out.println(_data);
       }
    }
}
