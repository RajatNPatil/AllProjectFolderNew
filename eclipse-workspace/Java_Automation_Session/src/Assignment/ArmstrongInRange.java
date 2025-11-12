package Assignment;

import java.util.*;

public class ArmstrongInRange {
	
   // Method to check if a number is Armstrong
   static boolean isArmstrong(int num) {
       int original = num;
       int sum = 0;
       int digits = String.valueOf(num).length();
       while (num > 0) {
           int digit = num % 10;
           sum += Math.pow(digit, digits); // raise to the power of number of digits
           num /= 10;
       }
       return sum == original;
   }
   // Method to generate Armstrong numbers and return array
   static int[] generateArmstrong(int start, int end) {
       ArrayList<Integer> armstrongList = new ArrayList<>();
       for (int i = start; i <= end; i++) {
           if (isArmstrong(i)) {
               armstrongList.add(i);
           }
       }
       // Convert ArrayList to array
       int[] result = new int[armstrongList.size()];
       for (int i = 0; i < result.length; i++) {
           result[i] = armstrongList.get(i);
       }
       return result;
   }
   // Method to print the Armstrong numbers
   static void printArmstrongNumbers(int[] arr) {
       System.out.println("Armstrong numbers in the given range:");
       for (int num : arr) {
           System.out.print(num + " ");
       }
   }
   // Main method
   public static void main(String[] args) {
       int start = 100;  // you can change the range here
       int end = 1000;
       int armstrongNumbers[] = generateArmstrong(start, end);
       printArmstrongNumbers(armstrongNumbers);
   }
}
