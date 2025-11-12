package LogicalPrograms;

public class Loops {
	
	 public static void whileLoop() {
	        int i = 1;
	        System.out.println("While Loop:");
	        while (i <= 3) {
	            System.out.println("i = " + i);
	            i++;
	        }
	    }

	    public static void doWhileLoop() {
	        int j = 1;
	        System.out.println("\nDo-While Loop:");
	        do {
	            System.out.println("j = " + j);
	            j++;
	        } while (j <= 3);
	    }

	    public static void forLoop() {
	        System.out.println("\nFor Loop:");
	        for (int k = 1; k <= 3; k++) {
	            System.out.println("k = " + k);
	        }
	    }

	    public static void forEachLoop() {
	        System.out.println("\nFor-Each Loop:");
	        String[] fruits = {"Apple", "Banana", "Cherry"};
	        for (String fruit : fruits) {
	            System.out.println("Fruit: " + fruit);
	        }
	    }

	    public static void main(String[] args) {
	        whileLoop();
	        doWhileLoop();
	        forLoop();
	        forEachLoop();
	    }

}
