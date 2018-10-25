
package model;


public class Hotel {
    private int id;
    private String nombre;
    private String ciudad;
    private int precio_por_noche;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPrecio_por_noche() {
        return precio_por_noche;
    }

    public void setPrecio_por_noche(int precio_por_noche) {
        this.precio_por_noche = precio_por_noche;
    }
}
