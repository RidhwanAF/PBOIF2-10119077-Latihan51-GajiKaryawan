/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan51.gajikaryawan;

/**
 *
 * @author RAF
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int kehadiran){
        return kehadiran * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        if(jabatan.equals("Manager")){
            return 2000000;
        } else if (jabatan.equals("Kabag")){
            return 1000000;
          } else {return 0;
            }
    }
    
    public float tunjanganGolongan(int golongan){
        switch (golongan){
            case 1 : return 500000;
            case 2 : return 1000000;
            case 3 : return 1500000;
            default : return 0;
        }
    }
    
    public float gajiTotal(){
        return tunjanganJabatan(jabatan) + tunjanganGolongan(golongan) + tunjanganKehadiran;
    }
}
