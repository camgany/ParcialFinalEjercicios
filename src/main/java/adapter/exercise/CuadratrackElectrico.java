package adapter.exercise;

import java.util.Random;

public class CuadratrackElectrico implements IElectricos {
    @Override
    public int cargar(int numero) {
        System.out.println("---------------------------LLENAR TANQUE CON ELECTRICIDAD----------------------------------");
        if(numero>=0 && numero<=20 && numero%2==0){
            return numero;
        }else {
           System.out.println("Numero introducido es impar, para cargarlo, debe ser par");
        }
        return 0;
    }

    @Override
    public int estadoDeElectricidad() {
        System.out.println("---------------------------LLENAR TANQUE CON ELECTRICIDAD----------------------------------");
        System.out.println("Verficando estado de Eletricidad................");
        int num = new Random().nextInt(10-1)+1;
        return num;
    }
}
