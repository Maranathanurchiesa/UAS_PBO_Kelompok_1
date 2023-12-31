/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RotiTawar;
import modal.ModalRotiTawar;
import harga.Interface;

/**
 *
 * @author purwa
 */
public class RotiTawarV1 extends ModalRotiTawar implements Interface{
    
    String nama = "Roti Tawar Varian 1";

    @Override
    public double calculateTopping() {
        return 0;
    }
    
    public double calculateCoklat(){
        double coklat = 80 * pesanan;
        return coklat;
    }

    @Override
    public double calculateFilling() {
        double coklat = this.getCoklat() * 80;
        double harga = coklat;
        return harga;
    }

    @Override
    public double calculateModal() {
        double hargaTopingFilling = this.calculateFilling() + this.calculateTopping();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double totalmodal = hargaBahan + hargaTopingFilling;
        return totalmodal;
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
