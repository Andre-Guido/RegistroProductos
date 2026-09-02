package ni.edu.uam.registroproductos.model;

import java.time.LocalDate;

public class Producto {
    private int Id;
    private String Nombre;
    private String Categoria;
    private double Precio;
    private LocalDate FechaRegistro;
    private String ImagePath;

    public Producto() {
    }

    public Producto(int id, String nombre, String categoria, double precio, LocalDate fechaRegistro, String imagePath) {
        Id = id;
        Nombre = nombre;
        Categoria = categoria;
        Precio = precio;
        FechaRegistro = fechaRegistro;
        ImagePath = imagePath;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public LocalDate getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        FechaRegistro = fechaRegistro;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }
}
