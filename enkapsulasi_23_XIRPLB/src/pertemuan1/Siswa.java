/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author R E Y z
 */
public class Siswa {
    private String nama;
    private int nilai=0;
    private String kelas;
    
    public void isiData(){
        nama = "Steven";
        nilai = 90;
        kelas  = "XI RPL B";
    }
    
    public void cetak(){
        System.out.println("nama  : " + nama);
        System.out.println("nilai  : " + nilai);
        System.out.println("kelas  : " + kelas); 
    }
}
