package decorator.exercise;

public class DecoratorCarcasa extends Decorar{
    private int precio;

    public DecoratorCarcasa(IMarca marca, int precio) {
        super(marca);
        this.precio = precio;
    }

    @Override
    public void decorarCelular(Celular celular) {
        System.out.println("-------------DECORANDO CARCASA---------------");
        celular.setPrecio(celular.getPrecio()+precio);
        celular.showInfo();
    }
}
