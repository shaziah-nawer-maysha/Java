class quarbaniAnimal{
    void sound(){
        System.out.println("Make sound of an animal");
    }
}
class cow extends quarbaniAnimal{
    void sound(){
        System.out.println("Cow makes sound 'Hambaa' ");
    }
}
class goat extends quarbaniAnimal{
    void sound(){
        System.out.println("Goat makes sound ");
    }
}

class haat{
    static quarbaniAnimal buyQuarbanianimal(String option){
        if(option=="Cow") return new cow();
        if(option=="Goat") return new goat();

        return null;
    }
}




public class Practice{
    public static void main(String[] args) {
        quarbaniAnimal q1 = haat.buyQuarbanianimal("Goat");
        q1.sound();


    }
}