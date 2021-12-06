package test;

import java.util.Scanner;

public class TestChecker {
    public static void main(String[] args) {
        String chaine;

        Scanner scan = new Scanner(System.in);

        chaine = scan.nextLine();

        System.out.println(Checker.isNumber(chaine));
    }
}