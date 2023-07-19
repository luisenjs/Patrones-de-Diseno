package Decorator;

import Menu.ComboSandwich;

public class IngredienteJamon extends SandwichDecorator{

    public IngredienteJamon(ComboSandwich wrappee) {
        super(wrappee);
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion()+"\n\t+Jamon";
    }

    @Override
    public float getPrecio() {
        return this.wrappee.getPrecio()+5;
    }        
    
}
