/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KINHTHANH
 */
public class QuanLiSach {
    private List<TaiLieu> documents;
    public QuanLiSach()
    {
        this.documents = new ArrayList<>();
    }
    public void addDocuments(TaiLieu document)
    {
        this.documents.add(document);
    }
    public void removeDocments(String maCanXoa)
    {
        for(int i=0;i<documents.size();i++)
        {
            if(documents.get(i).mTL.equals(maCanXoa)==true)
            {
                documents.remove(i);
            }
        }
    }
     public void showDocuments()
     {
         this.documents.forEach(o->{
             System.out.println(o.toString());
         });
     }
     public void timKiemTheoLoai(String loai)
     {
        for(TaiLieu o:documents)
        {
            if(loai.equals("Sach")==true||loai.equals("sach")==true&&(o instanceof Sach==true))
            {
                System.out.println(o.toString());
            }
            if(loai.equals("TapChi")==true||loai.equals("tapchi")==true&&(o instanceof TapChi==true))
            {
                System.out.println(o.toString());
            }
            if(loai.equals("Bao")==true||loai.equals("bao")==true&&(o instanceof Bao==true))
            {
                System.out.println(o.toString());
            }
            
        }
     }     
     public boolean kiemTra(String mTL)
     {
         for(int i=0;i<documents.size();i++)
         {
             if(documents.get(i).mTL.contains(mTL)==true)
             {
                 return true;
             }
         }
         return false;
     }
}
