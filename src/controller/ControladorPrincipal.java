package controller;

import view.VistaPrincipal;
import view.VistaPrin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorPrincipal implements ActionListener {
    private VistaPrin vista;

    public ControladorPrincipal(VistaPrin vista) {
        this.vista = vista;
        this.vista.getBtnClientes().addActionListener(this);
        this.vista.getBtnEmpleados().addActionListener(this);
        this.vista.getBtnProductos().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnClientes()) {
            JOptionPane.showMessageDialog(null, "Clientes seleccionados");
        } else if (e.getSource() == vista.getBtnEmpleados()) {
            JOptionPane.showMessageDialog(null, "Empleados seleccionados");
        } else if (e.getSource() == vista.getBtnProductos()) {
            JOptionPane.showMessageDialog(null, "Productos seleccionados");
        }
    }
}
