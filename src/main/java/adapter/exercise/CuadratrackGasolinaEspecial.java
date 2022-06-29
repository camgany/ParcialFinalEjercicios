package adapter.exercise;

import java.util.Random;

public class CuadratrackGasolinaEspecial implements ICuadratrack {
    @Override
    public int llenarGasolina(int atributo) {
        System.out.println("---------------------------LLENAR TANQUE CON GASOLINA ESPECIAL----------------------------------");
        if(atributo>=0 && atributo<=50){
            System.out.println("Llenando tanque de gasolina.........");
            return atributo;
        }else {
            System.out.println("Tanque lleno...............");
            return 0;
        }

    }

    @Override
    public int estadoCOmbustible() {
        System.out.println("---------------------------ESTADO COMBUSTIBLE CON GASOLINA ESPECIAL----------------------------------");
        int num = new Random().nextInt(50-1)+1;
        System.out.println("Verificando estado de gasolina...................");
        return num;
    }
}


