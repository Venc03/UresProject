package org.example;

public class Tabla {
    private char[][] T;
    private char UresCella;

    public Tabla(char uresCella) {
        UresCella = uresCella;
        T = new char[8][8];
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                T[i][j] = this.UresCella;
            }
        }
    }

    public void UresOszlopokSzama(){

    }

    public void UresSorokSzama(){

    }

    public void Elhelyezes(){

    }

    public void Fajlbairas(){

    }

    public void Megjelenit(){

    }

    public void Tabla(){

    }

    public void UresOszlop(){

    }

    public void UresSor(){

    }
}
