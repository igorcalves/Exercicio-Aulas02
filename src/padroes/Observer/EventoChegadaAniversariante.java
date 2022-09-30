package padroes.Observer;

import java.util.Date;

public class EventoChegadaAniversariante {

    public EventoChegadaAniversariante(Date momento) {
        this.momento = momento;
    }

    private final Date momento;

    public Date getMomento() {
        return momento;
    }

}
