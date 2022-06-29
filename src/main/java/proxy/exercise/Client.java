package proxy.exercise;

public class Client {

    public static void main (String []args){

        ICluster proxy = new Proxy("CODYME");

        Usuario usuario1 = new Usuario(6,"LauraBozzo","7d6fd");
        Usuario usuario2 = new Usuario(13, "MariaBecerra","2g35g4");

        proxy.login(usuario1,"7d6fd");
        proxy.login(usuario2,"2g35g4");


    }

}
