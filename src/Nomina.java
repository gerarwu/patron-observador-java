import java.util.ArrayList;

/**
 * Created by gerardo on 26/08/15.
 */
public class Nomina implements Sujeto {

    private ArrayList<Observador> observadores;

    public Nomina(){
        observadores = new ArrayList<Observador>();
    }

    public void nominaLista(){
        notifica();
    }

    public void  linkea(Observador obs){
        observadores.add(obs);
    }

    @Override
    public void notifica() {

        for(Observador obs : observadores){
            obs.update();
        }
    }
}
