/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dough;
import harga.HargaBahan;

/**
 *
 * @author hp
 */
public class BahanRotiTawar extends HargaBahan implements bahan {
    @Override
    public int getTepungTerigu() {
        return 1000;
    }

    @Override
    public int getGulaPasir() {
        return 125;
    }

    @Override
    public int getButter() {
        return 100;
    }

    @Override
    public int getRagi() {
        return 20;
    }

    @Override
    public int getSusuBubuk() {
        return 250;
    }

    @Override
    public int getSusuCair() {
        return 200;
    }

    @Override
    public int getTelur() {
        return 70;
    }

    @Override
    public int getEsBatu() {
        return 300;
    }

    @Override
    public int calculateKomposisi() {
        int total = getTepungTerigu() + getGulaPasir() + getButter() + getEsBatu() + getRagi() + getSusuBubuk() + getSusuCair() + getTelur();
        return total;
    }
}
