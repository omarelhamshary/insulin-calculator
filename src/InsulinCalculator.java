import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InsulinCalculator {
    public static void main(String[] args) {
        int CurrentBloodSugar;
        int DivisionFactor;
        double CorrectiveDose;
        int RoundDose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current blood sugar: ");
        CurrentBloodSugar = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.println("Enter the division factor(25, 30 or 35): ");
        DivisionFactor = scanner.nextInt();

        CorrectiveDose = (double) (CurrentBloodSugar - 120) / DivisionFactor;
        System.out.println();
        System.out.println("The corrective dose should be: "+ CorrectiveDose);
        RoundDose = (int) Math.round(CorrectiveDose);
        System.out.println("Approximately, you should take: "+ RoundDose);

    }

}