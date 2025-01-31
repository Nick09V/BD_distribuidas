package model;

public class Producto {
    private int idProducto;
    private int idSucursal;
    private int idInventario;
    private String codigo;
    private String tipo;
    private String color;

    public Producto(int idProducto, int idSucursal, int idInventario, String codigo, String tipo, String color) {
        this.idProducto = idProducto;
        this.idSucursal = idSucursal;
        this.idInventario = idInventario;
        this.codigo = codigo;
        this.tipo = tipo;
        this.color = color;
    }

    public int getIdProducto() { return idProducto; }
    public int getIdSucursal() { return idSucursal; }
    public int getIdInventario() { return idInventario; }
    public String getCodigo() { return codigo; }
    public String getTipo() { return tipo; }
    public String getColor() { return color; }
}
