package decorator.exercise;

public abstract class Decorator implements IComponent {

    private IComponent componentBase;
    // agregar attributos

    public Decorator(IComponent componentBase){
        this.componentBase=componentBase;
    }

    @Override
    public void operation() {
        componentBase.operation();
        // agregar logica generica
    }
}
