package Examples;

// class -> class (extends)
// class -> interface (implements)
// interface -> interface (extends)

interface InterfaceA{
    int age= 42; //they are default final static because 
    String name= "Vijayasri"; //they don't have memory

    void show(); //they are by default public abstract
    public abstract void config();
}

interface InterfaceB{
    void showB();
}

interface InterfaceC extends InterfaceB{ // has all the methods of InterfaceB
    void configB();
}

class classA implements InterfaceA,InterfaceC {
    public void show() {
        System.out.println("Implemented method Show");
    }
    public void config() {
        System.out.println("Implemented method Config");
    }
    public void showB() {
        System.out.println("Implemented method ShowB");    }
    public void configB() {
        System.out.println("Implemented method ConfigB");    }
}

public class Interface {
    public static void main(String[] args) {
        InterfaceA obj = new classA();
        obj.config();
        obj.show();
        System.out.println(InterfaceA.name);
        // obj.showB() cannot be used since obj of type InterfaceA

        InterfaceC obj1 = new classA();
        obj1.showB();
        obj1.configB();
    }
    
}
