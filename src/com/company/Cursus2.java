package com.company;

public class Cursus2 {
    private String[] namen;
    private int teller = 0;


    public Cursus2(int maxCursisten) {
        namen = new String[maxCursisten];



    }

    public boolean schrijfCursistIn(String naam) {

        if(teller == namen.length)
            return false;


      this.namen[teller] = naam;
      teller++;

        return true;




    }

    public int getAantalCursisten() {
        return teller;

    }

    public String getCursist(int i) {
        return namen[i];

    }
}
