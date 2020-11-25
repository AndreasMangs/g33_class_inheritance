package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        A object = new A();
        object.foo();

        B objectB = new B();
        objectB.foo();

        Lion simba = new Lion();
        simba.makeASound();

    }
}

//Super-class of B
class A {

    public void foo() {
        System.out.println("I'm in A");
    }


}

//Sub-class of A and Super-class of C
class B extends A {
    public void foo() {
        System.out.println("I'm in B");
    }
}

//Sub-class of B
class C extends B {

}

//Animal
class Animal {
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void makeASound (){
        System.out.println("Sound is unspecified");
    }

    public Animal foo(){
        return null;
    }
}




//Cats
class Feline extends Animal {

}

class Tiger extends Feline {

}

class Lion extends Feline {
    @Override
    public void makeASound(){
        System.out.println("The Lion roars");
    }

    @Override
    public Animal foo(){
        return null;
    }
}

//Dogs
class Canine extends Animal {

}

class Dog extends Canine {
    private int legs;
    private int tail;
    private int teeth;

}

class Wolf extends Canine {

}

//class Mammal extends Animal {}