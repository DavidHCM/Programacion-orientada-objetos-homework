import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WindowNormal extends WindowTesting{

    public WindowNormal()
    {
        JFrame window = new JFrame("Ventana de prueba");
        JFrame window3 = new JFrame("Ventana de prueba despues de click");
        JLabel window2 = new JLabel("Haz hecho click", SwingConstants.CENTER);
        window2.setBounds(100,100,100,30);

        JButton button = new JButton("Haz doble click aqui");

        window.add(button);

        button.addActionListener(e -> {
            button.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        // Aquí se invoca la rutina de manejo de eventos en caso de doble click
                        window3.add(window2);
                        window3.setVisible(true);
                    }
                }
            });

        });

        window.setSize(300,300);
        window3.setSize(300,300);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        window.setVisible(true);
    }
}
