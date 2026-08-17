package INHERITANCE;

//single inheritance example
class animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// multilevel inheritance example
class A {
    void showA() {
        System.out.println("This is class A and it is the parent class.");
    }
}

class B extends A {
    void showB() {
        System.out.println("This is class B and it inherits from class A.");
    }
}

class C extends B {
    void showC() {
        System.out.println("This is class C and it inherits from class B.");
    }
}

// hierarchical inheritance example
class Parent {
    void showParent() {
        System.out.println("This is the parent class.");
    }
}

class Child1 extends Parent {
    void showChild1() {
        System.out.println("This is child class 1 and it inherits from the parent class.");
    }
}

class Child2 extends Parent {
    void showChild2() {
        System.out.println("This is child class 2 and it inherits from the parent class.");
    }
}

class LivingBeing {
    void sound() {
        System.out.println("Living being sound.");
    }
}

class Cat extends LivingBeing {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}

class vehicle {
    public String name;
    public String type;
    public String color;

    public vehicle(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public void start() {
        System.out.println("The " + color + " " + name + " is starting.");
    }

    public void race() {
        System.out.println("The " + color + " " + name + " is racing.");
    }

    public void stop() {
        System.out.println("The " + color + " " + name + " is stopping.");
    }
}

class car extends vehicle {
    // Constructor for the car class because it inherits from the vehicle class so
    // it needs to call the constructor of the vehicle class ,
    // in a nutshell it needs to call the constructor of the parent class vehicle to
    // initialize the properties of the car class.
    public car(String name, String type, String color) {
        super(name, type, color);
    }

    public void horn() {
        System.out.println("The " + color + " " + name + " is honking.");
    }
}

public class Main {
    public static void main(String[] args) {
        // C objC = new C();
        // objC.showA(); // inherited from class A
        // objC.showB(); // inherited from class B
        // objC.showC(); // method from class C

        // Child1 objC1 = new Child1();
        // objC1.showChild1(); // method from Child1 class

        // Child2 objC2 = new Child2();
        // objC2.showChild2(); // method from Child2 class

        // Cat kitty = new Cat();
        // kitty.sound(); // Output: Meow!

        car car1 = new car("Toyota", "Sedan", "Red");
        car car2 = new car("Honda", "SUV", "Blue");
        car1.start(); // Output: The Red Toyota is starting
        car1.horn(); // Output: The Red Toyota is honking
        car1.stop(); // Output: The Red Toyota is stopping
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        car2.start(); // Output: The Blue Honda is starting
        car2.horn(); // Output: The Blue Honda is honking
        car2.stop(); // Output: The Blue Honda is stopping
    }
}
