package bankAccount;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAdres;


    public VipCustomer(String name, double creditLimit, String emailAdres){

    }

    public VipCustomer (){
        this( "Default name", 5000, "Default@email.com");
    }
}
