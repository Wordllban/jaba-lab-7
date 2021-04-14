package main.java.creditCard;

public class CreditCard {
    private static int creditLimit = 300;
    private String number;
    private String cardType;
    private String currency;

    private double bankAccount;
    private String bank;
    private String userName;
    private int cvv;
    private double cashBack;

    protected String cardSize;
    protected String cardPrint;


    public CreditCard(String number, String cardType, String currency, String cardSize) {
        this.number = number;
        this.cardType = cardType;
        this.currency = currency;
        this.cardSize = cardSize;
    }

    public CreditCard(String number, String cardType, String currency, String cardSize, double bankAccount, String bank, String userName,
                      int cvv, double cashBack, String cardPrint) {
        this(number, cardType, currency, cardSize);
        this.bankAccount = bankAccount;
        this.bank = bank;
        this.userName = userName;
        this.cvv = cvv;
        this.cashBack = cashBack;
        this.cardPrint = cardPrint;
    }

    public CreditCard() {
        creditLimit++;
        this.number = "1111 2222 3333 4444";
        this.cardType = "Default";
        this.currency = "$";
        this.bankAccount = 0;
        this.bank = "N/A";
        this.userName = "N/A";
        this.cvv = 777;
        this.cashBack = 1.1;
        this.cardSize = "Default";
        this.cardPrint = "Default";
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCardSize() {
        return cardSize;
    }

    public void setCardSize(String cardSize) {
        this.cardSize = cardSize;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getCashBack() {
        return cashBack;
    }

    public void setCashBack(double cashBack) {
        this.cashBack = cashBack;
    }

    public String getCardPrint() {
        return cardPrint;
    }

    public void setCardPrint(String cardPrint) {
        this.cardPrint = cardPrint;
    }

    public static int getCreditLimit() {
        return creditLimit;
    }

    public static void setCreditLimit(int creditLimit) {
        CreditCard.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", cardType='" + cardType + '\'' +
                ", currency='" + currency + '\'' +
                ", cardSize='" + cardSize + '\'' +
                ", bank='" + bank + '\'' +
                ", userName='" + userName + '\'' +
                ", cvv=" + cvv +
                ", cashBack=" + cashBack +
                ", cardPrint='" + cardPrint + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }

    public static void printStaticBankAccount() {
        System.out.println("You have " + creditLimit + " credit limit left");
    }

    public void printBankAccount() {
        System.out.println("You have " + creditLimit + " credit limit left");
    }

    public void resetResult(String number, String cardType, String currency, String cardSize, double bankAccount,
                            String bank, String userName, int cvv, double cashBack, String cardPrint) {
        this.number = number;
        this.cardType = cardType;
        this.currency = currency;
        this.cardSize = cardSize;
        this.bankAccount = bankAccount;
        this.bank = bank;
        this.userName = userName;
        this.cvv = cvv;
        this.cashBack = cashBack;
        this.cardPrint = cardPrint;
    }
}
