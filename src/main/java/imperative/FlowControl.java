package imperative;

public class FlowControl {

    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        if (age >= 0 && age < 18) {
            System.out.println("Menor de edad");
        } else if (age >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("ERROR, valor no previsto");
        }

        String month ="February";
        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println("It's Winter");
                break;
        }

    }
}
