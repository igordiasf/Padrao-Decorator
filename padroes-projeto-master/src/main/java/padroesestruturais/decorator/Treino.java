package padroesestruturais.decorator;

public class Treino extends BoxeDecorator {

    public Treino(Boxe boxe) {
        super(boxe);
    }

    public float getPercentualCargaHoraria() {
        return 8.0f;
    }

    public String getNomeEstrutura() {
        return "Treino";
    }
}
