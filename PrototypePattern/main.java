package PrototypePattern;

import java.util.*;

class main {
    public static void main(String[] args) {

        Loan loan = new Loan(12345678, new Customer("Suraj", "India"));
        System.out.println(loan.toString());

        // Prototype Pattern
        Loan loanClone = loan.clone();
        System.out.println(loanClone.toString());

    }

}
