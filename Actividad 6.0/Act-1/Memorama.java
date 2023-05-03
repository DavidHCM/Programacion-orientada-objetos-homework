import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Creamos la clase genérica para el juego de memoria
public class Memorama<T>
{
    //████████████████████████████████████████████████████████

    // --Creamos las variables necesarias para el juego--

    // Creamos una lista de las cartas genericas
    protected List<T> cartas;

    // Creamos una lista de las posiciones
    protected List<Integer> posiciones;

    // Creamos a la primera carta y la posicion de esta
    protected T primCarta;
    protected int posicionCarta1;

    protected int estandar = -1;

    //████████████████████████████████████████████████████████

    // Constructor de la clase memorama
    public Memorama()
    {
        // Inicializamos las cartas.
        cartas = new ArrayList<T>();
        posiciones = new ArrayList<Integer>();
        primCarta = null;
        posicionCarta1 = estandar;
    }

    //████████████████████████████████████████████████████████

    // Agregamos un par de cartas con el mismo valor a la lista de cartas
    public void agregarPar(T valor)
    {
        cartas.add(valor);
        cartas.add(valor);
    }

    //████████████████████████████████████████████████████████

    // Mezclamos aleatoriamente las posiciones de las cartas en el juego
    public void revolver()
    {
        // Limpiamos las posiciones
        posiciones.clear();
        for (int i = 1; i <= cartas.size(); i++)
        {
            // Vamos añadiendo posiciones en respecto al tamaño de las cartas
            posiciones.add(i);
        }
        // Usamos el shuffle de collections para revolver las posiciones
        Collections.shuffle(posiciones);
        primCarta = null;
        posicionCarta1 = estandar;
    }

    //████████████████████████████████████████████████████████

    // Método para voltear la primera carta y obtener su valor
    public T carta1(int posicion)
    {
        // Obtenemos la posicion de la priemra carta
        if (posicion == posicionCarta1)
        {
            return primCarta;
        }
        primCarta = cartas.get(posiciones.get(posicion - 1) - 1);
        posicionCarta1 = posicion;
        return primCarta;
    }

    //████████████████████████████████████████████████████████

    // Método para voltear la segunda carta y verificar si se ha encontrado un par
    public T carta2(int posicion)
    {
        // De ser la misma posicion que la primera carta devolvemos la primera carta
        if (posicion == posicionCarta1)
        {
            return primCarta;
        }

        // Obtenemos la posicion de las cartas de la invocada
        T carta2 = cartas.get(posiciones.get(posicion - 1) - 1);
        if (primCarta != null && primCarta.equals(carta2))
        {
            // Si se ha encontrado un par, eliminamos las cartas de la lista y actualizamos la posición de la primera carta volteada
            cartas.remove(primCarta);
            cartas.remove(carta2);
            posiciones.remove(posiciones.indexOf(posicionCarta1));
            posiciones.remove(posiciones.indexOf(posicion));
            primCarta = null;
            posicionCarta1 = estandar;
        }
        // Si ya no quedan cartas, se muestra un mensaje indicando que el juego ha terminado
        if (cartas.isEmpty())
        {
            System.out.println("Ya no hay cartas, se ha terminado el juego");
        }
        return carta2;
    }

    //████████████████████████████████████████████████████████
}