package AbsCls;
//Abstract class
//Interface class
//Imagination - Abstraction Idea -
//Giving child class some restriction thet they must obey !
//Enforcing child to do something
//Abstract - Partial Abstraction (Normal + abstraction)
//Interface - complete Abstraction ( Child Must obey )


abstract class animal{
    //What can be added in abstract Class
    //Any kind of variable
    //Constructor
    //complete method
    //Abstract method ( A method which has no body ) //Child class must override abstract method
    String name;
    animal(String name){
        this.name = name;

    }
    //Complete / normal method
    public void smail(){
        System.out.println("Smiling happily ");
    }
    //Abstract Method
    public abstract void eat();
}

class Dog extends animal{
    Dog(String name){
        super(name);

    }
    public void eat(){
        System.out.println("The dog is eating");
    }
}


public class BasicAbs {
    public static void main(String[] args) {

    }
}
