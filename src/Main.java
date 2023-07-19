package com.Thaseen;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
//    Methods in java

    static int sum(int x,int y){
        int d=x+y;
        System.out.println("The Sum of "+ x+" and "+y+" is "+d);
        return d;
    }

    public static void main(String[] args) {

//        The First Java Code
        System.out.println("Hello World Thaseen");

/*        Variables
        In java:
        Variables are containers Which store data values
        String,int,char,float,boolean
        How to declare variables:
        syntax-<dataTYpe> <varaibleName> = <value>
 */
//        String Name = "Thaseen";
//        System.out.println(Name);
//
//        int a = 56, x= 62, y=21;
////        we have use f to use float
//        float b = 23.4f;
////        sout--> This Will Print the below line i.e  System.out.println() and this will work on Intellij only;
//        boolean isAdult = false;
//
//        System.out.println(a);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(b);
//        System.out.println(isAdult);


        //Two Types of Data Types in Java
        //  1.Primitive data types
        //  2.Non-Primitive data types
//
//        byte u = 56;
//        System.out.println(u);
//        double d=43.3214321521d;
//        System.out.println(d);
//
//        char grade= 'A';
//        System.out.println(grade);

        /* Operators in Java
            Operand,Operator,Operand = result
            4           +       8    =    12

            Types of Operators In java

            1.Arithmetic
            2.Assignment
            3.Logical
            4.Comparison  Operator
         */
//        int num1 = 45, num2 = 78;
//        num1 += 3;
//        num2 -= 8;
//        System.out.println("The Value of num1 and num2 is");
//        System.out.println(num1 + num2);
//
//        System.out.print("The Value of num1 and num2 is ");
//        System.out.print(num1 + num2);
//
//        System.out.println("The Value of num1 and num2 is ");
//        System.out.println(num1 - num2);
//
//        System.out.print("The Value of num1 and num2 is * ");
//        System.out.println(num1 * num2);
//
//        System.out.print("The Value of num1 and num2 is / ");
//        System.out.println(num1/num2);
//
//        System.out.print("The Value of num1 and num2 is % ");
//        System.out.println(num1 % num2);
//
//        System.out.println(num1++);
//        System.out.println(++num1);
//        System.out.println(--num1);
//        System.out.println(num1--);
//
//        System.out.println(num2++);
//        System.out.println(++num2);
//        System.out.println(--num2);
//        System.out.println(num2--);

        /*
         * Comparison operator
         * 1. ==  Checks for equality of value
         * 2. !=  cChecks if two values are not equal
         * 3. <
         * 4. >
         * 5. <=
         * 6. >=
         *
         * Comparison operators
         * 1. && - Logical and operator - returns true if only both conditions are true
         * 2. || - Logical or operator - returns true if any one conditions are true
         * 3. ! -Logical not -  Reverse the result from true to false and vice verse
         * */

        // Taking User Input in Java Using String
//           Scanner scan = new Scanner(System.in);
//           System.out.println("Enter a string Input");
//           String input = scan.nextLine();
//            System.out.println(input);

        // Taking Input in Java Using Integer
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Enter a Integer Input");
//            int input1 = scan1.nextInt();
//            System.out.println(input1);


//            Srting and string Methods in java
        String Name2 = "Ahmed";
        String channel = "Code WIth Thaseen";
//        System.out.println(Name2 + " From " + channel);
//
//        System.out.println(Name2);
//        System.out.println(channel.length());
//        System.out.println(channel.toUpperCase());
//        System.out.println(Name2.toLowerCase());
//        System.out.println(Name2 + " From\"" + channel);
//        System.out.println(Name2 + " From\\ " + channel);
//        System.out.println(Name2 + " From\t" + channel);
//        System.out.println(Name2 + " From\'" + channel);
//        System.out.println(Name2 + " From\n" + channel);

//        System.out.println(channel.contains("Thaseen"));
//        System.out.println(Name2.charAt(3));
//        System.out.println(channel.endsWith("seen"));
//        System.out.println(Name2.indexOf("med"));
////        Compares the two String
//        System.out.println(Name2.compareTo(channel));
////        Compare two strings, ignoring lower case and upper case differences:
//            String myStr1 = "HELLO";
//        String myStr2 = "hello";
//        System.out.println(myStr1.compareToIgnoreCase(myStr2));

//        Removes White Spaces
        String myStr = "       Hello World!       ";
//        System.out.println(myStr);
//        System.out.println(myStr.trim());

//        replaces a charactetr from String
        String myStr3 = "Bottle";
//        System.out.println(myStr3.replace('t', 'p'));

// Find out if a string is empty or not
//        String myStr1 = "Hello";
        String myStr5 = "";
//        System.out.println(myStr1.isEmpty());
//        System.out.println(myStr5.isEmpty());

//      Math Class in Java
//
//        int numb1 = 4 , numb2 = 9;
//        System.out.println(Math.max(numb1,numb2));
//        System.out.println(Math.min(numb1,numb2));
//        System.out.println(Math.sqrt(81));
////        The below returns Positive If value is negative
//        System.out.println(Math.abs(-543));
//        System.out.println(Math.abs(543));
////        gives a Random number from 0 to 1
//        System.out.println(Math.random());
////       Gives a random from 4 -- 8
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());


