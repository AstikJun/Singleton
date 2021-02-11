package com.company;


class MySingleTon {


    private static MySingleTon instance;

    private String value;

    private MySingleTon(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static MySingleTon getInstance(String value) {
        if (instance == null) {
            instance = new MySingleTon(value);
        }
        return instance;
    }
}


public class Main {

    public static void main(String[] args) {
       MySingleTon mySingleTon = MySingleTon.getInstance("Hello");
       MySingleTon mySingleTon2 = MySingleTon.getInstance("Goodbye");

        System.out.println(mySingleTon == mySingleTon2);

        System.out.println(mySingleTon.getValue());

        System.out.println(mySingleTon2.getValue());

    }
}
