import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws EmpleadoPermanente.SalarioInvalidoException {
        Scanner scanner = new Scanner(System.in);
        try {
          // Crear un empleado vendedor
            System.out.println("Creación de Empleado Vendedor:");
            System.out.print("RFC: ");
            String rfcVendedor = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidosVendedor = scanner.nextLine();
            System.out.print("Nombres: ");
            String nombresVendedor = scanner.nextLine();
            System.out.print("Monto Vendido: ");
            double montoVendido = scanner.nextDouble();
            System.out.print("Tasa de Comisión: ");
            double tasaComision = scanner.nextDouble();

            Empleado empleadoVendedor = new EmpleadoVendedor(rfcVendedor, apellidosVendedor, nombresVendedor, montoVendido, tasaComision);
            
            // Mostrar información de empleados
            System.out.println("\nInformación del Empleado Vendedor:");
            empleadoVendedor.mostrarInformacion();
            System.out.println("Ingresos: $" + empleadoVendedor.ingresos());
            System.out.println("Bonificación: $" + empleadoVendedor.calcularBonificacion());
              // Crear un empleado permanente
            System.out.println("\nCreación de Empleado Permanente:");
            System.out.print("RFC: ");
            String rfcPermanente = scanner.nextLine(); // Limpiar el buffer
            rfcPermanente = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidosPermanente = scanner.nextLine();
            System.out.print("Nombres: ");
            String nombresPermanente = scanner.nextLine();
            System.out.print("Sueldo Base: ");
            double sueldoBase = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Número de Seguro Social: ");
            String numeroSeguroSocial = scanner.nextLine();

            Empleado empleadoPermanente = new EmpleadoPermanente(rfcPermanente, apellidosPermanente, nombresPermanente, sueldoBase, numeroSeguroSocial);

          empleadoVendedor.calcularBonificacion();
      } catch (IllegalArgumentException e) {
          System.out.println("Error: " + e.getMessage());
          // TODO: handle exception
      }
  
              }//main
               }//main