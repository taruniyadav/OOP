package inheritance;

class parents{
    void children(){
        System.out.println("they have two children");
    }
}
class childA extends parents{
    void study(){
        System.out.println("child A likes studying which aquired property of parents");
    }
}

class childB extends parents{
    void play(){
        System.out.println("child B likes playing hich aquired property of parents");
    }
}


public class HierarchialInheritance {
    public static void main(String[] args) {
        childA Aobj = new childA();
        childB Bobj = new childB();

        Aobj.children();
    }

}
