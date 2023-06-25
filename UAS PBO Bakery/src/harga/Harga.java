/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harga;
import dough.ToppingFilling;

/**
 *
 * @author hp
 */

public class Harga implements ToppingFilling{

    public static final int HARGA_TEPUNG_TERIGU = 40000;
    public static final int HARGA_GULA_PASIR = 25000;
    public static final int HARGA_BUTTER = 23000;
    public static final int HARGA_RAGI = 5000;
    public static final int HARGA_SUSU_BUBUK = 39000;
    public static final int HARGA_SUSU_CAIR = 24000;
    public static final int HARGA_TELUR = 23000;
    public static final int HARGA_ES_BATU = 2000;

    // HARGA TOPPING dan FILLING

    @Override
    public int getKeju() {
        return 31000;
    }

    @Override
    public int getCoklat() {
        return 29000;
    }

    @Override
    public int getKrimVanilla() {
      return 30000;
    }

    @Override
    public int getSelaiRedBean() {
        return 25000;
    }

    @Override
    public int getSosis() {
        return 80000;
    }

    @Override
    public int getSmokedBeef() {
        return 90000;
    }

    @Override
    public int getBawangBombay() {
        return 40000;
    }
}
