/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package berat;
import java.text.DecimalFormat;

/**
 *
 * @author hp
 */
public class BeratBahan {
    
    DecimalFormat df = new DecimalFormat("#.#");
    
    public String hitungBerat(double x){
        if (x >= 1000){
            double hasil = x / 1000;
            return df.format(hasil) + " kilogram";
        } else {
            return df.format(x) + " gram";
        }
    }
    
    public static void main(String[] args) {
        BeratBahan beban = new BeratBahan();
        double berat = 1500; // Nilai berat yang ingin dihitung
        String hasil = beban.hitungBerat(berat);
        System.out.println(hasil);
    }
}

