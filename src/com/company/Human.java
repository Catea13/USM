package com.company;

public class Human {
    public static void main(String[] args) {
        Main[] main = new Main[6];
        for (int i = 0; i < main.length; i = i + 2) {
            main[i] = new Men();
            main[i + 1] = new Women();
            System.out.println(main.toString());
        }
        // Main main=new Main();
        // main.print();;
        Men men = new Men();
        men.drive();
        men.print();
        Women women = new Women();
        women.cosmetica(100);
        women.print();
        Main Alex = new Men();
        Alex.print();
        ((Men) Alex).drive();
        Women Ana = new Women();
        ((Women) Ana).cosmetica(50);
        for (int i = 0; i < main.length; i++)
            if (main[i] instanceof Men)
                ((Men) main[i]).print();

    }
}

    /**De descris clasa personaj cu campuri (nume,sex,expereenta,forta,viata)de descris constructor implicit,cu
parametre si me toda print ,mostenit clase:Human,Wierk,lef,gnom,fiecare clasa mostenita trebuie sa aiba cel putin camp si metoda proprie ,consreucro implicit,constructor cu parametre,metoda print de form saluatare In metoda main plasata in clasa MAIN DE creat
     vextor de 8 personaje si completat cu obiectele tutoriei clasei mostemite,pentru fiecre clasa mostenita de descis
     for proprie care gaseste obiecteke clasei datele si cheama metodele clasei,dupa asta de afisat continut vectorul**/