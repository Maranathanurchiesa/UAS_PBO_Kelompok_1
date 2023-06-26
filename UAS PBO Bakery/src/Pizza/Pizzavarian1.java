/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza;
import modal.ModalPizza;
import harga.Interface;
/**
 *
 * @author purwa
 */
public class Pizzavarian1 extends ModalPizza implements Interface{
    String nama = "Pizza Varian 1" ;

    @Override
    public double calculateTopping() {
        double keju = this.hargaKeju()* 30;
        double sosis = this.hargaSosis()* 50;
        double beef = this.hargaBeef()* 50;
        double bawang = this.hargaBawang()* 30;
        double harga = keju + sosis + beef + bawang;
        return harga;
    }
    
    public double calculateKeju(){
        double keju = 30 * pesanan;
        return keju;
    }
    
    public double calculateSosis(){
        double sosis = 50 * pesanan;
        return sosis;
    }
    
    public double calculateBeef(){
        double beef = 50 * pesanan;
        return beef;
    }
    
    public double calculateBawang(){
        double bawang = 30 * pesanan;
        return bawang;
    }

    @Override
    public double calculateFilling() {
        double harga = 0;
        return harga;
    }

    @Override
    public double calculateModal() {
       double hargaTopingFilling = this.calculateFilling() + this.calculateTopping();
       double hargaBahan = this.hitungModal()/ this.rotiPerAdonan();
       double totalmodal = hargaBahan * hargaTopingFilling;
       return totalmodal;
    }
    
    @Override
    public double calculateHargaVarian() {
        double untung = this.calculateModal() * 50/100;
        double harga = this.calculateModal() + untung;
        return Math.round(harga);
    }

    @Override
    public void calculateHarga() {
        System.out.println("Harga " + nama + " = Rp " + (int)calculateHargaVarian() + " /pcs ");
    }
}