import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Lab 1
        //----------------------------------------------1-------------------------------------------------
       /* 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input*/

       /* try {
            System.out.print("Input first number:");
            int firstNumber = input.nextInt();
            System.out.print("Input second number:");
            int secondNumber = input.nextInt();

            int sum = firstNumber + secondNumber;
            int subtract = firstNumber - secondNumber;
            int multiply = firstNumber * secondNumber;
            int divide = firstNumber / secondNumber;
            int remainder = firstNumber % secondNumber;

            System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
            System.out.println(firstNumber + " - " + secondNumber + " = " + subtract);
            System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
            System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
            System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid number"));
        }catch (Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        } */

        //----------------------------------------------2-------------------------------------------------
        //2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        //Test Data

        /*try {
            System.out.print("Input a number:");

        int number=input.nextInt();
        for (int i=1; i<=10; i++){
            int multiplication=number*i;
            System.out.println(number+" x "+i+" = "+multiplication);}
        }catch (ArithmeticException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid number. ");
        }catch (Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        }*/

        //----------------------------------------------3-------------------------------------------------
        //Write a Java program to print the area and perimeter of a circle.
        /*try {
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid number for the radius.");
        }catch (Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        }*/

        //----------------------------------------------4-------------------------------------------------
        // 4. Java program to find out the average of a set of integers /**/
         /*try {
            System.out.print("Enter the count of numbers: ");
            int countOfNumbers = input.nextInt();

            int sum = 0;
            for (int i = 1; i <= countOfNumbers; i++) {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();
                sum += number;
            }

            double average = (double) sum / countOfNumbers;
            System.out.println("The average is: " + average);
         } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
         }catch (Exception e){
             System.out.println("Something went wrong: " + e.getMessage());
         }*/

        //----------------------------------------------5-------------------------------------------------
       /*  5. Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer.*/
       /* try {
            System.out.print("Input the first number: ");
            int firstNumber = input.nextInt();

            System.out.print("Input the second number: ");
            int secondNumber = input.nextInt();

            System.out.print("Input the third number: ");
            int thirdNumber = input.nextInt();

            int sum = firstNumber + secondNumber;

            if (sum == thirdNumber) {
                System.out.print("The result is: true");
            } else {
                System.out.print("The result is: false");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        }catch (Exception e){
        System.out.println("Something went wrong: " + e.getMessage());
        } */

        //----------------------------------------------6-------------------------------------------------
        /*Write a Java program to reverse a word.*/
       /* try {
            System.out.print("Input a word: ");
            String word = input.nextLine();
            String reverseWord = "";
            int length = word.length();
            int index = length - 1;
            while (index >= 0) {
                reverseWord += word.charAt(index);
                index--;
            }
            System.out.println("Reverse word: " + reverseWord);
        } catch (Exception e) {
            System.out.println("Something went wrong:"  + e.getMessage());
        }*/

        //----------------------------------------------7-------------------------------------------------

        // 7- Java program to check whether the given number is even or odd.

       /* try {
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }
        }catch (InputMismatchException e){
            System.out.println("Error: Invalid input. Please enter integers only.");
        }catch (Exception e) {
                System.out.println("Error occurred: " + e.getMessage());
        }*/


        //----------------------------------------------8-------------------------------------------------
        //8 - Java program to convert the temperature in Centigrade to Fahrenheit

         /*try {
             System.out.println("Enter temperature in Centigrade: ");
             double celsius = input.nextDouble();

             double fahrenheit = (celsius * 9 / 5) + 32;

             System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
         }catch (InputMismatchException E){
             System.out.println("Error: Invalid input. Please enter number only.");
         }catch (ArithmeticException e){
             System.out.println("Something went wrong:"+ e.getMessage());
         }catch (Exception e){
             System.out.println("Something went wrong:"+ e.getMessage());
         }*/


        //----------------------------------------------9-------------------------------------------------
        // 9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        /*try {
            System.out.print("Input a string: ");
            String str = input.nextLine();

            System.out.print("Input a number: ");
            int index = input.nextInt();

            if (index >= 0 && index < str.length()) {
                char ch = str.charAt(index);
                System.out.println("Character at index " + index + ": " + ch);
            } else {
                throw new IndexOutOfBoundsException("Invalid index!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } */

            //----------------------------------------------10-------------------------------------------------
        // 10. Write a Java program to print the area and perimeter of a rectangle.
         /*
        try {
            System.out.print("Width = ");
            double width = input.nextDouble();
            if (width <= 0) {
                throw new IndexOutOfBoundsException("Width must be a positive number.");
            }

            System.out.print("Height = ");
            double height = input.nextDouble();
            if (height <= 0) {
                throw new IndexOutOfBoundsException("Height must be a positive number.");
            }

            double area = width * height;
            double perimeter = 2 * (width + height);

            System.out.println("Area is " + width + " * " + height + " = " + area);
            System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } */


        //----------------------------------------------11-------------------------------------------------
        //Write a Java program to compare two numbers
        //-----------------Call mathod ex11----------

       /*  try {
            compareIntegers(input);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } }

    public static void compareIntegers(Scanner input) throws InputMismatchException {
        System.out.print("Input first integer: ");
        int firstNum = input.nextInt();
        System.out.print("Input second integer: ");
        int secondNum = input.nextInt();

        if (firstNum != secondNum) {
            System.out.println(firstNum + " != " + secondNum);
        } else {
            System.out.println(firstNum + " == " + secondNum);
        }

        if (firstNum < secondNum) {
            System.out.println(firstNum + " < " + secondNum);
        }

        if (firstNum <= secondNum) {
            System.out.println(firstNum + " <= " + secondNum);
        }*/

        //----------------------------------------------12-------------------------------------------------
        // 2. Write a Java program to convert seconds to hours, minutes and seconds.
        /*try {
            System.out.print("Input seconds: ");
            int totalSeconds = input.nextInt();
            if (totalSeconds < 0) {
                throw new InputMismatchException("Input cannot be negative.");
            }
            int hours = totalSeconds / 3600;
            int remainingSeconds = totalSeconds % 3600;
            int minutes = remainingSeconds / 60;
            int seconds = remainingSeconds % 60;
            System.out.println(hours + ":" + minutes + ":" + seconds);
        } catch (InputMismatchException E) {
            System.out.println(E.getMessage());
        }*/

        //----------------------------------------------13-------------------------------------------------
       /* 13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.*/
        /*try {
            System.out.print("Input first number: ");
            int number1 = input.nextInt();

            System.out.print("Input second number: ");
            int number2 = input.nextInt();

            System.out.print("Input third number: ");
            int number3 = input.nextInt();

            System.out.print("Input fourth number: ");
            int num4 = input.nextInt();
            if (number1 == number2 && number2 == number3 && number3 == num4) {
                System.out.println("Numbers are equal!");
            } else {
                System.out.println("Numbers are not equal!");
            }
        } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter integers only.");
        } catch (Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        } */

        //----------------------------------------------14-------------------------------------------------
        /*14. Write a Java program that reads an integer and check whether it is negative, zero, or
        positive.*/
       /* try {
            System.out.print("Input a number: ");
            int number = input.nextInt();

            // Check if the number is negative, zero, or positive
            if (number < 0) {
                System.out.println("Number is negative");
            } else if (number == 0) {
                System.out.println("Number is zero");
            } else {
                System.out.println("Number is positive");
        }

        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter integers only.");
        }catch (Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        }*/
        //----------------------------------------------15-------------------------------------------------
        /*15.Write a program to enter the numbers till the user wants and at the end it should
        display the count of positive, negative and zeros entered
                (End loop use -1 , Don’t count -1).*/
        /*int countOfPositive = 0;
        int countOfNegative = 0;
        int zeroCount = 0;
        int number;

        System.out.println("Enter numbers (enter -1 to stop):");
        try {
            while (true) {
                number = input.nextInt();

                if (number == -1) {
                    break;
                }

                if (number > 0) {
                    countOfPositive++;
                } else if (number < 0) {
                    countOfNegative++;
                } else {
                    zeroCount++;
                }
            }

            System.out.println(countOfPositive + " positives");
            System.out.println(zeroCount + " zero");
            System.out.println(countOfNegative + " negatives");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }*/

        //----------------------------------------------16-------------------------------------------------
        /*16 - Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.*/
        // if the input is 12345, the output should be 54321
        /* try {
             System.out.print("input a number: ");
             int number = input.nextInt();
             if (number < 0) {
                 throw new IllegalArgumentException("Input number should be non-negative.");
             }
             int reversedNumber = 0;
             while (number != 0) {
                 int digit = number % 10;
                 reversedNumber = reversedNumber * 10 + digit;
                 number /= 10;
             }
             System.out.println("Reversed number: " + reversedNumber);
         }catch (InputMismatchException e){
             System.out.println("Invalid input. Please enter valid integers.");
         }catch (IllegalArgumentException e){
             System.out.println(e.getMessage());
         }*/
        //----------------------------------------------17-------------------------------------------------
       /* 17 - Write a program to enter the numbers till the user wants and at the end the program
        should display the largest and smallest numbers entered.*/
        /*int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        String numberInput;
        int number;

        System.out.println("Enter numbers (type 'exit' to quit):");


        while (true) {
            System.out.print("Enter number: ");
            numberInput = input.next();

            if (numberInput.equalsIgnoreCase("exit")) {
                break;
            }


            try {
                number = Integer.parseInt(numberInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer or 'exit'.");
                continue;
            }

            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);*/

        //----------------------------------------------18-------------------------------------------------
        /*18 - Determine and print the number of times the character ‘a’ appears in the input
        entered by the user.*/
        try {
            System.out.print("Enter String: ");
            String text = input.nextLine();
            countACharacters(text);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void countACharacters(String text) throws IllegalArgumentException {
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be empty.");
        }

        if (text.contains(" ")) {
            throw new IllegalArgumentException("Input string cannot contain space character.");

        }
        if ( !text.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException ("Input should contain only letters");
        }


        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println("Number of a's: " + count);





    }
}
