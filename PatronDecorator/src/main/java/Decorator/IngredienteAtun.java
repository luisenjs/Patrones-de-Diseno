package Decorator;

import Menu.ComboSandwich;

public class IngredienteAtun extends SandwichDecorator {
    
    public IngredienteAtun(ComboSandwich wrappee) {
        super(wrappee);
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion()+"\n\t+Atun";
    }

    @Override
    public float getPrecio() {
        return this.wrappee.getPrecio()+20;
    }        
    
}
