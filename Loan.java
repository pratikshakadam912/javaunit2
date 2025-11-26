// Abstract class
abstract class Loan {
    double amount;
    int months;

    Loan(double amount, int months) {
        this.amount = amount;
        this.months = months;
    }

    // Abstract Method
    abstract double interestRate();

    // EMI Formula
    double calculateEMI() {
        double r = interestRate() / 12 / 100; // monthly interest
        return (amount * r * Math.pow(1 + r, months)) / (Math.pow(1 + r, months) - 1);
    }
}

// Subclass 1
class HomeLoan extends Loan {

    HomeLoan(double amount, int months) {
        super(amount, months);
    }

    double interestRate() {
        return 8.5; // 8.5% interest
    }
}

// Subclass 2
class CarLoan extends Loan {

    CarLoan(double amount, int months) {
        super(amount, months);
    }

    double interestRate() {
        return 10.2; // 10.2% interest
    }
}

class LoanDemo {
    public static void main(String[] args) {
        Loan l1 = new HomeLoan(2000000, 120); // 10 years
        Loan l2 = new CarLoan(600000, 60); // 5 years

        System.out.println("Home Loan EMI: ₹" + l1.calculateEMI());
        System.out.println("Car Loan EMI: ₹" + l2.calculateEMI());
    }
}
