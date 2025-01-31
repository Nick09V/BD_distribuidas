package view;

import javax.swing.*;

public class VistaPrin extends JFrame {
    private JButton btnClientes, btnEmpleados, btnProductos;
    
    public VistaPrin() {
        setTitle("Gestión de Inventarios");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        btnClientes = new JButton("Clientes");
        btnClientes.setBounds(50, 50, 150, 30);
        add(btnClientes);
        
        btnEmpleados = new JButton("Empleados");
        btnEmpleados.setBounds(50, 100, 150, 30);
        add(btnEmpleados);
        
        btnProductos = new JButton("Productos");
        btnProductos.setBounds(50, 150, 150, 30);
        add(btnProductos);
    }
    
    public JButton getBtnClientes() { return btnClientes; }
    public JButton getBtnEmpleados() { return btnEmpleados; }
    public JButton getBtnProductos() { return btnProductos; }
}
