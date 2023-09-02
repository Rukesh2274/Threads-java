package threadl;

import java.util.HashSet;

public class FirstRepeatedElement {

    public static int findFirstRepeatedElement(int[] arr, int n) 
    {

        HashSet<Integer> set = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) 
        {
            if (set.contains(arr[i])) 
            {
                return arr[i];
            } 
            else 
            {
                set.add(arr[i]);
            }
        }

        return arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 2, 8};
        int n = arr.length;

        int firstRepeatedElement = findFirstRepeatedElement(arr, n);

        System.out.println("The first repeated element in the array from the tail is: " + firstRepeatedElement);
    }
}