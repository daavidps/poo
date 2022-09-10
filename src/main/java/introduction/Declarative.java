package introduction;

import java.util.Arrays;

public class Declarative {
    public static void main(String[] args) {

        final int[] list = {0, 1, 2, 3};
        int sum = Arrays.stream(list)
                .sum();
        System.out.println("Suma: " + sum);

        int max = Arrays.stream(list)
                .max()
                .orElse(-1);
        System.out.println("Maximo: " + max);
    }
}
