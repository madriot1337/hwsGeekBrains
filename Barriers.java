public abstract class Barriers {
    private String name;
    private int parameter;

    public Barriers(String name){
        this.name = name;


    }
    protected abstract boolean moving(Players player);

    public String getName() {
        return name;
    }
}


