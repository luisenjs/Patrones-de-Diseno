package Menu;

public class ComboB implements ComboSandwich{
    
    @Override
    public String getDescripcion() {
        return "---Sandwich simple---\nIncluye:\n\t+Coca cola de 600ml";
    }

    @Override
    public float getPrecio() {
        return 30.00f;
    }
    
}
