public class Sito {

       private boolean tabPierwsze[];


        public Sito(){
            this(10000);
        }
        public Sito (int n){
            tabPierwsze = new boolean[n];
        }

        public void generujSito(){
            for(int i=0; i<tabPierwsze.length; i++){
                tabPierwsze[i]=true;
            }

            for(int i =2; i<tabPierwsze.length; i++) {
                if (tabPierwsze[i]) {
                    for(int j= i+i; j<tabPierwsze.length; j=j+i){
                        tabPierwsze[j] = false;
                    }
                }
            }
    }
        public void drukujSito(){
        for(int i = 2; i< tabPierwsze.length; i++){
            if(tabPierwsze[i]){
                System.out.printf("%d ",i);
            }
        }
        }
}
