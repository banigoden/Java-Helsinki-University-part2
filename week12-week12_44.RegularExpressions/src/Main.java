
import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String read = scanner.nextLine();
        Main.clockTime(read);
    }

    public static boolean isAWeekDay(String string) {
        String weeks = "mon|tue|wed|thu|fri|sat|sun";

        if (string.matches(weeks)) {
            System.out.println("The form is fine.");
            return true;

        } else {
            System.out.println("The form is wrong.");
            return false;
        }
    }

    public static boolean allVowels(String string) {

        String vowes = "[aeiouäö]*";
        if (string.matches(vowes)) {
            System.out.println("The form is fine.");
            return true;

        } else {
            System.out.println("The form is wrong.");
            return false;
        }
    }

    public static boolean clockTime(String string) {
        if(string.matches("(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")){
        //if (string.matches("\\d\\d:\\d\\d:\\d\\d")) {
          //  String[] hms = string.split(":");
            System.out.println("The form is fine.");

//            return (Integer.parseInt(hms[0]) <= 23 &&
//                    Integer.parseInt(hms[0]) <= 59 &&
//                    Integer.parseInt(hms[0]) <= 59);
return true;
        } else {
            System.out.println("The form is wrong.");
            return false;
        }
    }
}
