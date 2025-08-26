class QurbaniAnimal{
    //
    void sound(){
        System.out.println("Make Sound of an animal");
    }
}

class Cow extends QurbaniAnimal{
    //
    void sound(){
        System.out.println("Cow makes Sound");
    }
}


class Goat extends QurbaniAnimal{
    //
    void sound(){
        System.out.println("Goat makes Sound");
    }


}

class Haat{
    //
    // Need subclass polymorphism to get a common return type
    // Parent class is return type, can return child class object
    static QurbaniAnimal buyQurbaniAnimal(String option)
    {
        if(option == "Cow") return new Cow();

        if(option == "Goat") return new Goat();

        return null;

    }
}

public class Subclasspol {
    //
    public static void main(String[] args) {

        QurbaniAnimal q1 = Haat.buyQurbaniAnimal("Cow");
        q1.sound();

        QurbaniAnimal q2 = Haat.buyQurbaniAnimal("Goat");
        q2.sound();

       /* QurbaniAnimal q3 = Haat.buyQurbaniAnimal("Duck");
        q3.sound(); */ // Cannot run q3.sound() as q3 is null
        //This is a intentional change :

    }
}