package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String inp, sp[];

        while (true)
        {
            System.out.println("Type in a sentence and press ENTER.");
            inp = sc.nextLine();
            inp = inp + "X";
            inp = inp.toUpperCase();

            sp = inp.split("S\\s*A");
            if (inp.equals("EXITX"))
                break;
            System.out.println("There are " + (sp.length-1) + " occurrences.");
            System.out.println();
        }

        System.out.println("Finished");

    }
}
