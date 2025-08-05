import java.util.*;

public class Result {
    public static List<Long> getNetProfit(List<String> events) {
        Map<String, Integer> quantityMap = new HashMap<>();
        Map<String, Integer> priceMap = new HashMap<>();
        List<Long> result = new ArrayList<>();
        long profit = 0;

        for (String event : events) {
            String[] parts = event.split(" ");
            String action = parts[0];

            if (action.equals("BUY")) {
                String product = parts[1];
                int qty = Integer.parseInt(parts[2]);
                quantityMap.put(product, quantityMap.getOrDefault(product, 0) + qty);
                priceMap.putIfAbsent(product, 0);
            } else if (action.equals("SELL")) {
                String product = parts[1];
                int qty = Integer.parseInt(parts[2]);
                int currentPrice = priceMap.getOrDefault(product, 0);
                profit += (long) currentPrice * qty;
                quantityMap.put(product, quantityMap.getOrDefault(product, 0) - qty);
            } else if (action.equals("CHANGE")) {
                String product = parts[1];
                int priceChange = Integer.parseInt(parts[2]);
                int currentPrice = priceMap.getOrDefault(product, 0);
                priceMap.put(product, currentPrice + priceChange);
            } else if (action.equals("QUERY")) {
                long netProfit = profit;
                for (String product : quantityMap.keySet()) {
                    int qty = quantityMap.get(product);
                    int price = priceMap.getOrDefault(product, 0);
                    netProfit += (long) qty * price;
                }
                result.add(netProfit);
            }
        }

        return result;
    }
}
