import java.util.Arrays;

public class ArraysMethodsDemo {

    public static void main(String[] args) {

        int[] arr1 = {5, 2, 9, 1};
        int[] arr2 = {5, 2, 9, 1};
        int[] arr3 = {1, 2, 5, 9};

        // 1. Arrays.toString(...)
        System.out.println("toString: " + Arrays.toString(arr1));

        // 2. Arrays.sort(...)
        Arrays.sort(arr1);
        System.out.println("after sort: " + Arrays.toString(arr1));

        // 3. Arrays.binarySearch(...)
        int pos = Arrays.binarySearch(arr1, 5);
        System.out.println("binarySearch(5): " + pos);

        // 4. Arrays.equals(...)
        System.out.println("arr1 equals arr2: " + Arrays.equals(arr1, arr2));
        System.out.println("arr1 equals arr3: " + Arrays.equals(arr1, arr3));

        // 5. Arrays.compare(...)
        int cmp12 = Arrays.compare(arr1, arr2);
        int cmp13 = Arrays.compare(arr1, arr3);

        System.out.println("compare(arr1, arr2): " + cmp12);
        System.out.println("compare(arr1, arr3): " + cmp13);
    }
}