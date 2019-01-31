package app;

public class main {

    public static Arreglo m1, m2, m3;
    public static Operaciones operaciones = new Operaciones();

    public static void main(String[] args) {
        m1 = new Arreglo(3, 2);
        m2 = new Arreglo(2, 3);
        m3 = new Arreglo(m1.getF(), m2.getC());

//        m1 = operaciones.fillAsc(m1);
//        m2 = operaciones.fillAsc(m2);

        m1 = operaciones.fill(1, 10, m1);
        m2 = operaciones.fill(1, 10, m2);

        m3 = operaciones.Multiplicar(m1, m2, m3);

        System.out.println("------MATRIZ 1-----");
        operaciones.print(m1);
        System.out.println("------MATRIZ 2-----");
        operaciones.print(m2);
        System.out.println("------RESULTADO 3-----");
        operaciones.print(m3);

    }

}
