import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        try (Scanner scan = new Scanner(System.in)) {
            Metody.scanReader(scan, numbers);
        }

        Metody.sumNumbers(numbers);
        Metody.reverseList(numbers);

    }
}