//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Enter Your Age");
//        int age = scan2.nextInt();
////        System.out.println(age);
//
//
//        //      If -else Conditionals
//
//        if (age < 14) {
//            System.out.println(input+" You are kid");
//        }
//        else if (age>20 && age<50) {
//            System.out.println(input+" you are a young Man ");
//
//        }
//        else {
//            System.out.println(input+" You are not a kid");
//
//        }

//      Switch Case Statement in Java
//
//            switch(age){
//                case 18:
//                    System.out.println("You are 18 Years Old");
//                    break;
//                case 16:
//                    System.out.println("You are 16 Years Old");
//                    break;
//                case 54:
//                    System.out.println("You are 54 Years Old");
//                    break;
//                case 25:
//                    System.out.println("You are 25 Years Old");
//                    break;
//                default:
//                    System.out.println("You did not match Any of the case");
//
//
//            }

//        Problem
//
//        Scanner scan3 = new Scanner(System.in);
//        System.out.println("Enter a Number from 1 to 7");
//        int days = scan3.nextInt();
//
//        switch(days){
//            case 1:
//                System.out.println("Today is Sunday");
//                break;
//            case 2:
//                System.out.println("Today is Monday");
//                break;
//
//            case 3:
//                System.out.println("Today is Tuesday");
//                break;
//
//            case 4:
//                System.out.println("Today is Wednesday");
//                break;
//
//            case 5:
//                System.out.println("Today is Thursday");
//                break;
//
//            case 6:
//                System.out.println("Today is Friday");
//                break;
//
//                case 7:
//                System.out.println("Today is Saturday");
//                break;
//
//            default:
//                System.out.println("The Entered Number is Incorrect");
//        }


/*        Loops in JAVA

        While Loop
        while(condition){
        code will keep executing until the condition is true
        }

        int i=0;
        while(i<100){
            System.out.println(i);
            i+=1;
        }


 */

/*
        Do whiile loop
        do{
        code will keep executing until the condition is true
        }while (condition)

        int j=0;
        do{
            System.out.println(j);
            j+=1;
        }
        while(j>100);
*/

//        FOR LOOP
//
//        for(st1;st2;st3){
//        Code to be Executed;
//          }
/*
        for(int i=5;i<20;i++){
            if(i==10){
//                break;
                continue;
            }
//            else {
//                System.out.println(i);
//            }
            System.out.println(i);
        }
        */

//        ARRAYS IN JAVA

        int [] marks = {1,2,3,4,5,6,7};
        String [] Fruits = {"Mango","Apple","Grape","Banana","Kiwi","Orange","Strawberry"};
        marks[3]=34;

//        Classical Way To Iterate an Array
        for(int i=0; i< marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println(marks[4]);
        System.out.println(marks[3]);

//        The Below is For Each Loop in Java
        System.out.println("This Is FOR EACH LOOP");
        for (String e : Fruits){
        System.out.println(e);
        }
        for(int value:marks){
            System.out.println(value);
        }

//        Two Dimensional Array
        System.out.println("This is Two Dimensional Array");
        int [][] matrix = {{1,22,3,4},{5,6,7,9,8}};
//        sout([1]--> the first Array [2]-->The 2nd Index of 1st Array
        System.out.println(matrix[1][2]);


//        Try - Catch in Java
//
//        String [] cars={"Hyundai","Maruti","Volkswogan","Jaquar","Benz"};
//        try {
//            System.out.println(cars[5]);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        System.out.println("This is cars ");


//        Methods in Java: It is block of code which runs whem it is Called

//        static int sum(int x,int y){
//            return x+y;
//        }
//        System.out.println(sum(57,32));
//
//
//thaseen();
//thaseen(2,3);
//
//
//    }
//    static void thaseen(){
//        System.out.println("hi my name is thaseen...");
//    }
//    static int thaseen(int m,int n){
//        int z = m+n;
//        System.out.println("the value of x and y is : "+z);
//        return z;


        float number_1, number_2;
        System.out.println("Enter The First Number");
        Scanner scan = new Scanner(System.in);
        number_1=scan.nextFloat();

        System.out.println("Enter The Second Number ");
//        Scanner scan = new Scanner(System.in);
        number_2=scan.nextFloat();
        System.out.print("you have Entered ");
        System.out.print(number_1);
        System.out.print("and ");
        System.out.println(number_2);

        String prompt="Enter 0 for Addition, 1 for "+"Subrtation, 2 for Multiplication and 3 for Divition";
        System.out.println(prompt);
        int input = scan.nextInt();

        switch(input){
            case 0:
                System.out.println("Adding the Numbers");
                System.out.println("The result of "+ number_1 + "and "+number_2 + "is " + (number_1 + number_2));
                break;
            case 1:
                System.out.println("Subtracting he Numbers");
                System.out.println("The result of "+ number_1 + "and "+number_2 + "is " + (number_1 - number_2));

                break;
            case 2:
                System.out.println("Multiplying the Numbers");
                System.out.println("The result of "+ number_1 + "and "+number_2 + "is " + (number_1 * number_2));

                break;
                case 3:
                System.out.println("Dividing  the Numbers");
                    System.out.println("The result of "+ number_1 + "and "+number_2 + "is " + (number_1 / number_2));

                break;
            default:
                System.out.println("Invalid Input");





        }

    }
}

