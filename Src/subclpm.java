class parent{
    int var1;
    parent(int var1) {
        this.var1 = var1;
    }
    void parentmethod(){
            System.out.println("This is parent class");
        }

}
class child extends parent{
    int var2;
    child(int var1,int var2){
        super(var1);
        this.var2=var2;
    }

    void parentmethod(){
        System.out.println("This is child class");
    }
}

class grandchild extends child{
    int var3;
    grandchild(int var1, int var2, int var3){
        super(var1,var2);
        this.var3=var3;
    }
    void parentmethod(){
        System.out.println("This is grandchild class");
    }
}

class anothergrandchild extends grandchild{
    int var4;
    anothergrandchild(int var1,int var2,int var3,int var4){
        super(var1,var2,var3);
        this.var4=var4;
    }
    void parentmethod(){
        System.out.println("This is another grand child");
    }

}
class grandc2 extends anothergrandchild{
    int var5;
    grandc2(int var1,int var2,int var3,int var4,int var5){
        super(var1,var2,var3,var4);
        this.var5=var5;
    }

    @Override
    void parentmethod() {
        System.out.println("This is grandc2");
    }
}


public class subclpm{
    public static void main(String[] args) {

        parent p1 = new parent(10);
        child c1 = new child(10,20);
        grandchild gc1 = new grandchild(10,20,30);
        anothergrandchild agc1 = new anothergrandchild(10,20,30,40);
        grandc2 agc2 = new grandc2(100,20,30,40,50);


        agc2.parentmethod();
        System.out.println(agc2.var1);




    }
}