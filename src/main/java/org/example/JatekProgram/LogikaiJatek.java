package org.example.JatekProgram;

import java.util.Arrays;

public class LogikaiJatek extends Jatek{
    private Babu[][] tabla = new Babu[4][5];;
    private int[] sorrend = new int[10];
    private int babuDB;

    public LogikaiJatek() {
        this.babuDB = 3;
    }

    public LogikaiJatek(int babuDB) {
        if (2 <= babuDB && babuDB <= 15){
            this.babuDB = babuDB;
        }else {
            System.out.println("Kérem adjon meg egy számot 3 és 15 között");
        }
    }

    public boolean van8FelettEro(){
        return true;
    }

    @Override
    public void kezd() {
        System.out.println("Kezdés");
    }

    @Override
    public void ment() {
        super.ment();
        System.out.println("Mentés");
    }

    @Override
    public void vege() {
        super.vege();
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDB=" + babuDB +
                '}';
    }
}
