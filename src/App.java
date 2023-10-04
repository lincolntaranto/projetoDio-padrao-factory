import factory.Fruta;
import factory.Mercado;

public class App {
    public static final String MACA = "Maca";
    public static final String BANANA = "Banana";

    public static void main(String[] args) throws Exception {
        Mercado mercado = new Mercado();

        //obter um objeto de Maçã e chamar seu método exibirInformacoes
        Fruta maca = mercado.getFruta(MACA);
        if (maca != null) {
            maca.exibirInformacoes();
        } else {
            System.out.println("Fruta não encontrada: " + MACA);
        }

        //obter um objeto de Banana e chamar seu método exibirInformacoes
        Fruta banana = mercado.getFruta(BANANA);
        if (banana != null) {
            banana.exibirInformacoes();
        } else {
            System.out.println("Fruta não encontrada: " + BANANA);
        }
    }
}