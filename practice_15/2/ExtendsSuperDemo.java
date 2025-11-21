import java.util.*;

public class ExtendsSuperDemo {
    public static void main(String[] args) {

        // ======== ? extends Number ========
        List<? extends Number> nums = List.of(1, 2, 3);
        Number n = nums.get(0);   // ок
        // nums.add(10);           // нельзя добавлять


        // ======== ? super Integer ========
        List<? super Integer> sup = new ArrayList<Number>();
        sup.add(10);              // ок - Integer можно добавлять
        sup.add(20);
        Object obj = sup.get(0);  // ок, но только Object


        // ======== использование в методах ========
        printExtends(nums);
        printSuper(sup);
    }

    static void printExtends(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println("extends: " + n);
        }
    }

    static void printSuper(List<? super Integer> list) {
        list.add(999);
        System.out.println("super added");
    }
}