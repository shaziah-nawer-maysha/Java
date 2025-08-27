//Encapsulation- it is used to protect some sort of data or information

class encap{
    int x;
    static int y;
    private int info;

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }
}



public class Encapsulation {
    public static void main(String[] args) {
        encap e1 = new encap();
        e1.setInfo(100);
        System.out.println(e1.getInfo());
    }
}
