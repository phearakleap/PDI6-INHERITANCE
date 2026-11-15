public class exercise7 {
    public static void main(String[] args){
        CreditCardPayment ccPay = new CreditCardPayment();
        PayPalPayment ppPay = new PayPalPayment();
        BanKTransferPayment btPay = new BanKTransferPayment();

        ccPay.process_payment(78.52);
        ppPay.process_payment(10.50);
        btPay.process_payment(5.76);
    }
}

abstract class Payment{
    public abstract void process_payment(double amount);
}

class CreditCardPayment extends Payment{
    public void process_payment(double amount){
        System.out.printf("Paid %.2f via credit card.\n", amount);
    }
}

class PayPalPayment extends Payment{
    public void process_payment(double amount){
        System.out.printf("Paid %.2f via PayPal.\n", amount);
    }
}

class BanKTransferPayment extends Payment{
    public void process_payment(double amount){
        System.out.printf("Paid %.2f via bank transfer\n", amount);
    }
}

