package SOLID.DIP;

public class Main {
    public static void main(String[] args) {
        Notificador notificadorEmail = new Notificador(new EnvioEmail());
        notificadorEmail.notificar("Mensagem via Email");

        Notificador notificadorSMS = new Notificador(new EnvioSMS());
        notificadorSMS.notificar("Mensagem via SMS");
    }
}