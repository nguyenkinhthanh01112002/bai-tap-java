/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapjava;

/**
 *
 * @author KINHTHANH
 */
public class Ngay {
    private int ngay;
    private int thang;
    private int nam;
    public Ngay(int ngay,int thang,int nam)
    {
        if(ngay>=1&&ngay<=31)
        {
            this.ngay = ngay;
        }
        else
        {
            this.ngay = 1;
        }
        if(thang>=1&&thang<=12)
        {
            this.thang = thang;
        }
        else
        {
            this.thang = 1;
        }
        if(nam>=1)
        {
            this.nam = nam;
        }
        else
        {
            this.nam = 1;
        }
        
    }

    @Override
    public String toString() {
        return "Ngay{" + "ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + '}';
    }
    
}
