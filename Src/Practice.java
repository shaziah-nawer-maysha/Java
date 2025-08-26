class OOP{
    void f1(){
        System.out.println("Hello This is main class OOP f1 ");
    }
    void f2(){
        System.out.println("Hello This is main class oop f2");
    }
}

class OOPStudents extends OOP{
    void f1(){
        System.out.println("This is student class f1");
    }
    void f2(){
        System.out.println("This is student class f2 ");
    }
}

public class Practice{
    public static void main(String[] args) {
        OOP o1 = new OOPStudents();
        o1.f1();//This should print the child class :

        OOP o2 = new OOP();
        o2.f1(); //This should print the student class :
    }
}