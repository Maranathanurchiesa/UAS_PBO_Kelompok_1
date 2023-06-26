/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RotiManis;
import modal.ModalRotiManis;
import harga.Interface;

/**
 *
 * @author purwa
 */
public class RotiManisV1  extends ModalRotiManis implements Interface{
    
    String nama = "Roti Manis Varian 1";

    @Override
    public double calculateTopping() {
        double coklat = this.getCoklat() * 5;
        double harga = coklat;
        return harga;
    }
    
    public double calculateCoklat(){
        double coklat = 10 * pesanan;
        return coklat;
    }
    public double calculateKeju(){
        double keju = 5 * pesanan;
        return keju;
    }

    @Override
    public double calculateFilling() {
        double keju = this.getKeju() * 5;
        double coklat = this.getCoklat() * 5;
        double harga = keju + coklat;
        return harga;
    }

    @Override
    public double calculateModal() {
        double hargaTopingFilling = this.calculateFilling() + this.calculateTopping();
        double hargaBahan = this.hitungModal() + this.rotiPerAdonan();
        double modalTotal = hargaBahan + hargaTopingFilling;
        return modalTotal;
    }

    @Override
    public double calculateHargaVarian() {
        double untung = this.calculateModal() * 50/100;
        double harga = this.calculateModal() * untung;
        return Math.round(harga);
    }

    @Override
    public void calculateHarga() {
        System.out.println("Harga " + nama + " = Rp " + (int)calculateHargaVarian() + " /pcs ");
    }
}
