package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.abrir();
        System.out.println(caixaA.abrir());

        CaixaNumero<Double> caixaB = new CaixaNumero<>();
        caixaB.abrir();
        System.out.println(caixaB.abrir());

    }
}
