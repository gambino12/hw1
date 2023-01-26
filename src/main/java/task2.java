import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
//Найти n-ое число Фибоначчи за O(n).
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input any number -> ");
        int position = sc.nextInt();
        AtomicInteger counter = new AtomicInteger(0);
        System.out.println(FindFibonachi(position, counter));
        System.out.println("counter - " + counter.get());
    }

    public static int FindFibonachi(int position, AtomicInteger counter) {
        if (position == 1 || position == 2) {
            return 1;
        }
            int fib1 = 1;
            int fib2 = 0;
            int temp;
            for (int i = 0; i < position; i++) {
                counter.incrementAndGet();
                temp = fib1;
                fib1 = fib1 + fib2;
                fib2 = temp;
            }
            return fib2;

    }
}
