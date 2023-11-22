package JavaProgram;

class Customer {
    private int customerid;
    private String customername;
    private int counter = 1000;

    public Customer(int customerid, String customername) {
        this.customerid = customerid;
        this.customername = customername;
    }

    public void displayinfo() {
        customerid = counter++;
        System.out.println("customer id is" + customerid);
        System.out.println("customer name is" + customername);
    }

}

class Regular extends Customer {
    private float discount;

    public Regular(int customerid, String customername, float discount) {
        super(customerid, customername);
        this.discount = discount;
    }

    public void displayinfo() {
        super.displayinfo();
        System.out.println("discount=" + discount);
    }

}

class privileged extends Customer {
    private String mebtype;

    public privileged(int customerid, String customername, String mebtype) {
        super(customerid, customername);
        this.mebtype = mebtype;
    }

    public void displayinfo() {
        super.displayinfo();
        System.out.println("Membership type:" + mebtype);
    }
}

class inheritance_new {

    public static void main(String[] args) {
        Customer rc = null;
        if (args[0].equalsIgnoreCase("Regular")) {
            rc = new Regular(1000, "dfsf", 12);
        }
        if (args[0].equalsIgnoreCase("Privileged")) {
            rc = new privileged(2000, "Jane Smith", "Gold");
        }

        rc.displayinfo();

    }

}
