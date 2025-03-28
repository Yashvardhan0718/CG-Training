class Main {
    public static void main(String[] args) {

        int radius = 6378;
        
        double volume = (4/3) * 3.14 * Math.pow(radius, 3);
        
        double cubicMiles = volume * 1.6;// 1km = 1.6 miles
        
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",volume ,cubicMiles);
    }
}

