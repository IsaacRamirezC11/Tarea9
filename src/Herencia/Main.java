package Herencia;

public class Main {
    public static void main(String[] args) {

        Taxi t1 = new Taxi("Nissan","Tida",2004,"Encendido","Manual",2,"Acelerar","NBA-023","Juan Jose",8);

        Taxi t2 = new Taxi("Volskwagen","Vento",2017,"Encendido","Standar",0,"retorceder","WSL-194","Ricardo",8);

        System.out.println("");

        System.out.println(t1.toString());

        System.out.println("");

        System.out.println(t2.toString());

        System.out.println("");

        t1.encendiendo();
        System.out.println("");

        t2.encendiendo();
        System.out.println("");

        t1.acelerar();
        System.out.println("");

        t2.retroceder();
        System.out.println("");

        t1.inicioDeViaje();
        System.out.println("");

        t2.apagar();
        System.out.println("");

        t2.detencion();
        System.out.println("");

    }

}
