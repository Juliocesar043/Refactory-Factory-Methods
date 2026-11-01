package Patterns.Abstract_Factory;

public class Main {
    public static void renderizarAplicacao(Fabricas fabrica) {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }

    public static void main(String[] args) {
        renderizarAplicacao(new FabricaAndroid());
        renderizarAplicacao(new FabricaIOS());
    }
}