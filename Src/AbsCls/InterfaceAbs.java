package AbsCls;

//Inside an Interface we can have variable and method
//Inside an Interface , child class methods must have changed
//Inside an Interface variable should have Final Static (at once final Static)
//Method should always be public abstract

//We can use more than one interface for a class
class Parentclass{

}


abstract class clcontent{

}

interface Flying{
    final static String type = "Flying Animal";
    int x = 10; //This is automatically final static


    public abstract void fly();
    void nonfly(); //This is automatically public abstract
}

class Crow implements Flying{

    public void fly(){
        System.out.println("Crow is flying");
    }
    public void nonfly(){
        System.out.println("Baby crow canot fly");
    }


}

interface dive{
    final static String dive="Can dive";

    public abstract void dive();
}


class Duck implements Flying,dive{
    public void fly(){

    }
    public void nonfly(){

    }
    public void dive(){

    }
}

class human extends clcontent implements Flying,dive{
    @Override
    public void fly() {

    }

    @Override
    public void nonfly() {

    }

    @Override
    public void dive() {

    }
}



interface ParentInterface{
    void f1();
}

interface ChildInterface extends ParentInterface{
    void f2();
}

class SomeClass implements ChildInterface{
    public void f1(){

    }

    public void f2(){

    }
}







///when our Interface class is a child class of a parent class we use extends
/// //class - class - extends
/// class interface = implements
/// interface - interface = extends






public class InterfaceAbs {
    public static void main(String[] args) {
        //we can not create object of an Interface
        //But we can do subclass polymorphism

        Flying f1 = new Crow();
        f1.fly();
        f1.nonfly();


    }
}
