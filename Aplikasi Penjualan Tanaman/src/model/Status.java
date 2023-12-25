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
public class Status {
    
    public static String TABLE_STATUS = "ms_status";
    public static String FIELD_ID_STATUS = "id_status";
    public static String FIELD_STATUS_TANAMAN = "status_tanaman";
    
    private String idStatus;
    private String statusTanaman;
    
    public String getIdStatus() {
        return idStatus;
    }
    
    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }
    
    public String getStatusTanaman() {
        return statusTanaman;
    }
    
    public void setStatusTanaman(String statusTanaman) {
        this.statusTanaman = statusTanaman;
    }
}
