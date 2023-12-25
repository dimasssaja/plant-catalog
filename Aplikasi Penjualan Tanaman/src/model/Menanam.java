/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Menanam {
    public static String TABLE_MENANAM = "tx_menanam";
    public static String FIELD_ID_MENANAM = "id_menanam";
    public static String FIELD_ID_TANAMAN = "id_tanaman";
    public static String FIELD_ID_STATUS = "id_status";
    public static String FIELD_JUMLAH_AIR = "jumlah_air";
    public static String FIELD_JUMLAH_PUPUK = "jumlah_pupuk";
    public static String FIELD_SLOT = "slot";
    
    private String idMenanam;
    private String idTanaman;
    private String idStatus;
    private int jumlahAir;
    private int jumlahPupuk;
    private String slot;
    
    public String getIdMenanam() {
        return idMenanam;
    }
    
    public void setIdMenanam(String idMenanam) {
        this.idMenanam = idMenanam;
    }
    
    public String getIdTanaman() {
        return idTanaman;
    }
    
    public void setIdTanaman(String idTanaman) {
        this.idTanaman = idTanaman;
    }
    
    public String getIdStatus() {
        return idStatus;
    }
    
    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }
    
    public int getJumlahAir() {
        return jumlahAir;
    }
    
    public void setJumlahAir(int jumlahAir) {
        this.jumlahAir = jumlahAir;
    }
    
    public int getJumlahPupuk() {
        return jumlahPupuk;
    }
    
    public void setJumlahPupuk(int jumlahPupuk) {
        this.jumlahPupuk = jumlahPupuk;
    }
    
    public String getSlot() {
        return slot;
    }
    
    public void setSlot(String slot) {
        this.slot = slot;
    }
    
}
