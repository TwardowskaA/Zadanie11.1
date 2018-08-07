import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Metody {

    static void sumNumbers(List<Double> numbers) {
        StringBuilder sb = new StringBuilder();
        double sum = 0;
        for (double i : numbers) {
            sb.append(i);
            sb.append('+');
            sum = sum + i;
        }
        sb.replace(sb.length() - 1, sb.length(), "=");
        sb.append(sum);
        System.out.println(sb.toString());
    }

    static void scanReader(Scanner scan, List<Double> numbers) {
        System.out.println("Podaj liczby:");
        double x = scan.nextDouble();
        while (!(x < 0)) {
            numbers.add(x);
            x = scan.nextDouble();
        }
    }

    static void reverseList(List<Double> numbers) {
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}



