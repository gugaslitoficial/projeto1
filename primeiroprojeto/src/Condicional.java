public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2002;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento que é sucesso atual.");
        } else{
            System.out.println("O filme retrô mais popular entre as crianças!");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado para assistir");
        } else {
            System.out.println("Deve pagar sua fatura");
        }
    }
}
