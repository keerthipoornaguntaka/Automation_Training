package com.ft.constructors;

public class Test {

    int a;

    public Test(){
        System.out.println(a);
        System.out.println("Automation Testing");
    }

    public Test(int a){
        System.out.println(a);
        System.out.println("Automation Testing");
    }

    public Test(int a, int b){
        System.out.println(a+b);
        System.out.println("Automation Testing");
    }


    public static void main(String[] args) {
        Test test = new Test(5);
        Test test1 = new Test(5, 5);
    }

    public String testAuto(){
        return "Selenium";
    }
}