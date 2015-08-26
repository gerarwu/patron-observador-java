/**
 * Created by gerardo on 26/08/15.
 */
public class Main {

    public static void main(String[] args){

        System.out.println("*****main init******");

        Nomina emp = new Nomina();
        Timbre sat = new Timbre();

        emp.linkea(sat);
        emp.nominaLista();

    }
}
