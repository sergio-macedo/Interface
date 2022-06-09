package course;

import entities.BrazilInterestService;
import entities.GermanyInterestService;
import services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class InterestProgram {
     public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount");
        double amount = sc.nextDouble();
        System.out.println("Months");
        int months = sc.nextInt();

        InterestService interestService = new BrazilInterestService(10);
        double payment = interestService.payment(amount, months);

        System.out.println("payment after " + months + "months:");
        System.out.println(String.format("%.2f", payment));
        sc.close();
    }
}
