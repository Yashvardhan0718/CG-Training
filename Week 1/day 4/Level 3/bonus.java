import java.util.Random;

public class Main {

    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] employeeData = new int[numEmployees][2];
        Random random = new Random();

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000);
            employeeData[i][1] = 1 + random.nextInt(10);
        }

        return employeeData;
    }

    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] updatedData = new double[numEmployees][3];

        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonusAmount;
            updatedData[i][2] = bonusPercentage * 100;
        }

        return updatedData;
    }

    public static void displaySummary(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-15s %-15s %-15s %-15s\n",
                "ID", "Old Salary", "Years of Service", "Bonus %", "Bonus Amount", "New Salary");


        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double newSalary = updatedData[i][0];
            double bonusAmount = updatedData[i][1];
            double bonusPercentage = updatedData[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonusAmount;

            System.out.printf("%-5d %-10d %-15d %-15.2f %-15.2f %-15.2f\n",
                    (i + 1), oldSalary, yearsOfService, bonusPercentage, bonusAmount, newSalary);
        }


        System.out.printf("%-5s %-10.2f %-15s %-15s %-15.2f %-15.2f\n",
                "Total", totalOldSalary, "", "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        displaySummary(employeeData, updatedData);
    }
}

