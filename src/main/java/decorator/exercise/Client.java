package decorator.exercise;


public class Client {
    public static void main (String []args){
        Celular celular = new Celular(100);
        IMarca samsung = new MarcaSamsung();
        IMarca xiaomi = new MarcaXiaomi();
        IMarca apple = new MarcaApple();
        samsung.agregarCelular(celular);

        samsung = new DecoratorMemoria(samsung,22,15);
        samsung.decorarCelular(celular);

        samsung = new DecoratorCarcasa(samsung,10);
        samsung.decorarCelular(celular);

        samsung = new DecoratorVidrio(samsung,14);
        samsung.decorarCelular(celular);
/////////////////////////////////////////////////////////////////////////////////////////
        Celular celular2 = new Celular(200);
        xiaomi.agregarCelular(celular2);

        xiaomi = new DecoratorMemoria(xiaomi,12,24);
        xiaomi.decorarCelular(celular2);
        xiaomi = new DecoratorCarcasa(xiaomi,21);
        xiaomi.decorarCelular(celular2);
        xiaomi=new DecoratorVidrio(xiaomi,5);
        xiaomi.decorarCelular(celular2);
    }
}
