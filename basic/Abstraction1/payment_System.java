package Abstraction1;

interface payment {
    void pay(double amount);
}

class UPI implements payment {
    public void pay(double amount ) {
        System.out.println("paid " + amount + " Using Abstraction1.UPI" );
    }
}

class creditcard implements payment {
    public void pay (double amount ) {
        System.out.println("paid " + amount +" Using credit card ");
    }
}
class payment_System {
    public static void main (String[] args) {
        payment p;

        p=new UPI();
        p.pay(500);

        p = new creditcard();
        p.pay(1000);
    }
}
