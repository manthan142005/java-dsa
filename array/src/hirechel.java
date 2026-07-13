class A{
    void man(){
        System.out.println("class A");
    }
}

class B extends  A{
    void jaan(){
        System.out.println("class B");
    }
}
class c extends B{
    void mandd(){
        System.out.println("class C");
    }
}
public class hirechel {
    public static void main(String[]args){
        A obj=new A();
        B obj1 = new B();
        obj.man();
        obj1.jaan();

    }
}
