package org.example.JatekProgram;

public class Babu extends LogikaiJatek {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this.szin = szin;
        this.ero = 1;
    }

    public Babu(int ero, String szin) {
        if (1 <= ero && ero <= 9){
            this.ero = ero;
        }else {
            System.out.println("Kérem adjon meg egy számot 1 és 9 között");
        }
        this.szin = szin;
    }
}
