package entities;

import services.InterestService;

import java.security.InvalidParameterException;

public class GermanyInterestService implements InterestService {
    private double interestRate;

    public GermanyInterestService(double interestRate) {

        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }


}
