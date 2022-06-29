package proxy.exercise;

public class Proxy implements ICluster {
    private RealSubjectServidor1 servidor1;
    private RealSubjectServidor2 servidor2;
    private String nombre;

    public Proxy(String nombre){
        this.nombre=nombre;
        servidor1 = new RealSubjectServidor1(this.nombre);
        servidor2 =new RealSubjectServidor2(this.nombre);
    }

    public boolean primo(int id){
        int contador = 0;

        for(int i = 1; i <= id; i++)
        {
            if((id % i) == 0)
            {
                contador++;
            }
        }

        if(contador <= 2)
        {
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void login(Usuario usuario, String password) {
        System.out.println("*********************************************************************************");
        if (usuario.getPassword()==password){
            System.out.println("Contraseña correcta!");
            if(primo(usuario.getId())){
               System.out.println("ID es primo");
                servidor1.login(usuario, password);
            }else{
                System.out.println("ID no es primo");
                servidor2.login(usuario, password);
            }
        }else{
            System.out.println("Contraseña Incorrecta! ");
        }
    }

    @Override
    public void showlIst() {
        servidor1.showlIst();
        servidor2.showlIst();
    }
}
