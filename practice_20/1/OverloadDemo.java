class MathUtil {

    public int square(int x) {
        return x * x;
    }

    public double square(double x) {
        return x * x;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, int b) {
        return a + b;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        MathUtil util = new MathUtil();

        System.out.println(util.square(5));        // вызывает square(int)
        System.out.println(util.square(3.14));     // вызывает square(double)
        System.out.println(util.sum(1, 2));        // sum(int,int)
        System.out.println(util.sum(1, 2, 3));     // sum(int,int,int)
        System.out.println(util.sum(2.5, 3));      // sum(double,int)
    }
}
