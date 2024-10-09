
package Datos;


public class Pelicula {
    private String nombre;
    private String director;
    private int duracion;
    private int edadMinima;
    private int ValorB;

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, int duracion, int edadMinima, int ValorB) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.ValorB = ValorB;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getValorB() {
        return ValorB;
    }

    public void setValorB(int ValorB) {
        this.ValorB = ValorB;
    }
    
}
