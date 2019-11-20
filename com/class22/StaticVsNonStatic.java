package com.class22;

public class StaticVsNonStatic {
	// template for a students (school, name, grade)
    static String school = "Syntax";
    String name;
    char grade;
    //instance method, non static
    void getInfo() {
        System.out.println("My name is " + name + " and I am going to " 
                            + school + " and my grade is " + grade);
    }
    //static method
    static void getInfo1() {
        System.out.println("I am attending classes at "+school);
//    System.out.println("My name is "+name); //compiler will give error becasue 
//    you cannot access NON static members within STATIC methods
    }
    
    public static void main(String[] args) {
        /* accessing static members within same class
         * --> just use name for a variable
         * or call method by its name only
         */
        System.out.println(school);
        getInfo1();
    }

}
