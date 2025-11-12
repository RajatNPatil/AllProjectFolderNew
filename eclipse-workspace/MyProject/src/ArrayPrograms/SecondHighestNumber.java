package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

public class SecondHighestNumber {

        public static void main(String[] args) {
            int a[] = {3, 4, 2, 3, 1, 5, 6, 7, 7};

            // 1. Remove duplicates using LinkedHashSet to maintain insertion order
            
            LinkedHashSet<Integer> distinctNumbers = new LinkedHashSet<>();
            for (int num : a) {
                distinctNumbers.add(num);
            }

            // 2. Convert to ArrayList and sort in descending order
            
            List<Integer> sortedList = new ArrayList<>(distinctNumbers);
            Collections.sort(sortedList, Collections.reverseOrder());

            // 3. Check if there are at least two distinct numbers
            
            if (sortedList.size() >= 2) {
                int secondHighest = sortedList.get(1);
                System.out.println("The second highest number is: " + secondHighest);
            } else {
                System.out.println("Cannot find the second highest number (less than two distinct numbers).");
            }
        }
    }


