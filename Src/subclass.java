class Student{
    String name;
    double cgpa;

    void f1(){
        System.out.println("Student method f1");
    }

    void f2(){
        System.out.println("Student method f2");
    }
}

class OOPStudent extends Student{

    void f1(){
        System.out.println("OOP Student method f1");
    }

    void f3(){
        System.out.println("OOP Student method f3");
    }

}

public class subclass {
    public static void main(String[] args) {

        Student s1 = new Student(); // Parent ref - Parent obj

        Student s2 = new OOPStudent(); /// Subclass Polymorphism - Parent ref - Child obj

        System.out.println("S1:");
        s1.f1();
        s1.f2(); // All parent class methods called
        System.out.println("******************************");

        System.out.println("S2:");
        s2.f1(); // Child class overriden method called
        s2.f2();
        //s2.f3(); // Cannot call only child class method
        System.out.println("******************************");

    }
}