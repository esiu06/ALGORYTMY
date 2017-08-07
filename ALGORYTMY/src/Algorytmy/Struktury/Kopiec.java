package Algorytmy.Struktury;

public class Kopiec {
    int[] _data;
    int _counter;

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
    public int getAmountOfElements() {
        return _counter;
    }


    public int deleteElement () {
        int korzen = -1;
        int ostatniEl = -1;
        int j = 0;
        int i = 0;

        if(_counter-->0){
            korzen = _data[0];
            ostatniEl = _data[_counter];
            i = 0;
            j = 1;
            while(j< _counter){
                if(j + 1 < _counter && _data[j + 1] > _data[j]){
                    j = j +1;
                }
                if (ostatniEl >= _data[j])
                    break;

                _data[i ]= _data[j];
                i = j;
                j = 2*j+1;

            }

            _data [i] = ostatniEl;

        }

        return korzen;
    }
}
