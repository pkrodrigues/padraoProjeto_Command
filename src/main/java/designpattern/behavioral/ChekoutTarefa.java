package designpattern.behavioral;

public class ChekoutTarefa implements Tarefa
{
    private Hospedagem hospedagem;

    public ChekoutTarefa(Hospedagem hospedagem)
    {
        this.hospedagem = hospedagem;
    }

    @Override
    public void executar() {
        this.hospedagem.realizarChekout();
    }

    @Override
    public void cancelar() {
        this.hospedagem.realizarChekin();
    }
}
