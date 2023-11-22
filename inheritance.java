package JavaProgram;

class Animal {
    protected int a = 9;

    void bark() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
        super.bark();
    }
}

class TestInheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        System.out.println(d.a);

    }
}
