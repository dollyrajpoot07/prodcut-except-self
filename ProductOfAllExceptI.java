import java.util.*;

class ProductOfAllExceptI {
    public static int product(int ar[], int n) {
        int result = 1;
        for (int i = 0; i < n; i++)
            result = result * ar[i];
            System.out.println("result: " + result + " ");
        return result;
    }

    public static int[] productOfAllExceptI(int[] array, int size) {
        int result = product(array,size);
        int[] newArr = new int[size];
        for(int i = 0; i < size; i++) {
            newArr[i] = result / array[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // for(int j = 0; j < size; j++) {
        //     System.out.print(array[j] + " ");
        // }
        int[] result = productOfAllExceptI(array, size);
        for(int k = 0; k < size; k++) {
            System.out.print(result[k] + " ");
        }
        sc.close();
    }
}

// multiply it all and then divya it by x[i]