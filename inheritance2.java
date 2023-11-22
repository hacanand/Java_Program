package JavaProgram;

class Customer {

    String name;
    double bill_amount;

    public Customer(String name, double bill_amount) {
        this.name = name;
        this.bill_amount = bill_amount;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Bill Amount: " + bill_amount);
    }
}

class RegularCustomer extends Customer {

    private double discount;

    public RegularCustomer(String name, double bill_amount, double discount) {
        super(name, bill_amount);
        this.discount = discount;
        this.bill_amount = bill_amount * (1 - discount / 100);
    }

    public void display() {

        super.display();
        System.out.println("Discount: " + discount + "%");
    }
}

class PrivilegedCustomer extends Customer {

    // private String card_type;
    // private String gift;

    public PrivilegedCustomer(String name, double bill_amount, String card_type) {

        super(name, bill_amount);
        // this.gift = card_type;
        // switch (card_type) {
        // case "Platinum":
        // gift = "laptop";
        // break;
        // case "Gold":
        // gift = "smartphone";
        // break;
        // case "Silver":
        // gift = "watch";
        // break;
        // default:
        // gift = "No gift";
        // break;
        // }
        //
    }

    public void display() {

        super.display();
        // System.out.println("Card Type: " + card_type);
        System.out.println("Gift: " + "phone");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        // Customer cs = new Customer("akash", 1000);
        RegularCustomer rc = new RegularCustomer("amrit", 1000, 10);
        // PrivilegedCustomer pc = new PrivilegedCustomer("anand", 2000, "Gold");
        Customer cs = new PrivilegedCustomer("anand", 2000, "Gold");
        // cs = new RegularCustomer("ankit", 1000, 10);
        rc.display();
        // System.out.println();
        // pc.display();
        cs.display();
    }
}