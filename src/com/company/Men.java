package com.company;

public class Men extends Main {

    boolean orientatian;
    double money;

    public Men(boolean orientatian, double money) {
        this.orientatian = orientatian;
        this.money = money;
    }

    public Men(String name, short age, boolean orientatian, double money) {
        super(name, age);
        this.orientatian = true;
        this.money = 355.00;
    }

    public Men() {
    }


        void print () {
            System.out.println(orientatian);
            System.out.println(money);
            super.print();
        }
        void drive(){
        if(money<50){
            System.out.println("Nu aveti bani pentru drive");
        }
        else{
            System.out.println("Aveti bani pentru drive");
        }
        }
    }


