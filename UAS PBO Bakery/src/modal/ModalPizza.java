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
public class ModalPizza extends BahanPizza implements ModalAwal {
    private BahanPizza bahanPizza;
    private int pesanan;

    public ModalPizza() {
        bahanPizza = new BahanPizza();
    }

    @Override
    public double hitungModal() {
        double modal = this.hitungTerigu() * this.hargaTepung() + hitungGula() * hargaGulaPasir()
                + hitungButter() * hargaButter() + hitungEs() * hargaEsBatu()
                + hitungRagi() * hargaRagi() + hitungSusuBubuk() * hargaSusuBubuk()
                + hitungSusuCair() * hargaSusuCair() + hitungTelur() * hargaTelur();
        return modal;
    }

    @Override
    public int beratDough() {
        return 190;
    }

    @Override
    public double rotiPerAdonan() {
        return bahanPizza.calculateKomposisi() / beratDough();
    }

    @Override
    public double hitungTerigu() {
        double hitung = bahanPizza.getTepungTerigu() / rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungGula() {
        double hitung = bahanPizza.getGulaPasir() / rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungButter() {
        double hitung = bahanPizza.getButter() / rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungRagi() {
        double hitung = bahanPizza.getRagi() / rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuBubuk() {
        double hitung = bahanPizza.getSusuBubuk() / rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuCair() {
        double hitung = bahanPizza.getSusuCair() / rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungTelur() {
        double hitung = bahanPizza.getTelur() / rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungEs() {
        double hitung = bahanPizza.getEsBatu() / rotiPerAdonan() * pesanan;
        return hitung;
    }

    public int getPesanan() {
        return pesanan;
    }

    public void setPesanan(int pesanan) {
        this.pesanan = pesanan;
    }
}
