/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author WINDOWS 10
 */
public class Jurusan extends Sekolah{
    String jurusan = "";
    String mapel = "";
    String kelas = "";
    
    void cetakJurusan (String jmlJurusan){
        jurusan = jmlJurusan;
        System.out.println("Nama Jurusan : "+jurusan);
    }
    
      void cetakMapel (String nmMapel){
       mapel = nmMapel;
       System.out.println("Pelajaran : "+mapel);
   }
    
   void cetakKelas(String nmKelas){
        kelas = nmKelas;
        System.out.println("Kelas yang diajar : "+kelas);
    }
}
