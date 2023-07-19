package Decorator;

import Menu.ComboSandwich;

public abstract class SandwichDecorator implements ComboSandwich {
    
    protected ComboSandwich wrappee;
    
    public SandwichDecorator(ComboSandwich wrappee){
        this.wrappee = wrappee;
    }
    
    @Override
    public String getDescripcion() {
        return this.wrappee.getDescripcion();
    }

    @Override
    public float getPrecio() {
        return this.wrappee.getPrecio();
    }
    
}
