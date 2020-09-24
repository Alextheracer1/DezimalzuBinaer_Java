package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        String string;

        System.out.println("Geben Sie eine Zahl ein die dann in Binaer umgewandelt wird. ");
        input = sc.nextInt();

       string = Umwandlung(input).reverse().toString();

       System.out.println(string);
    }
    public static StringBuilder Umwandlung(int input) {

    StringBuilder string = new StringBuilder();


        int newNumber = input / 2;
        int rest = input % 2;

        string.append(rest);
        if (newNumber == 0) {
            return string;
        } else {
            return string.append(Umwandlung(newNumber).toString());
        }


    }

}
