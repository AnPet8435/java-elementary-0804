package FarmBusiness;

public class FarmCalc {
    public static void main(String[] args) {
        FarmBusinessInit farmCalc = new FarmBusinessInit();
        final int daysPerYear = 365;
        int cows = farmCalc.setNumCows(56);
        float milk = farmCalc.setamMilk(3.8f);
        float sellMilk = farmCalc.setsaleRev(5.3f);
        float taxes = farmCalc.setpayTax(12f);
        float salary = farmCalc.setpayWork(8);
        float cowFeed = farmCalc.setamFeed(7);
        float feedPrise = farmCalc.setpriseFeed(2);
        float buyfarm = farmCalc.setcostNewFarm(750);
        float profit = (cows * milk * sellMilk) * daysPerYear;
        float feedCost = (cows * cowFeed * feedPrise) * daysPerYear;
        if (farmCalc.checkInput()) {
            float answer = getFarmProfit(profit, feedCost, taxes, salary, buyfarm);
            System.out.println("You may buy " + answer + " new farms per year");
        }

    }

    public static float getFarmProfit(float p, float feedC, float t, float s, float bf) {
        float clearProfit = (p - feedC) * (t / 100) * (s / 100);
        float chanseToBuy = (clearProfit / bf);
        if (chanseToBuy <= 1) {
            System.out.println("NOT PROFITABLE");
        }
        if ((chanseToBuy >= 1) && (chanseToBuy <= 3)) {
            System.out.println("PROFITABLE");
        }
        if (chanseToBuy > 3) {
            System.out.println("SUPER PROFITABLE");
        }
        return chanseToBuy;
    }

}
