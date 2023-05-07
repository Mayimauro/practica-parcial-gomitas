package Modelo;

public abstract class Empleado{

    public int legajo;
    public String nombre;
    public String apellido;
    public String direccion;
    public String fechaNacimiento;

    ///constructor
    public Empleado(int legajo, String nombre, String apellido, String direccion, String fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    //getter y setter
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    ///metodos



    @Override
    public boolean equals(Object obj)
    {
        boolean rta = false;

        if(obj != null)
        {

            if(obj instanceof Empleado){

                Empleado aux = (Empleado) obj;

                if(getLegajo() == aux.getLegajo())
                {
                    rta = true;
                }
            }
        }
        return rta;
    }


    protected abstract float calcularSueldo();

    public float cantidadAPagar()
    {
        return calcularSueldo();
    }

    @Override
    public String toString() {
        return "\n Empleado " +
                "\n legajo=" + legajo +
                "\n nombre=" + nombre +
                "\n apellido=" + apellido +
                "\n  direccion=" + direccion +
                "\n  fechaNacimiento=" + fechaNacimiento +"\n";
    }
}
