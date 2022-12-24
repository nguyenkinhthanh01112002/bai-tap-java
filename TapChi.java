/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapjava;

/**
 *
 * @author KINHTHANH
 */
public class TapChi extends TaiLieu {
    private int sPH;//so phat hanh
    private int tPH;//thang phat hanh
    public TapChi(String mTL,String nXB,int bPH,int sPH,int tPH){
        super(mTL, nXB, bPH);
        this.sPH = sPH;
        this.tPH = tPH;
   }

    public int getsPH() {
        return sPH;
    }

    public void setsPH(int sPH) {
        this.sPH = sPH;
    }

    public int gettPH() {
        return tPH;
    }

    public void settPH(int tPH) {
        this.tPH = tPH;
    }

    @Override
    public String toString() {
        return "TapChi{mTL = "+mTL+", nXB = "+nXB+", bPH = "+bPH + ", sPH=" + sPH + ", tPH=" + tPH + '}';
    }
    
            
}
