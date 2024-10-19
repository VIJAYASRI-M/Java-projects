package Examples;

// enum is a class but cannot extend but can have constructors
enum EnumVariables {
    COMPLETED,PENDING,NOT_STARTED;
}

enum Laptop{
    MacBook("90k"),Acer("60k"),AsusRog("120k"),lenovo();
    private String price;

    private Laptop(String price) {
        this.price = price;
    }
    private Laptop() {
        price="50k";
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}

public class Enum {
    public static void main(String[] args) {
        EnumVariables status = EnumVariables.COMPLETED;
        EnumVariables[] statuses =EnumVariables.values();

        System.out.println(status);
        for(EnumVariables E: statuses){
            System.out.println(E +" "+ E.ordinal());
        }

        Laptop[] Laptops =Laptop.values();
        for(Laptop Laptop:Laptops){
            System.out.println(Laptop+" "+ Laptop.getPrice());
        }

        //Enum supports if and switch
        if(status == EnumVariables.PENDING){
            System.out.println("pending");
        }

        switch (status) {
            case COMPLETED:
                System.out.println("Completed");
                break;
            case NOT_STARTED:
                System.out.println("Not Started");
                break;
            case PENDING:
                System.out.println("Pending");
                break;
            default:
                break;
        }
        
    }
    
}