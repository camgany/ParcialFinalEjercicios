package proxy.exercise;

public class Client {

    public static void main (String []args){

        ICluster proxy = new Proxy("CODYME");

        Usuario usuario1 = new Usuario(6,"LauraBozzo","7d6fd");
        Usuario usuario2 = new Usuario(13, "MariaBecerra","2g35g4");
        Usuario usuario3 = new Usuario(7,"MarioBautista","h4b5h");
        Usuario usuario4 = new Usuario(9, "BrentRivera","3bh42h");

        proxy.login(usuario1,"7d6fd");
        proxy.login(usuario2,"2g35g4");
        proxy.login(usuario3,"h4b5h");
        proxy.login(usuario4,"3bh42h");

        proxy.showlIst();

    }

}
