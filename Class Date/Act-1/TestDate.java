public class TestDate {
    public static void main(String[] args) {

        // Declaracion de instancias.
        DateD d1 = new DateD(1,1,2017,2);
        DateD d2 = new DateD(31,12,2016,1);
        DateD d3 = new DateD();
        DateD d4 = new DateD();
        DateD d5 = new DateD();

        // Definicion de maximos de años
        d1.setYEARMAX(1900,3000);
        d2.setYEARMAX(1900,3000);
        d3.setYEARMAX(1900,3000);
        d4.setYEARMAX(1900,3000);
        d5.setYEARMAX(1900,3000);

        // Uso de los setters para adquirir las fechas
        d1.set_day(d1.get_day());
        d1.set_month(d1.get_month());
        d1.set_year(d1.get_year());

        d2.set_day(d2.get_day());
        d2.set_month(d2.get_month());
        d2.set_year(d2.get_year());

        // Aqui clonamos las instancias indicadas de la actvidad
        d3 = d3.clone(d1,d1,d1,d1);
        d4 = d4.clone(d1,d2,d3,d2);
        d5 = d5.clone(d2,d2,d2,d2);

        d5.next();
        d3.set_month(4);

        // Declaracion del array con las instancias en su interior
        DateD[] arrayInstanc = {d1,d2,d3,d4,d5};

        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(d5));

        // Ciclo for each para imprimir el arreglo con diferentes formatos.
        for(DateD date:arrayInstanc) {
            System.out.println("-----------------");
            for(int j = 0; j < 3; j++) {
                date.setFormat(j);
                System.out.println(date);
            }
        }

    }
}