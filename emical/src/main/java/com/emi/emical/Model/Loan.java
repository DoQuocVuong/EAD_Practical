package com.emi.emical.Model;
import lombok.*;

public class Loan {
    public double loan;
    public double rate;
    public double term;

    public Loan(double loan, double rate, double term) {
        this.loan = loan;
        this.rate = rate;
        this.term = term;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTerm() {
        return term;
    }

    public void setTerm(double term) {
        this.term = term;
    }

}
