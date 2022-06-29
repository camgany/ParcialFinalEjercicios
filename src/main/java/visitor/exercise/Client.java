package visitor.exercise;

public class Client {

    public static void main(String[]args){
        ConcreteTurista turista= new ConcreteTurista("Laura Bozzo",100.0,"2343446LP");
        ConcreteTurista turista1= new ConcreteTurista("Justin Bieber",1200.0,"4656463CBBA");

        ConcreteLaPaz laPaz= new ConcreteLaPaz("La Paz",20,100,"Soleado",150);
        ConcreteCochabamba cochabamba= new ConcreteCochabamba("Cochabamba",5,100,"Nublado",1500);
        ConcreteSantaCruz santaCruz= new ConcreteSantaCruz("Santa Cruz",8,100,"Soleado",1000);


        turista.visitLaPaz(laPaz);
        turista.visitCochabamba(cochabamba);
        turista.visitSantaCruz(santaCruz);

        turista1.visitLaPaz(laPaz);
        turista1.visitCochabamba(cochabamba);
        turista1.visitSantaCruz(santaCruz);
    }
}