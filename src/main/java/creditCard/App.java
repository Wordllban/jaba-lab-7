package main.java.creditCard;

import main.java.creditCard.CreditCard;

public class App {
    public static void main(String[] args){
        CreditCard CreditCard1 = new CreditCard();
        System.out.println(CreditCard1);

        CreditCard CreditCard2 = new CreditCard("4534 5535 4355 1235", "Diamond", "Grivni", "Big");
        System.out.println(CreditCard2);

        CreditCard CreditCard3 = new CreditCard("4534 5455 5676 2356", "Wood", "Shekeli",
                "Big", 44255, "Privat", "Randomniy CHel", 676, 3.3, "Tokyo Choul");
        System.out.println(CreditCard3);
        CreditCard.printStaticBankAccount();
        CreditCard1.printBankAccount();
    }
}