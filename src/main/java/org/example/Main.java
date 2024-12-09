package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 64; i++) {

        }

        Tabla t1 = new Tabla('#');

        System.out.println("Üres tábla: \n");
        t1.Megjelenit();
        System.out.println("\n");

        System.out.println("Feltöltött tábla: \n");
        t1.Elhelyezes(8);
        t1.Megjelenit();
        System.out.println(t1.UresOszlop(2));
        System.out.println(t1.UresSor(3));
        t1.UresOszlopokSzama();
        t1.UresSorokSzama();
    }
}