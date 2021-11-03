public boolean catDog(String str) {
  int result = 0;
  int catctr = 0;
  int dogctr = 0;
        for(int i=0;i<str.length()-2;i++){
            if( str.substring(i, i+3).equals("cat") ){
                catctr++;
            }
            if( str.substring(i, i+3).equals("dog") ){
                dogctr++;
            }
        }
        return catctr == dogctr;
        
    }

