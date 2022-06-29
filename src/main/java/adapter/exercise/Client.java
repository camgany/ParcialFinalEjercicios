package adapter.exercise;

public class Client {


        public static void main(String []args) throws InterruptedException {

            ICuadratrack cuadratrack1 = new CuadratrackDiesel();
            ICuadratrack cuadratrack2 = new Adquirir(new CuadratrackElectrico());
            ICuadratrack cuadratrack3 = new CuadratrackGasolina();
            ICuadratrack cuadratrack4 = new CuadratrackGasolinaEspecial();

            Cuadratrack c = new Cuadratrack("Laura Bozzo", "6FGFG",cuadratrack1,10);
            c.showInfo();

            Cuadratrack c2 = new Cuadratrack("Cameron Dallas", "HJ6B5",cuadratrack2,8);
            c2.showInfo();

            Cuadratrack c3 = new Cuadratrack("Mario Bautista","BH5B6", cuadratrack3,15);
            c3.showInfo();

            Cuadratrack c4 = new Cuadratrack("Rafael Rodriguez","NJ6B5H", cuadratrack4,20);
            c4.showInfo();

        }

}
