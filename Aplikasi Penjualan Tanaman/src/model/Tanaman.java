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
public class Tanaman {
    public static String TABLE_TANAMAN = "ms_tanaman";
    public static String FIELD_ID_TANAMAN = "id_tanaman";
    public static String FIELD_NAMA_TANAMAN = "nama_tanaman";
    
    private String idTanaman;
    private String namaTanaman;
    
    public String getIdTanaman() {
        return idTanaman;
    }
    
    public void setIdTanaman(String idTanaman) {
        this.idTanaman = idTanaman;
    }
    
    public String getNamaTanaman() {
        return namaTanaman;
    }
    
    public void setNamaTanaman(String namaTanaman) {
        this.namaTanaman = namaTanaman;
    }
}
