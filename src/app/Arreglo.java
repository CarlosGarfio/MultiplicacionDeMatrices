package app;

public class Arreglo {

    private int f, c;
    private long[] arreglo;

    public Arreglo(int f, int c) {
        this.f = f;
        this.c = c;
        arreglo = new long[f * c];
    }
    
    public Arreglo(){
        this.f = 3;
        this.c = 3;
        arreglo = new long[f * c];
    }

    public int getF() {
        return f;
    }

    public int getC() {
        return c;
    }

    public long[] getArreglo(){
        return arreglo;
    }

    public void setArreglo(long[] arreglo) {
        this.arreglo = arreglo;
    }    
}