package padroesestruturais.decorator;

public class BoxeGraduacao implements Boxe{

    public float cargaHoraria;

    public BoxeGraduacao() {
    }

    public BoxeGraduacao(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public String getEstrutura() {
        return "graduacao de faixa";
    }

}
