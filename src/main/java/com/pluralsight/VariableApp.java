package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {

        // declare variables here
        // then code solution
        // then use System.out.println() to display results

        //Step 1:
        //Questions:
        //1. Declare a variable to store your favorite color
        //2. Declare a variable to store the year you started this class
        //3. Declare a variable to store your middle initial
        //4. Declare a variable to store whether you have pets (yes/no)
        //5. Declare a variable with a nice message or saying
        //6. Print each variable with a descriptive message

        String color = "purple";
        System.out.println("The answer to question 1 is: my favorite color is " + color + ".");
        int startYearOfThisClass = 2025;
        System.out.println("The answer to question 2 is: the year I started this class is in " + startYearOfThisClass + ".");
        String middleInitial = "none";
        System.out.println("The answer to question 3 is: my middle initial is " + middleInitial + ".");
        boolean havePets = false;
        String pets;
            if(!havePets){
               pets = "No";}
            else{
               pets = "Yes";}
            System.out.println("The answer to question 4 is: Do I have pets? " + pets + ".");
        String niceMessage = "'You look great'";
        System.out.println("The answer to question 5 is: a nice message is " + niceMessage + ".");

        //step 2:
        //1. Declare AND initialize variables for:
        //2. The number of days in a week
        //3. The price of coffee ($4.99)
        //4. Your favorite letter
        //5. Whether it's raining (true/false)
        //6. Print all values in complete sentences

        int daysInWeek = 7;
        double priceOfCoffee = 4.99;
        char favoriteLetter = 'Q';
        boolean isRaining = false;
        System.out.println("There is " + daysInWeek + " days in a week.");
        System.out.println("The price of coffee is $" + priceOfCoffee + ".");
        System.out.println("My favorite letter is " + favoriteLetter + ".");
        System.out.println("It is " + isRaining + " that it's raining.");








    }


    }