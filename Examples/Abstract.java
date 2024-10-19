package Examples;

abstract class Car {
    public abstract void driving(); 
    public abstract void Parking();
    public void playMusic(){
        System.out.println("Music....");
    }
}

abstract class Swift extends Car {
    public void driving(){
        System.out.println("Driving...");
    }
}

class updatedSwift extends Swift{ //concrete class
    public void Parking(){
        System.out.println("Automatic Reverse parking");
    }
}

public class Abstract {
    public static void main(String args[]){

        Car myCar = new updatedSwift();
        myCar.driving();
        myCar.Parking();
        myCar.playMusic();
    }
}