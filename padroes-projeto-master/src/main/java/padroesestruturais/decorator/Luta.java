package padroesestruturais.decorator;

public class Luta extends BoxeDecorator {

    public Luta(Boxe boxe) {
        super(boxe);
    }

    public float getPercentualCargaHoraria() {
        return 1.0f;
    }

    public String getNomeEstrutura() {
        return "Luta";
    }
}
