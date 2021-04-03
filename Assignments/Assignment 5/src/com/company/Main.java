package com.company;

public class Main {
    /**
     * In our Assignment here we're running a little lemonade stand and we also sell pretzels. We need to keep track of
     * our inventory as well as the money that we're making throughout the day. I have code in the wet code section that
     * keeps track of all of this poorly. Come up with a better way to manage our system. There's not just one way to do
     * this so get creative and most importantly remember to stay DRY!
     *
     * We're gonna look at the first hour where we have 15 customers!
     *
     * We're responsible for keeping track of the number of pretzels and lemonades sold as well as the cash on hand and
     * in the tip jar! To keep things easy I won't make you make change! At the end of the day tips are split among the
     * employees! That means DON'T add it to the cash at the end of the day or during a transaction
     *
     * At the end we're going to print out our inventory left and how much we made in case for the day! Print out the
     * tips too!
     *
     * Remember to use functions, variables, and whatever else would make this easier to maintain!
     *
     * Pretzels are $2 for 1
     * Lemonade is $8 for 1
     */
    static int lemonades_available = 43;
    static int pretzels_available = 60;
    static double cash = 1500.0;
    static double tips = 0.0;


    public static void main(String[] args) {
        dry_inventory();
    }

    static void dry_inventory() {
        int[][] customerData = {
            {4,1,4},
            {2,3,0},
            {3,0,0},
            {1,2,0},
            {0,6,10},
            {0,4,5},
            {2,0,0},
            {10,8,10},
            {6,0,0},
            {0,1,0},
            {1,0,0},
            {0,7,4},
            {2,0,0},
            {6,3,0},
            {9,2,3}
        };

        for (int[] customer: customerData){
            itemsPurchased(customer[0], customer[1], customer[2]);
        }

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }
    
    static void itemsPurchased(int pretzel_purchased, int lemonades_purchased, double tip){
        cash += pretzel_purchased * pretzel_price;
        pretzels_available -= pretzel_purchased;

        cash += lemonades_purchased * lemonade_price;
        lemonades_available -= lemonades_purchased;

        tips += tip;

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }
}
