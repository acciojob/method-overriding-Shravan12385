package com.driver;

public class Main {
    public static void main(String args[])
    {
        B obj = new B();
        obj.meth();


        B obj1 = new  B() ;
        obj1.meth();

    }
    public static class A{

        public static String meth()
        {
            return "Invoking method from class com.driver.Main.A";
        }
    }
    public  static class B extends A{
        public static String meth()
        {
            return "Method is overridden in Extended class com.driver.Main.B";

        }
    }
    }


