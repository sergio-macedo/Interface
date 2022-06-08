package course;

import Services.ContractService;
import Services.PaypalService;
import entities.Contract;
import entities.Installment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ContractProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data ");
        int number = sc.nextInt();
        System.out.println("Enter contract date");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter the number of Installments: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, n);

        System.out.println("Installments");
        for(Installment i : contract.getInstallments()) {
            System.out.println(i);
        }

        sc.close();
    }
}