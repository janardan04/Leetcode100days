import java.util.Scanner;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int d = numBottles;
        while (numBottles >= numExchange) {
            int exchange = numBottles / numExchange;
            int empty = numBottles % numExchange;
            d += exchange;
            numBottles = exchange + empty;
        }
        return d;
    }
}

public class WaterBottles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of bottles: ");
        int numBottles = scanner.nextInt();
        System.out.print("Enter number of bottles required for exchange: ");
        int numExchange = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.numWaterBottles(numBottles, numExchange);
        System.out.println("Maximum number of bottles you can drink: " + result);
    }
}
