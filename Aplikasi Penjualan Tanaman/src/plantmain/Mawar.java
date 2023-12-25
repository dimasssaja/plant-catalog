/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantmain;

/**
 *
 * @author User
 */
public class Mawar extends Plant {
    private String jenis;
    public Mawar(){
        super();
        jenis = "Mawar Berduri";
    }
    
    public void cekKondisiTumbuh(){
        if(getJumlahAir() >=3 && getJumlahPupuk() >=2) {
            tumbuh();
        }
    }
    
    public void tumbuh(){
        if(getStatusTumbuh() <4) {
            setJumlahAir(getJumlahAir() - 3);
            setJumlahPupuk(getJumlahPupuk() - 2);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }
    
    public String getJenis(){
        System.out.println(jenis);
        return jenis;
    }
}
