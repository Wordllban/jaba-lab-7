package main.java.entity;

public class App {
    public static void main(String[] args){
        CreditCard defaultCreditCard = new CreditCard();
        System.out.println(defaultCreditCard);

        CreditCard diamondCreditCard = new CreditCard("4534 5535 4355 1235", "Diamond", "Grivni", "Big");
        System.out.println(diamondCreditCard);

        CreditCard woodCreditCard = new CreditCard("4534 5455 5676 2356", "Wood", "Shekeli",
                "Big", 44255, "Privat", "Randomniy CHel", 676, 3.3, "Tokyo Choul");
        System.out.println(woodCreditCard);
        CreditCard.printStaticBankAccount();
        defaultCreditCard.printBankAccount();
    }
}
