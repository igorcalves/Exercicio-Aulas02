package padroes.Observer;

public class AniversarioSupeesa {

    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservador(namorada);

        porteiro.registrarObservador(e -> {

            System.out.println("Surpresa via Lambda \n" + e.getMomento());

        });

        porteiro.monitorar();

    }
}
