public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-Vindo ao WatchMe!");
        System.out.println("Filme: Spirit - O corcel indomável");

        int anoLancamento = 2002;
        System.out.println("Ano de lançamento: " + anoLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Spirit - O corcel indomável
                Um cavalo que luta pela sua liberdade!
                Ano de lançamento           
                """ + anoLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}