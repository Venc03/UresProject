package org.example;

public class Tabla {
    private char[][] T;
    private char UresCella;

    public Tabla(char uresCella) {
        this.UresCella = uresCella;
        T = new char[8][8];
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                T[i][j] = this.UresCella;
            }
        }

        Megjelenit();
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
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                if(j == T.length - 1){
                    System.out.print(T[i][j]);
                    System.out.print("\n");
                }
                else {
                    System.out.print(T[i][j]);
                }

            }
        }
    }

    public void Tabla(){

    }

    public void UresOszlop(){

    }

    public void UresSor(){

    }
}
