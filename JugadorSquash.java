public class JugadorSquash{

    private String nombre;
    private int edad;
    private double ranking;

    public JugadorSquash (String nombre, int edad, double ranking){

        this.nombre = nombre;
        this.edad = edad;
        this.ranking = ranking;

    }

    public void setNombre (String nombre){

        this.nombre = nombre;

    }

    public void setEdad (int edad){

        this.edad = edad;

    }

    public void setRanking (double ranking){

        this.ranking = ranking;

    }

    public String getNombre(){

        return "El nombre es: " + nombre;

    }

    public int getEdad(){

        return edad;

    }

    public double getRanking(){

        return ranking;

    }

    public void entrenar(){

        System.out.println("El juegador entrena en horario de 09:00 a 12:00");

    }

    public void jugarPartido(){

        System.out.println("Los partidos se juegan los fines de semanas en horarios de 10:00 a 15:00");



    }




}