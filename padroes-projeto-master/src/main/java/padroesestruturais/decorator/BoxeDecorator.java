package padroesestruturais.decorator;

public abstract class BoxeDecorator implements Boxe{

    private Boxe boxe;
    public String estrutura;

    public BoxeDecorator(Boxe boxe) {
        this.boxe= boxe;
    }

    public Boxe getboxe() {
        return boxe;
    }

    public void setBoxe(Boxe boxe) {
        this.boxe= boxe;
    }

    public abstract float getPercentualCargaHoraria();

    public float getCargaHoraria() {
        return this.boxe.getCargaHoraria() * (1 + (this.getPercentualCargaHoraria() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.boxe.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
