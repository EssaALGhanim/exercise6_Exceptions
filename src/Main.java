import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      /*  //Ex1

        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

try {
    System.out.println("Input first number: ");
    firstNumber = scanner.nextInt();
    System.out.println("Input second number: ");
    secondNumber = scanner.nextInt();
} catch (InputMismatchException e){
    flag = false;
    System.out.println("Error: enter integers only");
} catch (Exception e) {
    flag = false;
    System.out.println(e.getMessage());
}
        if (flag) {
            System.out.println(firstNumber + " + " + secondNumber+ " = " + (firstNumber + secondNumber));
            System.out.println(firstNumber + " - " + secondNumber+ " = " + (firstNumber - secondNumber));
            System.out.println(firstNumber + " x " + secondNumber+ " = " + (firstNumber * secondNumber));
            System.out.println(firstNumber + " / " + secondNumber+ " = " + (firstNumber / secondNumber));
            System.out.println(firstNumber + " mod " + secondNumber+ " = " + (firstNumber % secondNumber));
        }*/


       /* //Ex2
        Scanner input = new Scanner(System.in);
        int number = 0;

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        try{
        System.out.println("Input a number: ");
        number = input.nextInt();
        }catch (InputMismatchException e){
            flag = false;
            System.out.println("Enter an integer");
        } catch (Exception e){
            flag = false;
            System.out.println(e.getMessage());
        }

        if(flag){
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }*/

 /*       //Ex3


        Scanner input = new Scanner(System.in);

        double radius = 0;

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        System.out.print("Radius = ");
        try {
            radius = input.nextDouble();
        } catch (InputMismatchException e) {
            flag = false;
            System.out.println("Enter a number");
        }
        if (flag) {
            System.out.println("Perimeter is = " + (2 * Math.PI * radius));
            System.out.println("Area = " + Math.PI * radius * radius);
        }
*/


 /*       //Ex4

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the count of numbers: ");
        int count = 0;
        double sum = 0;
        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        try {
            count = input.nextInt();
            for (int i = 0; i < count; i++) {
                System.out.println("Enter an integer: ");
                int integer = input.nextInt();
                sum += integer;
            }
        }catch (InputMismatchException e){
            flag = false;
            System.out.println("Error: Enter a number only");
        } catch (Exception e) {
            flag = false;
            System.out.println(e.getMessage());
        }

        if (flag) {
            System.out.println("the average is: " + sum/count);
        }
*/

/*
       //Ex5
        Scanner input = new Scanner(System.in);

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;
        int num1 = 0,  num2 = 0, num3 = 0;
        try {
            System.out.print("Input the first number: ");
            num1 = input.nextInt();
            System.out.print("Input the second number: ");
            num2 = input.nextInt();
            System.out.print("Input the third number: ");
            num3 = input.nextInt();
        }catch (InputMismatchException e){
            flag = false;
            System.out.println("Error: Enter integers only");
        } catch (Exception e) {
            flag = false;
            System.out.println(e.getMessage());
        }

        if (flag) {
            if (num1 + num2 == num3) {
                System.out.println("The result is: true");
            }
            else {
                System.out.println("The result is: false");
            }
        }
*/


     /*   //Ex6
        Scanner input = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = input.nextLine();

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        try {
            checkEmptySpaces(word);

        } catch (Exception e) {
            flag = false;
            System.out.println(e.getMessage());
        }
        if (flag) {
            StringBuilder reverse = new StringBuilder(word);
            reverse = reverse.reverse();
            System.out.println("Reverse word: " + reverse);
        }
*/

      /* //Ex7

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = 0;

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        try{
            number = input.nextInt();
        }catch(InputMismatchException e){
            flag = false;
            System.out.println("Error: Enter an integer");
        }catch(Exception e){
            flag = false;
            System.out.println(e.getMessage());
        }
        if (flag) {
            if (number % 2 == 0){
                System.out.println("The number is Even");
            }
            else{
                System.out.println("The number is Odd");
            }
        }

*/
     /*   //Ex8

        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Centigrade: ");
        double centigrade = 0;

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        try {
            centigrade = input.nextDouble();

        }catch (InputMismatchException e){
            flag = false;
            System.out.println("Error: Enter a number");
        }
        catch (Exception e){
            flag = false;
            System.out.println(e.getMessage());
        }
        if (flag) {
            System.out.println("Temperature in Fahrenheit is: " + ((centigrade * 9 /5)+32));
        }*/

       /* //Ex9

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();

        if (checkEmpty(str)) {
            System.out.print("Input a number: ");
            int num = input.nextInt();
            try {
                System.out.println(str.charAt(num));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/


       /* //Ex10
        Scanner input = new Scanner(System.in);
        double width = 0;
        double height = 0;

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        try{
            System.out.print("Enter the width: ");
            width = input.nextDouble();
            System.out.print("Enter the height: ");
            height = input.nextDouble();
        }catch(InputMismatchException e){
            flag = false;
            System.out.println("Enter a number only");
        } catch (Exception e) {
            flag = false;
            System.out.println(e.getMessage());
        }

        if (flag) {
            System.out.println("Area is "+ height + " * " + width + " = "+ (width * height) );
            System.out.println("Perimeter is 2 * ( "+ width + " + " + height + " ) = " + (2*(width + height)));
        }
*/

        //Ex11

      /*  Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;


        try {
            System.out.print("Input first integer: ");
            first = input.nextInt();
            System.out.print("Input second integer: ");
            second = input.nextInt();
        }catch (InputMismatchException e){
            flag = false;
            System.err.println("Enter an integer only");
        } catch (Exception e) {
            flag = false;
            System.out.println(e.getMessage());
        }
        if (flag) {

            if (first == second) {
                System.out.println(first + " == " + second);
                System.out.println(first + " <= " + second);
                System.out.println(first + " >= " + second);

            }
            if (first > second) {
                System.out.println(first + " != " + second);
                System.out.println(first + " > " + second);
                System.out.println(first + " >= " + second);
            } else if (first < second) {
                System.out.println(first + " != " + second);
                System.out.println(first + " < " + second);
                System.out.println(first + " <= " + second);
            }
        }*/


     /*   //Ex12


        Scanner input = new Scanner(System.in);
        System.out.println("Input seconds: ");

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        int sec = 0;

        try {
            sec = input.nextInt();
        }catch (InputMismatchException e){
            flag = false;
            System.out.println("Enter an integer only");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (flag) {
            int hours = (int) (sec / 3600);
            int minutes = (int) (sec % 3600 / 60);
            int seconds = (int) (sec % 60);
            System.out.println(hours + ":" + minutes + ":" + seconds);
        }

*/

       /* //Ex13

        Scanner input = new Scanner(System.in);

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        int first = 0, second = 0, third = 0, fourth = 0;

        try {
            System.out.print("Input first number: ");
            first = input.nextInt();
            System.out.print("Input second number: ");
            second = input.nextInt();
            System.out.print("Input third number: ");
            third = input.nextInt();
            System.out.print("Input fourth number: ");
            fourth = input.nextInt();
        }catch (InputMismatchException e){
            flag = false;
            System.out.println("Enter integers only");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (flag) {

            if (first == second && first == third && first == fourth ) {
                System.out.println("Numbers are equal");
            }
            else {
                System.out.println("Numbers are not equal!");
            }
        }*/

     /*   //Ex14

        Scanner input = new Scanner(System.in);

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;

        int number = 0;

        System.out.println("Input a number: ");
        try {
            number = input.nextInt();
        }catch (InputMismatchException e){
            flag = false;
            System.out.println("Error: Enter an integer only");
        }catch (Exception e){
            flag = false;
            System.out.println(e.getMessage());
        }

        if(flag){
            if (number > 0){
                System.out.println("Number is positive");
            } else if (number < 0) {
                System.out.println("Number is negative");
            }
            else {
                System.out.println("Number is zero");
            }
        }*/

