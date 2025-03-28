public class Main {

    public double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * (Math.pow(windSpeed,0.16));
        return windChill;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int temperature = sc.nextInt();
        int windSpeed = sc.nextInt();
        System.out.println(obj.calculateWindChill(temperature,windSpeed));
    }

}
