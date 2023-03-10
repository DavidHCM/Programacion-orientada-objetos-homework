import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int sent = 1,max = 6,min = 1,cont = 0;


        while (sent != 0) {
            int int_random1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            int int_random2 = (int)Math.floor(Math.random() * (max - min + 1) + min);


            int res = int_random2 + int_random1;

            if ((res == 7) || (res == 11)) {
                JOptionPane.showMessageDialog(null,"Lanzaste: " + int_random1 + ", " + int_random2 + "\nGanas la apuesta y obtuviste: " + cont + " puntos","Ganaste",JOptionPane.INFORMATION_MESSAGE);
                sent = 0;
            } else if ((res == 2) || (res == 3) || (res == 12) ) {

                JOptionPane.showMessageDialog(null,"Lanzaste: " + int_random1 +", " + int_random2 +  "\nPerdiste la apuesta y obtuviste: " + cont + " puntos","Perdiste",JOptionPane.INFORMATION_MESSAGE);
                sent = 0;
            } else
            {
                cont++;
                JOptionPane.showMessageDialog(null,"Lanzaste: " + int_random1 +", " + int_random2 +  "\nGanas un punto","Ganas un punto",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }
}