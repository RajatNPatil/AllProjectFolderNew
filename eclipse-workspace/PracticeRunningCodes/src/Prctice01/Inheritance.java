package Prctice01;
	
	class Animal {
	    String name;
	    public void eat() {
	        System.out.println("Animal is eating");
	    }
	}

	class Dog extends Animal {
	    public void bark() {
	        System.out.println("Dog is barking");
	        
	        Animal a= new Animal();
	        Dog g= new Dog();
	        Dog g1= new Animal();
	        Animal a1= new Dog();
	        
	    }
	}

	public class Inheritance {
	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        myDog.name = "Buddy";
	        System.out.println(myDog.name); // Accessing inherited attribute
	        myDog.eat(); // Accessing inherited method
	        myDog.bark(); // Accessing child's method
	    }
	}


