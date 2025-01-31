package model;

public class Empleado {
    private int idEmpleado;
    private int idCliente;
    private String nombre;
    private String direccion;
    private int telefono;

    public Empleado(int idEmpleado, int idCliente, String nombre, String direccion, int telefono) {
        this.idEmpleado = idEmpleado;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdEmpleado() { return idEmpleado; }
    public int getIdCliente() { return idCliente; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public int getTelefono() { return telefono; }
}
