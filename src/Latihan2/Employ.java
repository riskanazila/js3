/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author WINDOWS 10
 */
class Employ extends Person{
    private String noKaryawan;
    //konstruktor
    public Employ(String noKaryawan, String nama, int usia)
    {
        super(nama, usia);//memakai super karna beda class kalau dalam 1 class bisa memakai this
        this.noKaryawan = noKaryawan;
    }
    //Method
    public void info()
    {
        System.out.println("No. Karyawan: " +this.noKaryawan);
        super.info();
    }
}//Akhir kelas Employ
