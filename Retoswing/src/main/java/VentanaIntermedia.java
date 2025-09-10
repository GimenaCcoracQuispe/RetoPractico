import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaIntermedia {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bienvenid@");
        JButton boton = new JButton("Mostrar saludo");
        boton.setBackground(new Color(100, 180, 255));

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog(frame, "¿Cuál es tu nombre?");
                if (nombre != null && !nombre.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "¡Hola, " + nombre + "! ¡Buen trabajo!");
                } else {
                    JOptionPane.showMessageDialog(frame, "No ingresaste un nombre válido.");
                }
            }
        });

        frame.add(boton);
        frame.getContentPane().setBackground(new Color(230, 240, 250)); // Fondo del frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
