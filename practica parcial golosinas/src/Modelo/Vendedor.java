package Modelo;

public class Vendedor extends Empleado{
    public int ventasMensuales;  //en cantidad de dinero


    ///constructor
    public Vendedor(int legajo, String nombre, String apellido, String direccion, String fechaNacimiento, int ventasMensuales) {
        super(legajo, nombre, apellido, direccion, fechaNacimiento);
        this.ventasMensuales = ventasMensuales;
    }

    //getter y setter
    public int getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(int ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    //metodos

    @Override
    protected float calcularSueldo() {
        return (float) (ventasMensuales*0.3);
    }

    @Override
    public String toString() {
        return "\nVendedor" +
                "\nventasMensuales=" + ventasMensuales +
                "\nlegajo=" + legajo +
                "\nnombre=" + nombre +
                "\napellido=" + apellido +
                "\ndireccion=" + direccion +
                "\nfechaNacimiento=" + fechaNacimiento+"\n";
    }
}
