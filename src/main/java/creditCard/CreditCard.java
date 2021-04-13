package main.java.creditCard;

public class CreditCard {
    private static double bankAccount = 0;
    private String number = "1111 2222 3333 4444";
    private String cardType = "Default";
    private String currency = "$";

    private String cardSize = "Default";
    private String bank = "N/A";
    private String userName = "N/A";
    private int cvv = 777;
    private double cashBack = 1.1;

    protected String cardPrint = "Default";
    protected int creditLimit = 300;

    public CreditCard(String number, String cardType, String currency, String cardSize) {
        this.number = number;
        this.cardType = cardType;
        this.currency = currency;
        this.cardSize = cardSize;
    }

    public CreditCard(String number, String cardType, String currency, String cardSize, String bank, String userName,
                      int cvv, double cashBack, String cardPrint, int creditLimit) {
        this(number, cardType, currency, cardSize);
        this.bank = bank;
        this.userName = userName;
        this.cvv = cvv;
        this.cashBack = cashBack;
        this.cardPrint = cardPrint;
        this.creditLimit = creditLimit;
    }

    public CreditCard() {
        bankAccount += 1;
        number = "1337 3228 8223 4959";
        cardType = "Gold";
        currency = "Euro";
        cardSize = "50mm x 30mm";
        bank = "Monobank";
        userName = "Brain Dead";
        cvv = 666;
        cashBack = 2.0;
        cardPrint = "IoT";
        creditLimit = 322;
    }

    public static double getBankAccount() {
        return bankAccount;
    }

    public static void setBankAccount(double bankAccount) {
        CreditCard.bankAccount = bankAccount;
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

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
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
        System.out.println("You have " + bankAccount + " in your bank account ");
    }

    public void printBankAccount() {
        System.out.println("You have " + bankAccount + " " + currency + " in your bank account ");
    }

    public void resetResult(String number, String cardType, String currency, String cardSize, String bank,
                      String userName, int cvv, double cashBack, String cardPrint, int creditLimit) {
        this.number = number;
        this.cardType = cardType;
        this.currency = currency;
        this.cardSize = cardSize;
        this.bank = bank;
        this.userName = userName;
        this.cvv = cvv;
        this.cashBack = cashBack;
        this.cardPrint = cardPrint;
        this.creditLimit = creditLimit;
    }
}





