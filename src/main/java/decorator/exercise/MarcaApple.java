package decorator.exercise;

public class MarcaApple implements IMarca {
    @Override
    public void agregarCelular(Celular celular) {
        celular.setCpu("Apple");
        celular.setAlmacenamiento(40);
        celular.setRam(12);
        System.out.println("////////////////////////////INFORMACION INICIAL///////////////////////////////");
        celular.showInfo();
    }

    @Override
    public void decorarCelular(Celular celular) {

    }
}
