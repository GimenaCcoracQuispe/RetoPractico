import javax.swing.*;
import java.awt.event.*;

public class VentanaBasica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bienvenid@");
        JButton boton = new JButton("Mostrar saludo");

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "¡Hola, buen trabajo Gimena!");
            }
        });

        frame.add(boton);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
