package Patterns.Factory_Method;

public abstract class FabricaNotificacoes {
    public abstract IntNotificacoes criarNotificacao();

    public void enviarNotificacao() {
        IntNotificacoes notificacao = criarNotificacao();
        notificacao.enviar();
    }
}