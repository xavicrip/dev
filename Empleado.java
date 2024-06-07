public class Empleado {

    private double sueldo;
    private int numeroEmpleados;
    private String nombreEmpleado;

    public Empleado(double sueldo, int numeroEmpleados, String nombreEmpleado){

        this.sueldo = sueldo;
        this.numeroEmpleados = numeroEmpleados;
        this.nombreEmpleado = nombreEmpleado;

    }

    // get y set

    public void setSueldo(double sueldo){

        this.sueldo = sueldo;


    }

    public double getSueldo(){

        return sueldo;

    }






}