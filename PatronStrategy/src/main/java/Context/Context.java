package Context;

import Strategy.PagoStrategy;

public class Context {
    
    private PagoStrategy strategy;
    
    public void setStrategy(PagoStrategy pago){
        this.strategy = pago;
    }
    
    public void realizarTransaccion(){
        strategy.pagar();
    }
    
}
