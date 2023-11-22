package JavaProgram;

class account {
    String name, email;
    int ac_no, amount;

    void set(String name, String email, int ac_no, int amount) {
        this.name = name;
        this.email = email;
        this.ac_no = ac_no;
        this.amount = amount;

    }

    void get() {
        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("Account no :" + ac_no);
        System.out.println("Amount :" + amount);
    }
}

    class inherit extends account {
    

    }

    class test {
    public static void main(String[] args) {
        account obj = new account();
      
        obj.set("amrit", "anandpromax@gmail.com", 554422525, 582488);
        obj.get();
        inherit obj1 = new inherit();
        obj1.set("anand", "anannd@", 45550, 4555);
        obj1.get();
        
    }
}
