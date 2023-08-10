package com.driver;

public class Main {
    public static void main(String args[])
    {
        B obj = new B();
        String str = obj.meth();
        System.out.println(str);

        B obj1 = new  B() ;
        String str1 = obj1.meth();
        System.out.println(str1);
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
            return "Method is overridden in Extendend class com.driver.Main.B";

        }
    }
    }


