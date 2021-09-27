package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxeTest {
    @Test
    void deveRetornarCargaHoraria(){
        Boxe boxe = new Treino(new BoxeGraduacao(8.0f));

        assertEquals(8.64f, boxe.getCargaHoraria());

    }



    @Test
    void deveRetornarCargaHorariaBoxeComtreino() {
        Boxe boxe = new Treino(new BoxeGraduacao(8.0f));

        assertEquals(8.64f, boxe.getCargaHoraria());
    }


    @Test
    void deveRetornarCargaHorariaBoxeComLutaBoxe() {
        Boxe boxe = new Luta(new BoxeGraduacao(2.0f));

        assertEquals(2.02f, boxe.getCargaHoraria());
    }


    @Test
    void deveRetornarCargaHorariaBoxeComTreinoMaisLuta() {
        Boxe boxe = new Treino(new Luta(new BoxeGraduacao(10.0f)));

        assertEquals(10.908001f, boxe.getCargaHoraria());
    }


    @Test
    void deveRetornarEstruturaBoxe() {
        Boxe boxe = new BoxeGraduacao();

        assertEquals("graduacao de faixa", boxe.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoxeComtreino() {
        Boxe boxe = new Treino(new BoxeGraduacao());

        assertEquals("graduacao de faixa/Treino", boxe.getEstrutura());
    }


    @Test
    void deveRetornarEstruturaBoxeComTrabalhoConclusaoBoxe() {
        Boxe boxe = new Luta(new BoxeGraduacao());

        assertEquals("graduacao de faixa/Luta", boxe.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoxeComtreinoMaisTrabalhoConclusaoBoxe() {
        Boxe boxe = new Treino(new Luta (new BoxeGraduacao()));

        assertEquals("graduacao de faixa/Luta/Treino", boxe.getEstrutura());
    }

}