package Strategy;

public class Paypal implements PagoStrategy {

    @Override
    public void pagar() {
        System.out.println("Se ha pagado con PayPal!!\n");
    }
    
}
