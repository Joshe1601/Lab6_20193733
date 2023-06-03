package Beans;

public class Reproduccion {
    private int idreproduccion;
    private String fecha;
    private int cancion_idcancion;
    private String idbanda;

    public Reproduccion(int idreproduccion, String nombre_tour, int nombre_ciudad, String idbanda) {
        this.idreproduccion = idreproduccion;
        this.fecha = nombre_tour;
        this.cancion_idcancion = nombre_ciudad;
        this.idbanda = idbanda;

    }

    public int getIdreproduccion() {
        return idreproduccion;
    }

    public void setIdreproduccion(int idreproduccion) {
        this.idreproduccion = idreproduccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCancion_idcancion() {
        return cancion_idcancion;
    }

    public void setCancion_idcancion(int cancion_idcancion) {
        this.cancion_idcancion = cancion_idcancion;
    }

    public String getIdbanda() {
        return idbanda;
    }

    public void setIdbanda(String idbanda) {
        this.idbanda = idbanda;
    }
}
