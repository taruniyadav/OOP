package inheritance;

class vehicle{
    vehicle(){
        System.out.println("this is a vehicle in multilevel inheritance");
    }
}

class twowheeler extends vehicle{
    twowheeler(){
        System.out.println("this is twowheeler extending the vehicle class");
    }
}

class bike extends twowheeler{
    bike(){
        System.out.println("this is a bike extending the twowheeler");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        bike obj = new bike();
        
    }
}
