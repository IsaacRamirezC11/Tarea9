package Herencia;

public class Taxi extends Automovil{

    private String placa;
    private String nombreDelConductor;
    private int inicioDeTaximetro;

    public Taxi(){
    }

    public Taxi(String marca, String modelo, int anio, String estado, String tipo, int numDePasajeros, String acciones, String placa, String nombreDelConductor, int inicioDeTaximetro) {
        super(marca, modelo, anio, estado, tipo, numDePasajeros, acciones);
        this.placa = placa;
        this.nombreDelConductor = nombreDelConductor;
        this.inicioDeTaximetro = inicioDeTaximetro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreDelConductor() {
        return nombreDelConductor;
    }

    public void setNombreDelConductor(String nombreDelConductor) {
        this.nombreDelConductor = nombreDelConductor;
    }

    public int getInicioDeTaximetro() {
        return inicioDeTaximetro;
    }

    public void setInicioDeTaximetro(int inicioDeTaximetro) {
        this.inicioDeTaximetro = inicioDeTaximetro;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "placa='" + placa + '\'' +
                ", nombreDelConductor='" + nombreDelConductor + '\'' +
                ", inicioDeTaximetro=" + inicioDeTaximetro +
                ", estado='" + estado + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numDePasajeros=" + numDePasajeros +
                ", acciones='" + acciones + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }

    @Override
    public void encendiendo() {

        estado = "Encendiendo...";

        System.out.println("\nEl taxi de " + nombreDelConductor + " esta " + estado);

    }
    @Override
    public void apagar(){

        estado = "Apagado...";

        System.out.println("\nEl taxi de " + nombreDelConductor +" se ha "+ estado);
    }
    @Override
    public void acelerar(){

        acciones = "Avanzando...";

        System.out.println("\nEl taxi de " + nombreDelConductor + " esta " +acciones);
    }
    @Override
    public void retroceder(){

        acciones = "Retrocediendo...";

        System.out.println("\nEl taxi de " + nombreDelConductor + " esta " + acciones);
    }

    public void inicioDeViaje(){

        inicioDeTaximetro = 8;

        System.out.println("Inicia el viaje de" + nombreDelConductor);
    }

    public void detencion(){

        placa = "WSL-194";

        System.out.println("Detuvieron el taxi de " + nombreDelConductor + " porque su placa con terminacion: " + placa + "\n Indica que no circula...");
    }
}
