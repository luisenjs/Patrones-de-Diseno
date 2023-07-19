package Strategy;

public class AmazonPay implements PagoStrategy {

    @Override
    public void pagar() {
        System.out.println("Se ha pagado con AmazonPay!!\n");
    }
    
}
