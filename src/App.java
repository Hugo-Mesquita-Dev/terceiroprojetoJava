public class App {
    public static void main(String[] args) throws Exception {
        String filme = "vingador";
        int ano = 2015; // ano
        int duraçao = 240; // em minutos
        float notaCrítica = 8.7f; // pontuação
        char letraInicial = 'V';
        boolean foiSucesso = true;

        System.out.println("Descrição do Filme escolhido: ");
        // O filme <filme> lançado em <ano> , tem duração de <duraçao> minutos.
        System.out.println("O filme " + filme + " Lançado em " + ano + ", tem a duração de " + duraçao + " minutos.");
        System.out.println("O nome do fime é: " + filme);
        System.out.println("O ano de lançamento é :" + ano);
        System.out.println("Tempo de duração é :" + duraçao);
        System.out.println("A nota da Crítica é:" + notaCrítica);
        System.out.println("a Letra inicial de Pesquisa é:" + letraInicial);
        System.out.println("Sucesso de Bilheteria ? " + foiSucesso);

    }
}