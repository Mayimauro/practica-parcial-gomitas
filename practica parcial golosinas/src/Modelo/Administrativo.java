package Modelo;

public class Administrativo extends Empleado{
    public String area;

    ///constructor
    public Administrativo(int legajo, String nombre, String apellido, String direccion, String fechaNacimiento, String area) {
        super(legajo, nombre, apellido, direccion, fechaNacimiento);
        this.area = area;
    }

    //getter y setter
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    //metodos


    @Override
    protected float calcularSueldo() {
        return 15;
    }

    @Override
    public String toString() {
        return "\nAdministrativo" +
                "\narea=" + area  +
                "\nlegajo=" + legajo +
                "\nnombre=" + nombre +
                "\napellido=" + apellido  +
                "\ndireccion=" + direccion +
                "\nfechaNacimiento=" + fechaNacimiento +"\n";
    }
}
