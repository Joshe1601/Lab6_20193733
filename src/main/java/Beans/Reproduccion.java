package Beans;

public class Reproduccion {

    private int cancion_idcancion;
    private String nombre_cancion;
    private String nombre_banda;

    public Reproduccion(int idreproduccion, String nombre_cancion, String nombre_banda) {
        this.cancion_idcancion = idreproduccion;
        this.nombre_cancion = nombre_cancion;
        this.nombre_banda = nombre_banda;

    }

    public int getCancion_idcancion() {
        return cancion_idcancion;
    }

    public void setCancion_idcancion(int cancion_idcancion) {
        this.cancion_idcancion = cancion_idcancion;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    public String getNombre_banda() {
        return nombre_banda;
    }

    public void setNombre_banda(String nombre_banda) {
        this.nombre_banda = nombre_banda;
    }

}