/*       //Ex15


        Scanner input = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        int num = 0;


        do {
            // there was no print in the lab but I added it to clarify the run :)
            System.out.print("Enter a number (Enter -1 to quit): ");
            try {
                num = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error: Enter integers only");
                input.next();
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            if(num == -1){
                break;
            } else if (num > 0) {
                positives++;
            }
            else if(num < 0) {
                negatives++;
            }
            else{
                zeros++;
            }

        } while (true);
        System.out.println(positives +" positives");
        System.out.println(zeros +" zero");
        System.out.println(negatives +" negatives");*/

       /* //Ex16

        Scanner input = new Scanner(System.in);

        // This flag will check if there was an exception (true means no exception)
        boolean flag = true;


        System.out.print("Enter a number to reverse: ");
        int number = 0;

        try {
            number = input.nextInt();
        }catch (InputMismatchException e){
            flag = false;
            System.out.println("Error: enter an integer only");
        } catch (Exception e) {
            flag = false;
            System.out.println(e.getMessage());
        }

        if (flag) {
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        System.out.println("The reverse number is: " + reverse);}
        */

     /*   //Ex17

        Scanner input = new Scanner(System.in);
        int largeNumber = 0;
        int smallNumber = 0;
        while (true) {
            try {
                System.out.print("Enter the number: ");
                largeNumber = input.nextInt();
                System.out.print("Enter the number: ");
                smallNumber = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: enter integers only");
                input.next();
                continue;
            }
            break;
        }


        outerLoop:
        while (true) {

            innerLoop:
            do {
                System.out.println("Do you want to END the program? (1 for yes 2 for no)");
                int choice = 0;
                try {
                    choice = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error: enter an integer only");
                    input.next();
                    continue;
                }
                if (choice == 1) {
                    break outerLoop;
                } else if (choice == 2) {
                    break innerLoop;
                } else {
                    System.out.println("Invalid choice");
                }
            } while (true);


            System.out.println("Enter the number:");
            int number = 0;
            try {
                number = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error: enter an integer only");
                input.next();
                continue;
            }


            if (number > largeNumber) {
                largeNumber = number;
            } else if (number < smallNumber) {
                smallNumber = number;
            }

        }
        System.out.println("The large number: " + largeNumber);
        System.out.println("The small number: " + smallNumber);
*/

   /*     //Ex18

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int count = 0;
        if (checkEmpty(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    count++;
                }
            }
            System.out.println("Number of a's: " + count);
        }*/


    }



    public static boolean checkEmpty(String str) {
        boolean empty = true;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == ' ')) {
                empty = false;
                break;
            }
        }
        if (empty) {
            try {
                throw new Exception("Error: the String must not be empty");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        return true;
    }


    public static void checkEmptySpaces(String str) throws Exception {
        boolean empty = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                empty = true;
                break;
            }
        }
        if (empty) {
            throw new Exception("Error: write one word only (without spaces)");
        }
    }

}