package modelo;

public class Coordenada {

    private int x;
    private int y;
    public static int numCoordenadas;
    public static int Coordenada;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getNumCoordenadas() {
        numCoordenadas++;
        return numCoordenadas;

    }

    public static int setCoordenada() {
        return Coordenada;
    }

    public static int getCoordenada() {
        return Coordenada;
    }

}
