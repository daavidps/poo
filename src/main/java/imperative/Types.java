package imperative;

import java.util.Arrays;

public class Types {
    public static void main(String[] args) {

        byte minValue = 0b0101_0101; // enteros
        short twoBytes = 0x1fff;
        int age = 0;
        long creditCard = 1234_1234_1234_1234L;

        float decimal = 0.34F;
        double bigger = 3.4E-8;

        boolean flag = true;

        char character = 'a';
        final char UNICODE_VALUE = '\u1234';  // constante

        String name = "My name is...";  // Class

        System.out.println("minValue: " + minValue);
        System.out.println("twoBytes: " + twoBytes);
        System.out.println("age: " + age);
        System.out.println("creditCard: " + creditCard);
        System.out.println("decimal: " + decimal);
        System.out.println("bigger: " + bigger);
        System.out.println("flag: " + flag);
        System.out.println("character: " + character);
        System.out.println("UNICODE: " + UNICODE_VALUE);
        System.out.println("name: " + name);

        int[] values = {1, 2, 3};
        System.out.println("values: " + values);
        System.out.println("values length: " + values.length);
        System.out.println("values: " + Arrays.toString(values));

        String[] items = new String[10];
        items[3] = "third";
        System.out.println("items: " + Arrays.toString(items));

        byte byteValue = 10;
        int intValue = 1000;
        byteValue = (byte) intValue;
        intValue = byteValue;
    }
}
