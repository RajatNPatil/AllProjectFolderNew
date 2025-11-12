package Prctice01;

public class MethodOverriding {
	
	class Animal {
	    public void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void makeSound() { // Overriding the makeSound method
	        System.out.println("Dog barks");
	    }
	}
	
	class main extends Dog{
	public static void main(String[] args)
	{
		
		
		
	}
	}

}
