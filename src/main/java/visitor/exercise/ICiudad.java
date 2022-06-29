package visitor.exercise;

public interface ICiudad {
    void accept(IVisitante visitor);
    void showInfo();
}