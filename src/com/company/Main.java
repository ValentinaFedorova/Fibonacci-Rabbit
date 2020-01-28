package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int coef;
	    int month;
	    long adult = 1;
	    long child = 1;
	    long amount=1;
	    Scanner sc = new Scanner(System.in);
	    month = sc.nextInt();
        coef = sc.nextInt();
        for (int i = 2; i < month; i++) {

            child=coef*adult;
            adult=amount;
            amount=adult+child;

        }
        System.out.println(amount);


    }
}
