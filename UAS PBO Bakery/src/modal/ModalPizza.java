/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;
import dough.BahanPizza;

/**
 *
 * @author hp
 */
public class ModalPizza implements ModalAwal {
    private int pesanan;
    private double tepungTerigu;
    private double gulaPasir;
    private double butter;
    private double esBatu;
    private double ragi;
    private double susuBubuk;
    private double susuCair;
    private double telur;
    private double hargaTepung;
    private double hargaGulaPasir;
    private double hargaButter;
    private double hargaEsBatu;
    private double hargaRagi;
    private double hargaSusuBubuk;
    private double hargaSusuCair;
    private double hargaTelur;

    public ModalPizza() {
        // Inisialisasi nilai variabel
        this.pesanan = 0;
        this.tepungTerigu = 0;
        this.gulaPasir = 0;
        this.butter = 0;
        this.esBatu = 0;
        this.ragi = 0;
        this.susuBubuk = 0;
        this.susuCair = 0;
        this.telur = 0;
        this.hargaTepung = 0;
        this.hargaGulaPasir = 0;
        this.hargaButter = 0;
        this.hargaEsBatu = 0;
        this.hargaRagi = 0;
        this.hargaSusuBubuk = 0;
        this.hargaSusuCair = 0;
        this.hargaTelur = 0;
    }

    // Implementasikan metode dari antarmuka Modal

    public double hitungModal() {
        double modal = tepungTerigu * hargaTepung + gulaPasir * hargaGulaPasir +
                butter * hargaButter + esBatu * hargaEsBatu +
                ragi * hargaRagi + susuBubuk * hargaSusuBubuk +
                susuCair * hargaSusuCair + telur * hargaTelur;
        return modal;
    }

    public int beratDough() {
        return 190;
    }

    public double rotiPerAdonan() {
        return hitungKomposisi() / beratDough();
    }

    public double hitungTerigu() {
        double hitung = tepungTerigu / rotiPerAdonan() * pesanan;
        return hitung;
    }

    public double hitungGula() {
        double hitung = gulaPasir / rotiPerAdonan() * pesanan;
        return hitung;
    }

    public double hitungButter() {
        double hitung = butter / rotiPerAdonan() * pesanan;
        return hitung;
    }

    public double hitungRagi() {
        double hitung = ragi / rotiPerAdonan() * pesanan;
        return hitung;
    }

    public double hitungSusuBubuk() {
        double hitung = susuBubuk / rotiPerAdonan() * pesanan;
        return hitung;
    }

    public double hitungSusuCair() {
        double hitung = susuCair / rotiPerAdonan() * pesanan;
        return hitung;
    }

    public double hitungTelur() {
        double hitung = telur / rotiPerAdonan() * pesanan;
        return hitung;
    }

    public double hitungEs() {
        double hitung = esBatu / rotiPerAdonan() * pesanan;
        return hitung;
    }
}
