import java.util.ArrayList;
import java.util.Scanner;

public class CritialThinking5Programming1CM {

    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the day of the week: ");
            String day = input.nextLine();
            days.add(day);

            System.out.print("Enter the average temperature for " + day + ": ");
            double temp = input.nextDouble();
            temperatures.add(temp);
            input.nextLine(); // consume newline
        }

        System.out.print("\nType 'week' to display the full week's temperatures and average: ");
        String command = input.nextLine();

        if (command.equalsIgnoreCase("week")) {
            double sum = 0;
            System.out.println("\nWeekly Temperatures:");
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i) + "°");
                sum += temperatures.get(i);
            }
            double average = sum / temperatures.size();
            System.out.printf("Weekly Average Temperature: %.2f°\n", average);
        }

        input.close();
    }
}
