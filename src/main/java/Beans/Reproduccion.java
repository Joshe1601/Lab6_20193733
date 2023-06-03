package Beans;

public class Reproduccion {

    private int cancion_idcancion;
    private String nombre_cancion;

    private String idbanda;

    public Reproduccion(int idreproduccion, String nombre_cancion, String idbanda) {
        this.cancion_idcancion = idreproduccion;
        this.nombre_cancion = nombre_cancion;
        this.idbanda = idbanda;

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
    public String getIdbanda() {
        return idbanda;
    }

    public void setIdbanda(String idbanda) {
        this.idbanda = idbanda;
    }

}


