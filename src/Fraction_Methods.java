import java.util.InputMismatchException;
import java.util.Scanner;


public class Fraction_Methods {

    private int whole;
    private int denominator;
    private int numerator;
    private int reminder;
    private int answer;
    private Scanner sc = new Scanner(System.in);


    void MixToImproperFaction(){
        try{
                System.out.println("What is the whole number of your fraction ?");
                whole = sc.nextInt();
                System.out.println("What is the denominator of your fraction ?");
                denominator = sc.nextInt();
                System.out.println("What is the numerator of your fraction ?");
                numerator = sc.nextInt();
                answer = (whole*denominator)+numerator;
                System.out.printf("you entered %d and %d and then %d and the answer is "+answer+"/"+numerator,whole,denominator,numerator);

        }catch (InputMismatchException e){
            System.out.println("You entered something wrong");
        }
    }


    void ImproperToMixFraction (){

     try{

        System.out.println("What is the numerator ? ");
        numerator = sc.nextInt();
        System.out.println("What is the denominator ?");
        denominator = sc.nextInt();
        reminder = (numerator%denominator);
        System.out.println("The answer is "+numerator/denominator+" "+reminder+"/"+denominator);

     }catch (InputMismatchException e){
         System.out.println("You entered something wrong");
     }
    }



    void MultiplyingFractions(){
        System.out.println("Enter the first fractions, numeration first and then denominator: ");
        numerator = sc.nextInt();
        denominator = sc.nextInt();
        System.out.println("Enter the second fractions numerator first: ");
        int numeratorTwo = sc.nextInt();
        int denominatorTwo = sc.nextInt();



    }







}
