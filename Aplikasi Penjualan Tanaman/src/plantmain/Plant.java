/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantmain;

/**
 *
 * @author User
 */
public class Plant {
    private int statusTumbuh;//0-4
    private int jumlahAir;
    private int jumlahPupuk;
    public Plant() {
        statusTumbuh = 0;
        jumlahAir = 0;
        jumlahPupuk = 0;
    }
    
    public int getJumlahAir(){
        return jumlahAir;
    }
    
    public void setJumlahAir(int n){
        jumlahAir = n;
    }
    
    public int getJumlahPupuk(){
        return jumlahPupuk;
    }
    
    public void setJumlahPupuk(int n){
        jumlahPupuk = n;
    }
    
    public void setStatusTumbuh(int n){
        statusTumbuh = n;
    }
    
    public void membiarkantanaman(){
        System.out.println("Tanaman Akan Layu dan bisa mati Jika Anda Tidak Memberi Makan Apapun!");
        jumlahPupuk--;
        jumlahAir--;
        statusTumbuh--;
        layu();
        cekKondisiTumbuh();
    }
    public void beriAir() {
        jumlahAir++;
        cekKondisiTumbuh();
    }
    
    public void beriPupuk() {
        jumlahPupuk++;
        cekKondisiTumbuh();
    }
    
    public void cekKondisiTumbuh() {
        //cek kecukupan air dan pupuk
        if(jumlahAir >=3 && jumlahPupuk >=1) {
            tumbuh();
        }//else if(jumlahAir ==-1 && jumlahPupuk ==-1) {
           // tumbuh()
            //statusTumbuh--;
        //}
    }
    
    
    
    public void tumbuh() {
        if(statusTumbuh < 4) {
            jumlahAir = jumlahAir - 3;
            jumlahPupuk = jumlahPupuk - 1;
            statusTumbuh++;
        }//else if(statusTumbuh == -1){
           // jumlahAir = jumlahAir + 1;
            //jumlahPupuk = jumlahPupuk +1;
            //layu();
        //}
    }
    
    public void layu(){
        //if(jumlahAir ==-1 && jumlahPupuk ==-1){
            //statusTumbuh--;
            System.out.println("Layu");
    }
    public void displayPlant(){
        System.out.println(getStatusTumbuhText());
        System.out.println("Jumlah Air:" + jumlahAir);
        System.out.println("Jumlah Pupuk:" + jumlahPupuk);
        System.out.println("Angka Pertumbuhan : " + statusTumbuh);
    }
    public String getStatusTumbuhText() {
        switch(statusTumbuh) {
            case 0: 
                if(jumlahAir==-1 && jumlahPupuk==-1){
                    layu();
                    break;
            }else{
                    return"Benih";
                }
            case 1: 
                if(jumlahAir==-1 && jumlahPupuk==-1){
                    layu();
                    break;
                }else{
                    return"Tunas";
                }
            case 2: 
                if(jumlahAir==-1 && jumlahPupuk==-1){
                    layu();
                    break;
                }else{
                    return "Tanaman Kecil";
                }
            case 3:
                if(jumlahAir==-1 && jumlahPupuk==-1){
                    layu();
                    break;
                }else{
                    return "Tanaman Dewasa";
                }
            case 4: 
                if(jumlahAir==-1 && jumlahPupuk==-1){
                    layu();
                    break;
            }else{
                    return "Berbunga";
                }
        }
        return "Bunga Mati";
    }
    public int getStatusTumbuh(){
        return statusTumbuh;
    }
}