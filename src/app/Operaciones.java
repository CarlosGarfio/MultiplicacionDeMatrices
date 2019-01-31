package app;

public class Operaciones {

    public Arreglo fillAsc(Arreglo temp) {
        int asc = 0;
        for (int i = 0; i < temp.getF(); i++) {
            for (int j = 0; j < temp.getC(); j++) {
                temp.getArreglo()[temp.getF() * j + i] = ++asc;
            }
        }
        return temp;
    }

    public Arreglo fill(int n, int m, Arreglo temp) {
        for (int i = 0; i < temp.getF(); i++) {
            for (int j = 0; j < temp.getC(); j++) {
                temp.getArreglo()[temp.getF() * j + i] = (long) Math.abs(Math.floor(Math.random() * (n - m + 1) + m));
            }
        }
        return temp;
    }

    public static Arreglo Multiplicar(Arreglo m1, Arreglo m2, Arreglo m3) {
        for (int i = 0; i < m1.getF(); i++) {
            for (int j = 0; j < m2.getC(); j++) {
                for (int k = 0; k < m1.getC(); k++) {
                    m3.getArreglo()[(m3.getF() * j) + i]
                            += (m1.getArreglo()[(m1.getF() * k) + i])
                            * (m2.getArreglo()[(m2.getF() * j) + k]);
                }
            }
        }
        return m3;
    }

    public void print(Arreglo a) {
        for (int i = 0; i < a.getF(); i++) {
            for (int j = 0; j < a.getC(); j++) {
                System.out.print(a.getArreglo()[a.getF() * j + i] + "\t");
            }
            System.out.println("");
        }
    }
}
