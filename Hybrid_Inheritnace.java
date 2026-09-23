

package inheritance;


class Vehicle{
    public void Type(){
        System.out.print("The type of Vehicle is:");
    }
}

class Bike extends Vehicle{
    public void Type1(){
        System.out.println("Bike");
    }
}

class ElectricBike extends Vehicle implements Fare{
    @Override
    public void Charge(){
        System.out.println("The Charge is based on the consumption of electricity");
    }
}


public class HybridInheritance  {

    public static void main(String[] args) {

        Bike bobj = new Bike();
        bobj.Type1();


        ElectricBike obj = new ElectricBike();
        obj.Charge();
    }
}
