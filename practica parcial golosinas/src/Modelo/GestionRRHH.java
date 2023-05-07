package Modelo;

import java.util.ArrayList;

public class GestionRRHH {

    ArrayList <Empleado> empleados;

    public GestionRRHH(){
        empleados = new ArrayList<Empleado>();
    }
    public GestionRRHH(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    //metodos

    public boolean agregarEmpleado(Empleado empleadoAgregar)
    {
        boolean rta = true;
        int i=0;
        if(empleados != null) {
            while (i<empleados.size() && rta == true) {

                if (empleados.get(i).equals(empleadoAgregar)) {
                    rta = false;
                }
                i++;
            }
        }
        if(rta == true) {
            empleados.add(empleadoAgregar);
        }
        return rta;
    }

    public boolean existeEmpleado(int legajo)
    {
        boolean rta = false;
        for(int i =0;i<empleados.size();i++)
        {
            if(empleados.get(i).legajo == legajo)
            {
                rta = true;
            }
        }
        return rta;
    }

    public float calcularTotalSueldo()
    {
        float aux = 0;

        for(int i=0;i<empleados.size();i++)
        {
            aux = aux + empleados.get(i).calcularSueldo();
        }
        return aux;
    }
    public boolean eliminarEmpleado(int legajo)
    {
        boolean rta = false;
        for(int i=0;i<empleados.size();i++) {
            if(empleados.get(i).legajo == legajo)
            {
                empleados.remove(i);
                rta = true;
            }
        }
        return rta;
    }

    public boolean conMismoNombre(String s)
    {
        boolean rta = false;
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).nombre.equals(s))
            {
                rta = true;
            }
        }
        return rta;
    }

    @Override
    public String toString() {
        return ""+empleados+"\n";
    }

    public int cantidadEmpleados(){
        return empleados.size();
    }
}
