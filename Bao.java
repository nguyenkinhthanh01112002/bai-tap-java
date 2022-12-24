/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapjava;

/**
 *
 * @author KINHTHANH
 */
public class Bao extends TaiLieu {
    private Ngay nPH;//ngay phat hanh
    public Bao(String mTL,String nXB,int bPH,Ngay nPH)
    {
        super(mTL, nXB, bPH);
        this.nPH = nPH;
    }

    public Ngay getnPH() {
        return nPH;
    }

    public void setnPH(Ngay nPH) {
        this.nPH = nPH;
    }

    @Override
    public String toString() {
        return "Bao{mTL = "+mTL+", nXB = "+nXB+", bPH = "+bPH + ", nPH = " + nPH + '}';
    }
    
    
}
