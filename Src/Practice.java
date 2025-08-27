class Shahanaz{
    void type(){
        System.out.println("White");
    }
}
class shaziah extends Shahanaz{
    void type(){
        System.out.println("Black");
    }
}
class tona extends shaziah{
    void type(){
        System.out.println("White");
    }
}


public class Practice{
    public static void main(String[] args) {
        Shahanaz s1 = new Shahanaz();
        shaziah sz1 = new shaziah();
        tona t1 = new tona();

        t1.type();
    }

}