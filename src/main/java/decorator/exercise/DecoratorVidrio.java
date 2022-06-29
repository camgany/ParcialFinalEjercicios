package decorator.exercise;

public class DecoratorVidrio extends Decorar{
    private int precio;

    public DecoratorVidrio(IMarca marca, int precio) {
        super(marca);
        this.precio = precio;
    }

    @Override
    public void decorarCelular(Celular celular) {
        System.out.println("-------------DECORANDO VIDRIO TEMPLADO---------------");
        celular.setPrecio(celular.getPrecio()+precio);
        celular.showInfo();
    }
}
