package chap2_8.practice.q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CambridgeTransaction {

    private Map<Integer, List<Transaction>> cambMap;
    private List<Transaction> cambridgeTransactionsIn2021;
    private List<Transaction> cambridgeTransactionsIn2022;

    public CambridgeTransaction() {
        this.cambMap = new HashMap<>();
        this.cambridgeTransactionsIn2021 = new ArrayList<>();
        this.cambridgeTransactionsIn2022 = new ArrayList<>();
    }

    public Map<Integer, List<Transaction>> getCambMap() {
        return cambMap;
    }

    public void setCambMap(Map<Integer, List<Transaction>> cambMap) {
        this.cambMap = cambMap;
    }

    public void makeCamb(Transaction transaction) {
        if (transaction.getYear() == 2021) {
            this.cambridgeTransactionsIn2021.add(transaction);
            this.cambMap.put(transaction.getYear(), this.cambridgeTransactionsIn2021);
        } else {
            this.cambridgeTransactionsIn2022.add(transaction);
            this.cambMap.put(transaction.getYear(), this.cambridgeTransactionsIn2022);
        }
    }

    @Override
    public String toString() {
        return "" + cambMap;
    }
}
