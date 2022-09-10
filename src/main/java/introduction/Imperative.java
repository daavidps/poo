package introduction;

import java.time.LocalDateTime;

public class Imperative {
    public static void main(String[] args) {
        System.out.println("POO");

        final int MIDDAY = 12;
        final String NAME = "Jesús";
        System.out.println("POO");
        if (LocalDateTime.now().getHour() < MIDDAY) {
            System.out.println("Buenos días " + NAME + "!");
        } else {
            System.out.println("Buenas tardes " + NAME + "!");
        }

        final int[] list = {0, 1, 2, 3};
        int accumulator = 0;
        for (int i = 0; i < 4; i++) {
            accumulator += list[i];
        }
        System.out.println("Suma (for i): " + accumulator);
        accumulator = 0;
        for (int item: list) {
            accumulator += item;
        }
        System.out.println("Suma (for each): " + accumulator);
    }
}
