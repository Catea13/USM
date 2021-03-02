package com.company;

public class Main {


        private String name;
        private short age;
        Main() {
            this.name = "Lorem";
            this.age = (short) 666;


            ;
        }
        Main(String name, short age){
            this.name = name;
            this.age = age;

        }
        void print () {
            System.out.println(this.age);
            System.out.println(this.name);
        }


    }

