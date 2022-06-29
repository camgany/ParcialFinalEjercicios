package bridge.exercise;


public class Client {
    public static void main (String[]args){
        IRedSocial facebook = new RedFacebook(100000,1245);
        IRedSocial whatsApp = new RedWhatsApp(20000,12433);
        IRedSocial twitter = new RedTwitter(12000,2345);

        Estudiante estudiante1 = new Estudiante("Laura Bozzo","35h4b6");
        Estudiante estudiante2 = new Estudiante("Cameron Dallas","354b5h");
        Estudiante estudiante3 = new Estudiante("Mario Bautista","h4534v5");
        Estudiante estudiante4 = new Estudiante("Rafael Zerboni","h4b54hb");

        ISistemas colegio = new SistemaColegio("Elite Way School",100,new Estudiante[]{estudiante1,estudiante2,estudiante3,estudiante4},"CI, certificado de nacimiento, fotocopia de carnet de identidad");

        Estudiante estudiante5 = new Estudiante("Marina Zambrana","4h5b4h");
        Estudiante estudiante6 = new Estudiante("Samuel Salas","5by4y5");
        Estudiante estudiante7 = new Estudiante("Doja Cat","h4b53");
        Estudiante estudiante8 = new Estudiante("Salvador Aguirre","g4v5g4");

        ISistemas escuela = new SistemaEscuela("Las Encinas",150, new Estudiante[]{estudiante5,estudiante6,estudiante7,estudiante8},"CI");

        Estudiante estudiante9 = new Estudiante("Camilo Encinas","gv43g4");
        Estudiante estudiante10 = new Estudiante("Caleb Burton","g5y4g5");
        Estudiante estudiante11 = new Estudiante("Tony Dize","h5b6h5");
        Estudiante estudiante12 = new Estudiante("Catalina Acosta","d3cr4f");

        ISistemas universidad = new SistemaUniversidad("UPB", 250,new Estudiante[]{estudiante9,estudiante10,estudiante11,estudiante12},"Certificado de Bachiller, ci, certificado de nacimiento");

        facebook.showInfo(colegio);

        whatsApp.showInfo(escuela);

        twitter.showInfo(universidad);
    }
}
