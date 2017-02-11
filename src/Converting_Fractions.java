import java.util.Scanner;

public class Converting_Fractions {


    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        Fraction_Methods task = new Fraction_Methods();

        String userChoice;

        System.out.println("Welcome to the fraction conversion software.");
        System.out.println("Here are a few things you can do: ..... A - Convert  Mix fraction to a improper fraction ");
        System.out.println("B - Convert improper fraction to mix fraction. C - Multiply Fractions.");
        System.out.println();
        System.out.println("What would you like to do ? ");
        userChoice = sc.nextLine().toLowerCase();


        switch (userChoice) {
            case "a":
                task.MixToImproperFaction();
                break;
            case "b":
                task.ImproperToMixFraction();
                break;
            case "c":
                break;
        }

    }

}
