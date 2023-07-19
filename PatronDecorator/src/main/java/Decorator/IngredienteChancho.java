package Decorator;

import Menu.ComboSandwich;

public class IngredienteChancho extends SandwichDecorator {

    public IngredienteChancho(ComboSandwich wrappee) {
        super(wrappee);
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion()+"\n\t+Chancho"+ "primero";
    }

    @Override
    public float getPrecio() {
        return this.wrappee.getPrecio()+15;
    }    
    
}
