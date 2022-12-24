/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapjava;

/**
 *
 * @author KINHTHANH
 */
public class TaiLieu {
    protected String mTL;//ma tai lieu
    protected String nXB;//nha xuat ban
    protected int bPH;//so ban phat hanh

    public TaiLieu(String mTL, String nXB, int bPH) {
        this.mTL = mTL;
        this.nXB = nXB;
        this.bPH = bPH;
    }

    public void setmTL(String mTL) {
        this.mTL = mTL;
    }

    public void setnXB(String nXB) {
        this.nXB = nXB;
    }

    public void setbPH(int bPH) {
        this.bPH = bPH;
    }
    
    
}
