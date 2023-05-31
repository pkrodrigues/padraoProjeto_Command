import designpattern.behavioral.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecepcionistaTest
{
    Recepcionista recepcionista;
    Hospedagem hospedagem;
    @BeforeEach
    void setUp()
    {
        recepcionista = new Recepcionista();
        hospedagem = new Hospedagem(102, "Suite");
    }

    @Test
    void deveRealizarChekin()
    {
        Tarefa fazerChekin = new ChekinTarefa(hospedagem);
        recepcionista.executarTarefa(fazerChekin);

        assertEquals(true, hospedagem.getStatus());
    }

    @Test
    void deveRealizarChekout()
    {
        Tarefa fazerChekout = new ChekoutTarefa(hospedagem);
        recepcionista.executarTarefa(fazerChekout);
        assertEquals(false, hospedagem.realizarChekout());
    }

    @Test
    void deveCancelarChekout() {
        Tarefa fazerChekin = new ChekinTarefa(hospedagem);
        Tarefa fazerChekout = new ChekoutTarefa(hospedagem);

        recepcionista.executarTarefa(fazerChekin);
        recepcionista.executarTarefa(fazerChekout);

        recepcionista.cancelarUltimaTarefa();
        assertEquals(true, hospedagem.getStatus());
    }
}
