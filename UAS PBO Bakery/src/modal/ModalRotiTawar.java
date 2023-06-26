/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;
import dough.BahanRotiTawar;

/**
 *
 * @author hp
 */
public class ModalRotiTawar extends BahanRotiTawar implements ModalAwal {
    public int pesanan;

    @Override
    public int beratDough() {
        return 400;
    }

    @Override
    public double rotiPerAdonan() {
        return this.calculateBahan()/ this.beratDough();
    }

    @Override
    public double hitungTerigu() {
        double hitung = this.getTepungTerigu()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungGula() {
        double hitung = this.getGulaPasir()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungButter() {
        double hitung = this.getButter()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungRagi() {
        double hitung = this.getRagi()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuBubuk() {
        double hitung = this.getSusuBubuk()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuCair() {
        double hitung = this.getSusuCair()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungTelur() {
        double hitung = this.getTelur()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungEs() {
        double hitung = this.getEsBatu()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungModal() {
        double modal = this.getTepungTerigu()* this.hargaTepung() + this.getGulaPasir()* this.hargaGulaPasir()
                + this.getButter()* this.hargaButter() + this.getEsBatu()* this.hargaEsBatu() + this.getRagi()* this.hargaRagi()
                + (this.getSusuBubuk()* this.hargaSusuBubuk()) + (this.getSusuCair()* this.hargaSusuCair())
                + (this.getTelur()* this.hargaTelur());
        return modal;
    }
}
