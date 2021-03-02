package com.company;

public class Women extends Main {
    float beauty;
    byte goodness;

    public Women() {
    }

    public Women(String name, short age, byte goodness,float beauty) {

        super(name, age);
        this.goodness = 1;
        this.beauty=8.f;
    }
    void print(){
        System.out.println(beauty);
        System.out.println(goodness);
        System.out.println(beauty);
    }
    void cosmetica(int cosm) {
        if (cosm > 80){
            beauty++ ;
            if(cosm<80){
                beauty--;
            }
    }

    }

}
