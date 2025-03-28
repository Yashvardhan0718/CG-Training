The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
class Main {
    public static void main(String[] args) {

        int costPrice = 129; //given
        int sellingPrice = 191; //given

        int profit = sellingPrice - costPrice; //find profit
        double profitPercentage = ((double)profit / (double)costPrice) * 100;

        System.out.printf("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is %.2f", profitPercentage);
    }
}

