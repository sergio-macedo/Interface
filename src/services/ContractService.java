package services;

import entities.Contract;
import entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;


    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double basis = contract.getTotalValue()/months;
        for (int i = 0; i<= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double updateBasis = basis + onlinePaymentService.interest(basis, i);
            double full = updateBasis + onlinePaymentService.paymentFee(updateBasis);
            contract.addInstallment(new Installment(date,full));
        }

    }

    private Date addMonths(Date date , int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH,n);
        return cal.getTime();
    }

}

