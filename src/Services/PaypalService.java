package Services;

public class PaypalService implements OnlinePaymentService {

    private static final double FEE = 0.02;
    private static final double M_INTEREST = 0.01;

    public Double paymentFee(double amount) {
        return amount * FEE;

    }

    public Double interest(double amount, int months) {
        return amount * M_INTEREST * months;
    }

}
