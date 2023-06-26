/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas.pbo.bakery;
import RotiManis.*;
import RotiTawar.*;
import Pizza.*;
import berat.BeratBahan;
/**
 *
 * @author hp
 */
public class UASPBOBakery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RotiManisV1 RM1 = new RotiManisV1();
        RM1.pesanan = 50;
        RotiManisV2 RM2 = new RotiManisV2();
        RM2.pesanan = 100;
        RotiManisV3 RM3 = new RotiManisV3();
        RM3.pesanan = 70;
        RotiTawarV1 RT1 = new RotiTawarV1();
        RT1.pesanan = 20;
        RotiTawarV2 RT2 = new RotiTawarV2();
        RT2.pesanan = 15;
        Pizzavarian1 P = new Pizzavarian1();
        P.pesanan = 10;
        
        double kebutuhanTepung = RM1.hitungTerigu() + RM2.hitungTerigu() + RM3.hitungTerigu() + RT1.hitungTerigu() + RT2.hitungTerigu() + P.hitungTerigu();
        double kebutuhanGula = RM1.hitungGula () + RM2.hitungGula() + RM3.hitungGula() + RT1.hitungGula() + RT2.hitungGula() + P.hitungGula();
        double kebutuhanButter = RM1.hitungButter () + RM2.hitungButter() + RM3.hitungButter() + RT1.hitungButter() + RT2.hitungButter() + P.hitungButter();
        double kebutuhanRagi = RM1.hitungRagi() + RM2.hitungRagi() + RM3.hitungRagi() + RT1.hitungRagi() + RT2.hitungRagi() + P.hitungRagi();
        double kebutuhanSusuBubuk = RM1.hitungSusuBubuk() + RM2.hitungSusuBubuk() + RM3.hitungSusuBubuk() + RT1.hitungSusuBubuk() + RT2.hitungSusuBubuk() + P.hitungSusuBubuk();
        double kebutuhanSusuCair = RM1.hitungSusuCair() + RM2.hitungSusuCair() + RM3.hitungSusuCair() + RT1.hitungSusuCair() + RT2.hitungSusuCair() + P.hitungSusuCair();
        double kebutuhanTelur = RM1.hitungTelur() + RM2.hitungTelur() + RM3.hitungTelur() + RT1.hitungTelur() + RT2.hitungTelur() + P.hitungTelur();
        double kebutuhanEs = RM1.hitungEs() + RM2.hitungEs() + RM3.hitungEs() + RT1.hitungEs() + RT2.hitungEs() + P.hitungEs();
        double kebutuhanCoklat = RM1.calculateCoklat() + RT1.calculateCoklat();
        double kebutuhanKeju = RM1.calculateKeju() + RM3.calculateKeju() + RT2.calculateKeju() + P.calculateKeju();
        double kebutuhanRedBean = RM2.calculateRedBean();
        double kebutuhanKrimVanilla = RM2.calculateKrimVanilla();
        double kebutuhanSosis = RM3.calculateSosis() + P.calculateSosis();
        double kebutuhanBeef = P.calculateBeef();
        double kebutuhanBawang = P.calculateBawang();
        
        
        BeratBahan BB = new BeratBahan();
        
        System.out.print("Kebutuhan Tepung          = ");BB.hitungBerat(kebutuhanTepung);
        System.out.print("Kebutuhan Gula            = ");BB.hitungBerat(kebutuhanGula);
        System.out.print("Kebutuhan Butter          = ");BB.hitungBerat(kebutuhanButter);
        System.out.print("Kebutuhan Ragi            = ");BB.hitungBerat(kebutuhanRagi);
        System.out.print("Kebutuhan Susu Bubuk      = ");BB.hitungBerat(kebutuhanSusuBubuk);
        System.out.print("Kebutuhan Susu Cair       = ");BB.hitungBerat(kebutuhanSusuCair ); 
        System.out.print("Kebutuhan Telur           = ");BB.hitungBerat(kebutuhanTelur);
        System.out.print("Kebutuhan Es Batu         = ");BB.hitungBerat(kebutuhanEs);
        System.out.print("Kebutuhan Coklat          = ");BB.hitungBerat(kebutuhanCoklat);
        System.out.print("Kebutuhan Keju            = ");BB.hitungBerat(kebutuhanKeju);
        System.out.print("Kebutuhan Krim Vanilla    = ");BB.hitungBerat(kebutuhanKrimVanilla);
        System.out.print("Kebutuhan Selai Red Bean  = ");BB.hitungBerat(kebutuhanRedBean);
        System.out.print("Kebutuhan Sosis           = ");BB.hitungBerat(kebutuhanSosis);
        System.out.print("Kebutuhan Smoked Beef     = ");BB.hitungBerat(kebutuhanBeef);
        System.out.print("Kebutuhan Bawang Bombay   = ");BB.hitungBerat(kebutuhanBawang);
        System.out.println("--------------------------");
        
        RM1.calculateHarga();
        RM2.calculateHarga();
        RM3.calculateHarga();
        RT1.calculateHarga();
        RT2.calculateHarga();
        P.calculateHarga();
       
    }
    
}
