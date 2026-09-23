package inheritance;
class exetendingsinglelevel extends singlelevel{
    void show(){
        System.out.println("single level inheritance");
    }
}
public class singlelevel {
    public static void main(String[] args) {
        exetendingsinglelevel obj = new exetendingsinglelevel();

        obj.show();

    }

}
