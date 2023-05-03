public class Main
{
    public static void main(String[] args)
    {
        Memorama<String> memorama = new Memorama<>();
        memorama.agregarPar("Mi villano favorito");
        memorama.agregarPar("La noche eterna");
        memorama.agregarPar("Forever Young");
        memorama.revolver();
        System.out.println(memorama.carta1(5));
        System.out.println(memorama.carta2(1));
    }
}