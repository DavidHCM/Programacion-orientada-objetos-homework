import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WindowDragDrop extends WindowTesting
{
    public JPanel testPanel;
    public JTextField testFieldPrint;
    public JLabel testLabel;

    public WindowDragDrop()
    {
        JFrame window= new JFrame("Ventana de prueba drag and drop");
        testPanel = new JPanel();
        testFieldPrint = new JTextField(10);
        testLabel = new JLabel("Prueba de arrastre de texto");

        testLabel.setTransferHandler(new TransferHandler("text"));
        MouseListener testMouse =new MouseAdapter() {
            // Cuando presionamos el boton a drag
            public void mousePressed(MouseEvent e) {
                JComponent testComp = (JComponent) e.getSource();
                TransferHandler testTransferencia = testComp.getTransferHandler();
                testTransferencia.exportAsDrag(testComp, e, TransferHandler.COPY);
            }
        };

        testLabel.addMouseListener(testMouse);
        testPanel.add(testLabel);
        testPanel.add(testFieldPrint);
        window.add(testPanel);
        window.setSize(300,100);
        window.setLayout(new FlowLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
