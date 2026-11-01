package Patterns.Factory_Method;

public class Main {
    public static void processarEnvio(FabricaNotificacoes fabrica) {
        fabrica.enviarNotificacao();
    }

    public static void main(String[] args) {
        processarEnvio(new FabricaEmail());
        processarEnvio(new FabricaSMS());
    }
}