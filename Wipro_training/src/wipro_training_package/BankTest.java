package wipro_training_package;

abstract class Bank {
    abstract double getInterestRate();
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 6.8;
    }
}

public class BankTest {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Rate: " + b1.getInterestRate());
        System.out.println("HDFC Rate: " + b2.getInterestRate());
        System.out.println("ICICI Rate: " + b3.getInterestRate());
    }
}