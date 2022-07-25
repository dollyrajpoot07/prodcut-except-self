// Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in 
// the original array except the one at i. For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
// If our input was [3, 2, 1], the expected output would be [2, 3, 6]. Follow-up: what if you can't use division?

import java.util.*;

class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] opArray = new int[n];
        opArray[0] = 1;
        for (int i = 1; i < n; i++) {
            opArray[i] = nums[i - 1] * opArray[i - 1];
        }
        System.out.println(Arrays.toString(opArray));
        int multProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            opArray[i] = multProduct * opArray[i];
            multProduct = multProduct * nums[i];
            System.out.println("opArray: " + opArray[i] + ", " + "multProduct " + multProduct);
        }
        return opArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // for(int j = 0; j < size; j++) {
        // System.out.print(array[j] + " ");
        // }
        int[] result = productExceptSelf(array);
        for (int k = 0; k < size; k++) {
            System.out.print(result[k] + " ");
        }
        sc.close();
    }
}