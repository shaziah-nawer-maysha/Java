class car{ //This is called the parent/Super class
    int x;
    String name;

    car(String name){
        this.name = name;
    }
}
class drive extends car{ //Child/Sub Class
    String model;

    drive(String name,String model){
        super(name);// Accessing The parent class
    }
}

class front_wheel extends car{ //Child Class

}

class Toyota extends car{

}

class RangeRover extends car{

}
class tesla extends Toyota{

}

public class inheritance {
    public static void main(String[] args) {
        car c1 = new car("JJ");
    }
}
