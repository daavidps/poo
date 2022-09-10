package introduction;

import java.time.LocalDateTime;

public class Imperative {
    public static void main(String[] args) {
        final int MIDDAY = 12;
        final String NAME = "Jesús";

        System.out.println("POO");
        if (LocalDateTime.now().getHour() < MIDDAY) {
            System.out.println("Buenos días " + NAME + "!");
        } else {
            System.out.println("Buenas tardes " + NAME + "!");
        }
    }
}
