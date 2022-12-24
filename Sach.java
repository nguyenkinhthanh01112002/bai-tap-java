/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapjava;

/**
 *
 * @author KINHTHANH
 */
public class Sach extends TaiLieu {
    private String tTG;//ten tac gia
    private int soTrang;//so trang sach
    public Sach(String mTL,String nXB,int bPH,String tTG,int soTrang)
    {
        super(mTL, nXB, bPH);
        this.tTG = tTG;
        this.soTrang = soTrang;
    }

    public String gettTG() {
        return tTG;
    }

    public void settTG(String tTG) {
        this.tTG = tTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{mTL = "+mTL+", nXB = "+nXB+", bPH = "+bPH + ", tTG=" + tTG + ", soTrang=" + soTrang + '}';
    }
    
   

   

  
    
}
