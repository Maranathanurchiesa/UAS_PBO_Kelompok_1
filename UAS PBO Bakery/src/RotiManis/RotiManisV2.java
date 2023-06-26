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
public class RotiManisV2 extends ModalRotiManis implements Interface{

    String nama = "Roti Manis Varian 2";
    
    @Override
    public double calculateTopping() {
        double selai = this.getSelai() * 10;
        double harga = selai;
        return harga;
    }
    
    public double calculateRedBean(){
        double redbean = 10 * pesanan;
        return redbean;
    }
    public double calculateKrimVanilla(){
        double krimvanilla = 10 * pesanan;
        return krimvanilla;
    }

    @Override
    public double calculateFilling(){
        double krim = this.hargaKrimVanilla() * 5;
        double harga = krim;
        return harga;
    }

    @Override
    public double calculateModal(){
        double hargaTopingFilling = this.calculateFilling() + this.calculateTopping();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double totalmodal = hargaBahan + hargaTopingFilling;
        return totalmodal;
    }

    @Override
    public double calculateHargaVarian(){
        double untung = this.calculateModal() * 50/100;
        double harga = this.calculateModal() * untung;
        return Math.round(harga);
    }

    @Override
    public void calculateHarga() {
        System.out.println("Harga " + nama + " = Rp " + (int)calculateHargaVarian() + " /pcs ");
    }
    
}
