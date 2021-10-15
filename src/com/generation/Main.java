package com.generation;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int num1 = getNumbers("addition",1);
        int num2 = getNumbers("addition",2);
        addition(num1,num2);

        num1 = getNumbers("subtraction",1);
        num2 = getNumbers("subtraction",2);
        subtraction(num1,num2);

        num1 = getNumbers("multiplication",1);
        num2 = getNumbers("multiplication",2);
        multiplication(num1,num2);

        num1 = getNumbers("division",1);
        num2 = getNumbers("division",2);
        division(num1,num2);

    }
    public static int getNumbers(String operation, int number){
        Scanner console = new Scanner( System.in);
        if(number==1){
            System.out.print("Enter "+operation+" number 1: ");
        }else if(number==2) {
            System.out.print("Enter " + operation + " number 2: ");
        }
        return console.nextInt();
    }

    public static void addition(int num1,int num2){
        System.out.println( num1+" + "+num2+" = "+ (num1+num2));
    }
    public static void subtraction(int num1,int num2){
        System.out.println( num1+" - "+num2+" = "+ (num1-num2));
    }
    public static void multiplication(int num1,int num2){
        System.out.println( num1+" * "+num2+" = "+ (num1*num2));
    }
    public static void division(float num1, float num2){
        System.out.println( num1+" / "+num2+" = "+ (num1/num2));
    }
}