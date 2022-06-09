package services;

public class GermanyTaxService implements TaxService {
        public double tax(double amount) {
            if (amount > 100) {
                return amount * 0.35;
            }
            else{
                return amount * 0.40;
        }

    }
}
