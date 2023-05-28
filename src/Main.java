import Modelo.Administrativo;
import Modelo.Empleado;
import Modelo.GestionRRHH;
import Modelo.Vendedor;

public class Main {
    public static void main(String[] args) {

        GestionRRHH empleados = new GestionRRHH();
        Archivo arch1 = new Archivo();

        Empleado admin1 = new Administrativo(233,"carlos","saenz","calle 1","20/2/98","oficina");
        Empleado ventas1 = new Vendedor(234,"susana","gimenez","calle 2","20/3/78",100);
        Empleado ventas2 = new Vendedor(123,"pedro","pascal","calle 3","20/3/342",100);
        Empleado ventas3 = new Vendedor(123,"juan","pascal","calle 6","20/3/34",100);

        //arch1.agregarAlArchivo(admin1);
        arch1.agregarAlArchivo(ventas1);
        arch1.agregarAlArchivo(ventas2);
        arch1.agregarAlArchivo(ventas3);

        arch1.leerArchivo();
/*
        System.out.println("se agrego al empleado? " + empleados.agregarEmpleado(admin1));
        System.out.println("se agrego al empleado? " + empleados.agregarEmpleado(ventas3));
        System.out.println("se agrego al empleado? " + empleados.agregarEmpleado(ventas1));
        System.out.println("se agrego al empleado? " + empleados.agregarEmpleado(ventas2));
        System.out.println("se agrego al empleado? " + empleados.agregarEmpleado(ventas3));



        System.out.println("cantidad de empleados " + empleados.cantidadEmpleados()+ "\n");
        System.out.println("listado empleados " + empleados.toString());

        System.out.println("\nexiste el empleado 234? "+ empleados.existeEmpleado(234) +"\n");

        System.out.println("\nel sueldo total a pagar es de  "+ empleados.calcularTotalSueldo() +"\n");
        System.out.println("\neliminar empleado 234  "+ empleados.eliminarEmpleado(234) +"\n");
        String p = "jorge";
        System.out.println("\nhay un empleado llamado " + p + "? " + empleados.conMismoNombre(p) +"\n");

        System.out.println("cantidad de empleados " + empleados.cantidadEmpleados());

*/

    }
}