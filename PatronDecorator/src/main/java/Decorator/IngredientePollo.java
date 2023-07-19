package Decorator;

import Menu.ComboSandwich;

public class IngredientePollo extends SandwichDecorator {
    
    public IngredientePollo(ComboSandwich wrappee) {
        super(wrappee);
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion()+"\n\t+Pollo"+"segundo";
    }

    @Override
    public float getPrecio() {
        return this.wrappee.getPrecio()+12;
    }    
        
}
