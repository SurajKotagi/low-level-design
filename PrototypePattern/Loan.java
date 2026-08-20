package PrototypePattern;

class Loan implements Prototype<Loan> {
    private int loanId;
    private Customer customer;

    public Loan(int loanId, Customer customer) {
        this.loanId = loanId;
        this.customer = customer;
    }

    public String toString() {
        return "Loan{loanId=" + loanId + ", customer=" + customer.toString() + "}";
    }

    @Override
    public Loan clone() {
        return new Loan(this.loanId, this.customer.clone());
    }

}