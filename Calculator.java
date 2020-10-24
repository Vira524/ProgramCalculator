/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vira Febrianti
 */
public class Calculator {
    
    public int getPenjumlahan(int a, int b){
        int hasil = a + b;
        return hasil;
    }
    public int getPengurangan(int a, int b){
        int hasil = a - b;
        return hasil;
    }
    public int getPerkalian(int a, int b){
        int hasil = a * b;
        return hasil;
    }
    public int getPembagian(int a, int b){
        int hasil = a / b;
        return hasil;
    }
    public void statusProgram() {
        System.out.println("Ini Merupakan Program Calculator");
    }
}
