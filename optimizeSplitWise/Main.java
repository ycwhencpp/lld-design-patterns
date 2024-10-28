package optimizeSplitWise;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] txnArray = new int[][] {
                {
                        1, 2, 10
                },
                {
                        2, 3, 20
                },
                {
                        3, 1, 30
                }
        };

        System.out.println(minTranscation(txnArray));
    }

    public static int minTranscation(int[][] trnx) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] row : trnx) {
            int s = row[0];
            int r = row[1];
            int a = row[2];
            map.put(s, map.getOrDefault(s, 0) - a);
            map.put(r, map.getOrDefault(r, 0) + a);

        }

        List<Integer> balances = new ArrayList<>();

        for (int amount : map.values()) {
            if (amount != 0) {
                balances.add(amount);
            }
        }
        return dfs(balances, 0);

    }

    private static int dfs(List<Integer> balances, int currentIndex) {
        if (balances.size() == 0 || currentIndex >= balances.size()) {
            return 0;
        }
        if (balances.get(currentIndex) == 0) {
            return dfs(balances, currentIndex + 1);
        }
        int currentValue = balances.get(currentIndex);
        int minTxn = Integer.MAX_VALUE;
        for (int txnIndex = currentIndex + 1; txnIndex < balances.size(); txnIndex++) {
            int nextVal = balances.get(txnIndex);
            if (currentValue * nextVal < 0) {
                balances.set(txnIndex, currentValue + nextVal);
                minTxn = Math.min(minTxn, 1 + dfs(balances, currentIndex + 1));
                balances.set(txnIndex, nextVal);
            }
            if (currentValue + nextVal == 0) {
                break;
            }
        }

        return minTxn;
    }
}
