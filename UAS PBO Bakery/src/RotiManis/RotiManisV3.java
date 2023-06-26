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
public class RotiManisV3 extends ModalRotiManis implements Interface{
    
    String nama = "Roti Manis Varian 3";

    @Override
    public double calculateTopping() {
        return 0.0;
    }
    
    public double calculateKeju(){
        double keju = 10 * pesanan;
        return keju;
    }
    public double calculateSosis(){
        double sosis = 10 * pesanan;
        return sosis;
    }

    @Override
    public double calculateFilling() {
        double keju = this.getKeju() * 10;
        double sosis = this.getSosis()*10;
        double harga = keju + sosis;
        return harga;
    }

    @Override
    public double calculateModal() {
        double hargaTopingFilling = this.calculateFilling();
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
