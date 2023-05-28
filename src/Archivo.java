
import Modelo.Empleado;
import Modelo.GestionRRHH;

import java.io.*;

import java.io.IOException;

public class Archivo{
    String nombreArchivo = "Empleados.dat";
    String ubicacionArchivo = "F:/ideal java/proyectos java/practica parcial golosinas";


    public Archivo()
    {
        File archivo = new File(ubicacionArchivo, nombreArchivo);
    }

    public void agregarAlArchivo(Object obj)
    {
        try {
            FileOutputStream fileOut = new FileOutputStream(ubicacionArchivo + "/" + nombreArchivo, true);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(obj);

            objectOut.close();
            fileOut.close();

            System.out.println("se agregaron correctamente");

        }catch (IOException e){
            System.out.println("Ha ocurrido un error al agregar objetos al archivo: " + e.getMessage());
        }
    }

    public void leerArchivo()
    {
        try {
            FileInputStream fileIn = new FileInputStream(ubicacionArchivo + "/" + nombreArchivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            while (true) {
                try {


                    Object obj = (Empleado) objectIn.readObject();

                    System.out.println(obj.toString());


                } catch (IOException e) {
                    System.out.println("Ha ocurrido un error al leer objetos del archivo: " + e.getMessage());
                    break;
                } catch (ClassNotFoundException e) {
                    System.out.println("La clase de objeto no se ha encontrado: " + e.getMessage());
                }
            }

                objectIn.close();
                fileIn.close();
                System.out.println("Finalizo la lectura del archi");
        }catch (IOException e)
        {
            System.out.println("Ha ocurrido un error al leer objetos del archivo: " + e.getMessage());
        }

    }



}
