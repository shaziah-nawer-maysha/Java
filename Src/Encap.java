//OOP Principle
//Encapsulation
//Inheritance
//Polymorphism
//Abstraction


class Person{
    public String s1;///This is a public variable that can be used anywhere
    private int num;///This is a private variable and we can only use this inside the class
    public int id;
    String name;///This is a default access modifier
    private double cgpa;

    public double getS1(){ //This is getter function/methor

        return cgpa;
    }
    public void set(double cgpa){
        this.cgpa = cgpa;
    }

    // we can also set getter and setter easily by built in functions.

    void print(){
        System.out.println("Your output is: "+cgpa);
    }


    private void f1(){
        System.out.println("this is f1");
    }
    void f2(){
        System.out.println("f2 function");
        f1();// we can use f1 inside f2 because we can use private class inside the came class ;
    }
}



public class Encap{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.id=100;
        p1.name = "Shaziah";
        //p1.cgpa = ? so this is not going to take any input from us because this is restricted!
        //To access this we have to use getter and setter

        p1.set(20);
        System.out.println(p1.getS1());


        p1.print();
    }
}