import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
  //Рекурсивно найти n-ое число Фибоначчи. Определить сложность.fn(n - 1) + fn(n - 2)
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input any number -> ");
        int position = sc.nextInt();
        AtomicInteger counter = new AtomicInteger(0);
        System.out.println(FindFibonachi(position, counter));
        System.out.println("counter - " + counter.get());
    }

    public static int FindFibonachi(int position, AtomicInteger counter){
        counter.incrementAndGet();
        if(position == 1 || position == 2){
            return 1;
        }
        return FindFibonachi(position - 1,counter) + FindFibonachi(position- 2,counter);
    }
}
