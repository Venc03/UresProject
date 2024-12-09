package org.example;

import java.util.Random;

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

    }

    public void UresOszlopokSzama(){

    }

    public void UresSorokSzama(){

    }

    public void Elhelyezes(int N){
        Random rnd = new Random();


        for (int i = 0; i < N; i++) {
            int rndi = rnd.nextInt(8);
            int rndj = rnd.nextInt(8);
            if(T[rndi][rndj] == '-'){
                T[rndi][rndj] = 'K';
            }else{
                i--;
            }
        }
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

    public String UresOszlop(int oszlop){
        boolean van = false;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                if (T[i][oszlop] == 'K'){
                    van = true;
                }
            }
        }

        return oszlop + " sor tartalmaz kiralynot: " + van;
    }

    public String UresSor(int sor){
        boolean van = false;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                if (T[sor][j] == 'K'){
                    van = true;
                }
            }
        }

        return sor + " sor tartalmaz kiralynot: " + van;
    }
}
