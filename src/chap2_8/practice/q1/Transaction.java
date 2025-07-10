package chap2_8.practice.q1;

public class Transaction {

    private Trader trader; // 거래자
    private int year; // 거래연도
    private int value; // 거래액

    public Transaction(Transaction transaction) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{Trader: " + trader.getName() + " in " + trader.getCity() +
            ", year: " + year +
            ", value: " + value +
            '}';
    }

    public String toStringPrettier() {
        return "{" +
            "trader: " + trader.getName() + " in " + trader.getCity() +
            ", year: " + year +
            ", value: " + value +
            '}';
    }
}
