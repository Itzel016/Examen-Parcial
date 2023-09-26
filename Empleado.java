//Clase Abstracta
abstract class Empleado {
    private String RFC;
    private String apellidos;
    private String nombres;

    // Constructor
    public Empleado(String rFC, String apellidos, String nombres) {
        RFC = rFC;
        this.apellidos = apellidos;
        this.nombres = nombres;

    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String rFC) {
        RFC = rFC;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    // Metodos abstractos
    public abstract double ingresos();

    public abstract double calcularBonificacion();

    public abstract double calcularDescuento();

    public abstract double calcularSueldoNeto();

    public void mostrarInformacion() {
        System.out.println("RFC: " + RFC);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nombres: " + nombres);
    }
}
