package Strategy;

public class FastSpring implements PagoStrategy {

    @Override
    public void pagar() {
        System.out.println("Se ha pagado con FastSpring!!\n");
    }
    
}
