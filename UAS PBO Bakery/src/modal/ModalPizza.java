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

    @Override
    public double hitungModal() {
        double modal = this.tepungTerigu() * this.hargaTepung() + this.gulaPasir() * this.hargaGulaPasir()
                + this.butter() * this.hargaButter() + this.esBatu() * this.hargaEsBatu()
                + this.ragi() * this.hargaRagi() + (this.susuBubuk() * this.hargaSusuBubuk())
                + (this.susuCair() * this.hargaSusuCair()) + (this.telur() * this.hargaTelur());
        return modal;
    }

    @Override
    public int beratDough() {
        return 190;
    }

    @Override
    public double rotiPerAdonan() {
        return this.hitungKomposisi() / this.beratDough();
    }

    @Override
    public double hitungTerigu() {
        double hitung = this.tepungTerigu() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungGula() {
        double hitung = this.gulaPasir() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungButter() {
        double hitung = this.butter() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungRagi() {
        double hitung = this.ragi() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuBubuk() {
        double hitung = this.susuBubuk() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuCair() {
        double hitung = this.susuCair() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungTelur() {
        double hitung = this.telur() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungEs() {
        double hitung = this.esBatu() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    public int getPesanan() {
        return pesanan;
    }

    public void setPesanan(int pesanan) {
        this.pesanan = pesanan;
    }
}
