package Exersices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(sc.nextLine());

        Collections.reverse(numbers);
        Predicate<Integer> checkDivision = number -> number % n == 0;
        numbers.removeIf(checkDivision);
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
