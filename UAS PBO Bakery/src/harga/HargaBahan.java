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
public class HargaBahan extends BeratKemasan {

    // HARGA DIBAGI BERAT KEMASAN

    public double hargaTepung(){
        return this.hargaTepung()/ this.beratTepungTerigu;
    }

    public double hargaGulaPasir(){
        return this.hargaGulaPasir()/ this.beratGulaPasir;
    }

    public double hargaButter(){
        return this.hargaButter()/ this.beratButter;
    }

    public double hargaRagi(){
        return this.hargaRagi()/ this.beratRagi;
    }

    public double hargaSusuBubuk(){
        return this.hargaSusuBubuk()/ this.beratSusuBubuk;
    }

    public double hargaSusuCair(){
        return this.hargaSusuCair()/ this.beratSusuCair;
    }

    public double hargaTelur(){
        return this.hargaTelur()/ this.beratTelur;
    }
    
    public double hargaEsBatu(){
        return this.hargaEsBatu()/ this.beratEsBatu;
    }


    public double hargaKeju(){
        return getKeju() / beratKeju;
    }

    public double hargaCoklat(){
        return getCoklat() / beratCoklat;
    }

    public double hargaKrimVanilla(){
        return getKrimVanilla() / beratKrimVanilla;
    }

    public double hargaSelai(){
        return getSelaiRedBean() / beratSelaiRedBean;
    }

    public double hargaSosis(){
        return getSosis() / beratSosis;
    }

    public double hargaBeef(){
        return getSmokedBeef() / beratSmokedBeef;
    }

    public double hargaBawang(){
        return getBawangBombay() / beratBawang;
    }

}
