package Examples;
class classA{
    public void show(){
        System.out.println("Class A");
    }
}

abstract class classB{
    public abstract void show();
    public abstract void config();
}

public class AbstractAnonymous {
    public static void main(String[] args) {

        classA objA =new classA(){
            public void show(){
                System.out.println("anonymous method using Class A");
            }
        };

        classB objB =new classB(){
            public void show(){
                System.out.println("anonymous method using Abstract classB");
            }
            public void config(){
                System.out.println("anonymous method using Abstract classB");
            }
        };

        objA.show();
        objB.show();
        objB.config();
        
    }
    
}
