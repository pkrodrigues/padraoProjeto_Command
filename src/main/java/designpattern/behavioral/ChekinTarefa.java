package designpattern.behavioral;

public class ChekinTarefa implements Tarefa
{
    private Hospedagem hospedagem;

    public ChekinTarefa(Hospedagem hospedagem)
    {
        this.hospedagem = hospedagem;
    }

    @Override
    public void executar() {
        this.hospedagem.realizarChekin();
    }

    @Override
    public void cancelar() {
        this.hospedagem.realizarChekout();
    }
}
