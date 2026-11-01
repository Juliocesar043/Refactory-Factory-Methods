package Patterns.Factory_Method;

public class FabricaSMS extends FabricaNotificacoes {
    @Override
    public IntNotificacoes criarNotificacao() {
        return new EnvioSMS();
    }
}