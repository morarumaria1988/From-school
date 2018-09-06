package a;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String inputLine;
    static ArrayList<Sell> sells = new ArrayList();
    static ArrayList<Buy> buys = new ArrayList();
    static Integer sellCounter = 0;
    static Integer buyCounter = 0;
    static String beginOrder;

    public static void main(String[] args) {
        while (true) {
            System.out.print("> ");
            inputLine = sc.nextLine();

            if (inputLine.length() <= 4 && !inputLine.equalsIgnoreCase("QUIT")) {
                System.out.println("Err");
                continue;
            } else {
                beginOrder = inputLine.substring(0, 4).toUpperCase();
            }

            switch (beginOrder) {

                case "BUY ":
                    analyze(beginOrder);
                    trade(sells, buys);
                    break;
                case "SELL":
                    analyze(beginOrder);
                    //the trade method is called to check if there are buy orders awaiting for new sell orders
                    trade(sells, buys);
                    break;
                case "PRIN":
                    print();
                    break;
                case "QUIT":
                    System.exit(0);
                default:
                    System.out.println("Wrong input. Please try again with 'SELL volume@price' or 'BUY volume@price' or 'PRINT'. QUIT to quit the session");
            }

        }
    }

    public static void analyze(String order) {
        if (order.equals("BUY ")) {
            buyCounter++;
            String[] orderPart = inputLine.substring(3).trim().split("@");
            Integer buyVolume = Integer.valueOf(orderPart[0]);
            Integer buyPrice = Integer.valueOf(orderPart[1]);
            if (buyVolume > 0 && buyPrice > 0) {
                buys.add(new Buy(buyPrice, buyVolume, buyCounter));
            } else {
                System.out.println("Volume and price must be > 0");
            }
        }
        if (order.equals("SELL")) {
            sellCounter++;
            String[] orderPart = inputLine.substring(4).trim().split("@");
            Integer sellVolume = Integer.valueOf(orderPart[0]);
            Integer sellPrice = Integer.valueOf(orderPart[1]);
            if (sellVolume > 0 && sellPrice > 0) {
                sells.add(new Sell(sellPrice, sellVolume, sellCounter));
            } else {
                System.out.println("Volume and price must be > 0");
            }
        }
    }

    public static void trade(ArrayList<Sell> sells, ArrayList<Buy> buys) {
        Collections.sort(sells);
        Collections.sort(buys);
        Buy currentBuy;
        Sell currentSell;
        //it treats buys -> buyCurrent
        for (int i = 0; i < buys.size(); i++) {
            currentBuy = buys.get(i);
            int sum = 0;
            for (int j = 0; j < sells.size(); j++) {

                currentSell = sells.get(j);

                if (currentBuy.getBuyVolume() >= sum + currentSell.getSellVolume()) {
                    /* case 1
                    if the volume of currentSell and the  sum of previous matched sell orders is less than or equal with the volume of the current buy order
                    trade will be done with the entire volume of  the current sell and then, the  current sell volume will be set to 0 to be deleted from the array
                     */

                    int tradeVolume = currentSell.getSellVolume();
                    int tradePrice = currentSell.getSellPrice();
                    sum += currentSell.getSellVolume();
                    System.out.println("TRADE " + tradeVolume + "@" + tradePrice);
                    currentSell.setSellVolume(0);
                    sells.set(j, currentSell);
                    currentBuy.setBuyVolume(currentBuy.getBuyVolume() - currentSell.getSellVolume());
                    buys.set(i, currentBuy);
                    continue;
                } else {
                    /*case 2
                    if the volume of the currentSell and the  sum of previous matched sell orders is greater than the volume of the current buy order
                    of the currentSell  will only be traded strictly needed numbers of shares to complete the currentBuy volume
                    the remaining difference should be placed in the array at the currentSell volume and will be used by future buys
                     */

                    int buyRestVolume = currentBuy.getBuyVolume() - sum;
                    int remainderOfCurrentLastSel = currentSell.getSellVolume() - buyRestVolume;
                    currentSell.setSellVolume(remainderOfCurrentLastSel);
                    sells.set(j, currentSell);
                    int tradeVolume = buyRestVolume;
                    int tradePrice = currentSell.getSellPrice();
                    System.out.println("TRADE " + tradeVolume + "@" + tradePrice);
                    currentBuy.setBuyVolume(0);
                    buys.set(i, currentBuy);
                    break;
                }

            }
        }

        //remove all sell and buy orders with volume that became zero
        for (int i = sells.size() - 1; i >= 0; i--) {
            currentSell = sells.get(i);
            if (currentSell.getSellVolume() == 0) {
                sells.remove(i);
            }

        }
        for (int i = buys.size() - 1; i >= 0; i--) {
            currentBuy = buys.get(i);
            if (currentBuy.getBuyVolume() == 0) {
                buys.remove(i);
            }

        }

    }

    public static void print() {
        Collections.sort(sells);
        Collections.sort(buys);
        System.out.println("--- SELL ---");
        for (Sell sell : sells) {
            System.out.println(sell.toString());
        }
        System.out.println("--- BUY ---");
        for (Buy buy : buys) {
            System.out.println(buy.toString());
        }
    }

}
