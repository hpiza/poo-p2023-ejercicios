public class Varargs {

    /*
    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }*/

    public static double average(int... array) {
        if(array.length == 0) return 0;
        double total = 0;
        for(int x : array) total += x;
        return total / array.length;
    }

    public static void main(String[] args) {
        System.out.println(average(9, 10));
        System.out.println(average(9, 10, 9));
        int[] array = {8, 9, 10, 7, 6, 9};
        System.out.println(average(array));
        System.out.println(average(9));
        System.out.println(average(9, 6, 8, 9, 5, 6, 10, 7, 8, 10));
        System.out.println(average());
    }

}
