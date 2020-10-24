/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vira Febrianti
 */
public class UtamaCalculator {
    public static void main(String[]args){
       
        Calculator angka = new Calculator();
        angka.statusProgram();
        System.out.println("Hasil Penjumlahan adalah "+angka.getPenjumlahan(10, 5));
        System.out.println("Hasil Pengurangan adalah "+angka.getPengurangan(10, 5));
        System.out.println("Hasil Perkalian adalah "+angka.getPerkalian(10, 5));
        System.out.println("Hasil Pembagian adalah "+angka.getPembagian(10, 5));
    }
}
