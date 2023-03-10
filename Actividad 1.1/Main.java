import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int year1,year2;
        int cont1 = 0,cont2 = 0;
        String año = JOptionPane.showInputDialog("Año de nacimiento (1920-2000): ");
        int yearTest = Integer.parseInt(año);
        if(yearTest < 1920 || yearTest > 2000){
            year1 = 2;
            year2 = 0;
        }else{
            year1 = Character.getNumericValue(año.charAt(2));
            year2 = Character.getNumericValue(año.charAt(3));
        }



        String mes = JOptionPane.showInputDialog("Mes de nacimiento (01-12): ");
        int month = Integer.parseInt(mes);
        if( month < 1 || month > 12){
            month = 01;
        }
        else if(month < 10){
            cont1 = 1;
        }

        String dia = JOptionPane.showInputDialog("Día nacimiento (01-31): ");
        int day = Integer.parseInt(dia);
        if(day < 1 || day > 31){
            day = 01;
        }
        else if(day < 10){
            cont2 = 1;
        }




        String arrName = JOptionPane.showInputDialog("Ingresa el nombre de la persona a registrar: ");
        String arrUname = arrName.toUpperCase();
        arrUname = arrUname.replace("Á","A");
        arrUname = arrUname.replace("É","E");
        arrUname = arrUname.replace("Í","I");
        arrUname = arrUname.replace("Ó","O");
        arrUname = arrUname.replace("Ú","U");
        arrUname = arrUname.replace("Ü","U");

        char strRFCN = arrUname.charAt(0);



        String arrSNAME = JOptionPane.showInputDialog("Ingresa el apellido parterno de la persona a registrar: ");
        String arrUSNAME = arrSNAME.toUpperCase();

        arrUSNAME = arrUSNAME.replace("Á","A");
        arrUSNAME = arrUSNAME.replace("É","E");
        arrUSNAME = arrUSNAME.replace("Í","I");
        arrUSNAME = arrUSNAME.replace("Ó","O");
        arrUSNAME = arrUSNAME.replace("Ú","U");
        arrUSNAME = arrUSNAME.replace("Ü","U");


        arrUSNAME = arrUSNAME.replace("DE"," ");
        arrUSNAME = arrUSNAME.replace("LA"," ");
        arrUSNAME = arrUSNAME.replace("LAS"," ");
        arrUSNAME = arrUSNAME.replace("EL"," ");
        arrUSNAME = arrUSNAME.replace("LOS"," ");
        arrUSNAME = arrUSNAME.replace("Y"," ");
        arrUSNAME = arrUSNAME.trim();


        char strRFCSN1 = arrUSNAME.charAt(0);
        char strRFCSN2 = arrUSNAME.charAt(1);


        String arrTNAME = JOptionPane.showInputDialog("Ingresa el apellido materno de la persona a registrar: ");
        String arrUTNAME = arrTNAME.toUpperCase();

        arrUTNAME = arrUTNAME.replace("Á","A");
        arrUTNAME = arrUTNAME.replace("É","E");
        arrUTNAME = arrUTNAME.replace("Í","I");
        arrUTNAME = arrUTNAME.replace("Ó","O");
        arrUTNAME = arrUTNAME.replace("Ú","U");
        arrUTNAME = arrUTNAME.replace("Ü","U");

        arrUTNAME = arrUTNAME.replace("DE"," ");
        arrUTNAME = arrUTNAME.replace("LA"," ");
        arrUTNAME = arrUTNAME.replace("LAS"," ");
        arrUTNAME = arrUTNAME.replace("EL"," ");
        arrUTNAME = arrUTNAME.replace("LOS"," ");
        arrUTNAME = arrUTNAME.replace("Y"," ");
        arrUTNAME = arrUTNAME.trim();


        if(arrTNAME == null || arrTNAME.length() == 0){
            char strRFCN1 = arrUname.charAt(0);
            char strRFCN2 = arrUname.charAt(1);
            if(cont1 == 1){
                if(cont2 == 1){
                    JOptionPane.showMessageDialog(null,"EL RCF de: " + arrName.toUpperCase() + " " + arrSNAME.toUpperCase() + " " + arrTNAME.toUpperCase() + " es: " + strRFCSN1+""+strRFCSN2+""+strRFCN1+""+strRFCN2+""+year1+""+year2+""+0+""+month+""+0+""+day,"RFC",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"EL RCF de: " + arrName.toUpperCase() + " " + arrSNAME.toUpperCase() + " " + arrTNAME.toUpperCase() + " es: " + strRFCSN1+""+strRFCSN2+""+strRFCN1+""+strRFCN2+""+year1+""+year2+""+0+""+month+""+day,"RFC",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"EL RCF de: " + arrName.toUpperCase() + " " + arrSNAME.toUpperCase() + " " + arrTNAME.toUpperCase() + " es: " + strRFCSN1+""+strRFCSN2+""+strRFCN1+""+strRFCN2+""+year1+""+year2+""+month+""+day,"RFC",JOptionPane.INFORMATION_MESSAGE);
            }


        }
        else{
            char strRFCTN = arrUTNAME.charAt(0);
            if(cont1 == 1){
                if(cont2 == 1){
                    JOptionPane.showMessageDialog(null,"EL RCF de: " + arrName.toUpperCase() + " " + arrSNAME.toUpperCase() + " " + arrTNAME.toUpperCase() + " es: " + strRFCSN1+""+strRFCSN2+""+strRFCTN+""+strRFCN+""+year1+""+year2+""+0+""+month+""+0+""+day,"RFC",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"EL RCF de: " + arrName.toUpperCase() + " " + arrSNAME.toUpperCase() + " " + arrTNAME.toUpperCase() + " es: " + strRFCSN1+""+strRFCSN2+""+strRFCTN+""+strRFCN+""+year1+""+year2+""+year2+""+0+""+month+""+day,"RFC",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"EL RCF de: " + arrName.toUpperCase() + " " + arrSNAME.toUpperCase() + " " + arrTNAME.toUpperCase() + " es: " + strRFCSN1+""+strRFCSN2+""+strRFCTN+""+strRFCN+""+year1+""+year2+""+month+""+day,"RFC",JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }
}