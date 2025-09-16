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
    //If we don't want to override the method we must declare Dog as an Abstract class
    //Abstract class in non abstract method is not allowed
    public void eat(){
        System.out.println("The dog is eating");
    }


}


//class A{
//    abstract void print(){
//        System.out.println("We can not use abstract method in a non abstract class");
//    }
//}

abstract class Bird extends animal{
    Bird(String name){
        super(name);
    }


    abstract void sleep();
}

class Eagle extends Bird{
    Eagle(String name){
        super(name);
    }

    public void eat(){

    }
    public void sleep(){

    }
}



abstract class Insect extends animal{
    public Insect(String name){
        super(name);
    }
    public void eat(){
        System.out.println("Eagle eating");
    }
    public abstract void crawl();
}

class spider extends Insect{
    public spider(String name){
        super(name);
    }

    public void crawl(){
        System.out.println("Spider Is crawling");
    }
}




public class BasicAbs {
    public static void main(String[] args) {
        animal a1 = new Dog("Scooby");
        a1.smail();


    }
}
