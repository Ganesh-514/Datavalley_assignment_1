public class Main {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
