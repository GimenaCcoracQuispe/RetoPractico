import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class VentanaAvanzada extends JFrame {
    private JButton boton;

    public VentanaAvanzada() {
        super("Bienvenid@");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        setIconImage(new ImageIcon("icon.png").getImage());

        boton = new JButton("Mostrar saludo");
        boton.setBackground(new Color(173, 216, 230));

        Locale locale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("mensajes", locale);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
                if (nombre != null && !nombre.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            bundle.getString("saludo") + " " + nombre + "!");
                }
            }
        });

        add(boton);
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new VentanaAvanzada().setVisible(true);
    }
}
