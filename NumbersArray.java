import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    public static int findMax(Integer[] input) {
        int max = 0;
        for (int num : input) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static Integer[] findDuplicates(Integer[] input) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : input) {
            if (!set1.contains(num)) {
                set1.add(num);
            }
            else { // if duplicate
                if (!set2.contains(num)) {
                    set2.add(num);
                }
            }
        }
        Integer[] result = new Integer[set2.size()];
        int idx = 0;
        for (int num : set2) {
            result[idx++] = num;
        }
        return result;
    }

    public static Integer[] findUnique(Integer[] input) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : input) {
            if (set.contains(num)) {
                set.remove(num);
            }
            else {
                set.add(num);
            }
        }
        Integer[] result = new Integer[set.size()];
        int idx = 0;
        for (int num : set) {
            result[idx++] = num;
        }

        return result;
    }
    
}

