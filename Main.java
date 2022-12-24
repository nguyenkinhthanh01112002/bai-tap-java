/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapjava;

import java.util.Scanner;

/**
 *
 * @author KINHTHANH
 */
public class Main {
    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLiSach quanLiSach = new QuanLiSach();
        boolean check;
        while(true)
        {
            System.out.println("1.Them moi tai lieu");
            System.out.println("2.Hien thi thong tin tai lieu");
            System.out.println("3.Xoa tai lieu theo ma tai lieu");
            System.out.println("4.Tim kiem tai lieu theo loai");
            System.out.println("0.Thoat khoi chuong trinh");
            String button = scanner.nextLine();
            switch(button)
            {
                case "1":
                {
                    System.out.println("a.Them sach vao tai lieu can quan li");
                    System.out.println("b.Them tap chi vao tai lieu can quan li");
                    System.out.println("c.Them bao vao tai lieu can quan li");
                    String type = scanner.nextLine();
                    switch(type)
                    {
                        case "a":
                        {
                            
                            do
                            {
                                System.out.print("nhap vao ma tai lieu: ");
                                String mTL = scanner.nextLine();
                                check = quanLiSach.kiemTra(mTL);
                                System.out.print("nhap vao ten cua nha xuat ban: ");
                                String nXB = scanner.nextLine();
                                System.out.print("nhap vao so ban da phat hanh: ");
                                int bPH = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("nhap vao ten tac gia: ");
                                String tTG = scanner.nextLine();
                                System.out.print("nhap vao so trang sach: ");
                                int soTrang = scanner.nextInt();
                                scanner.nextLine();                                           
                                if(check==false)
                                {
                                  TaiLieu sach = new Sach(mTL, nXB, bPH, tTG, soTrang);
                                  quanLiSach.addDocuments(sach);  
                                }
                                else
                                {
                                    System.out.println("ma tai lieu da trung vui long nhap lai!!!");
                                }
                            }
                            while(check==true);
                            break;
                        }

                        case "b":
                        {                          
                            do
                            {
                                System.out.print("nhap vao ma tai lieu: ");
                                String mTL = scanner.nextLine();
                                check = quanLiSach.kiemTra(mTL);
                                System.out.print("nhap vao ten cua nha xuat ban: ");
                                String nXB = scanner.nextLine();
                                System.out.print("nhap vao so ban da phat hanh: ");
                                int bPH = scanner.nextInt();
                                System.out.print("nhap vao so phat hanh: ");
                                int sPH = scanner.nextInt();
                                System.out.print("nhap vao thang phat hanh: ");
                                int tPH= scanner.nextInt();
                                scanner.nextLine();
                                if(check==false)
                                {
                                    TaiLieu tapChi = new TapChi(mTL, nXB, bPH, sPH, tPH);
                                    quanLiSach.addDocuments(tapChi);
                                }
                                //TaiLieu tapChi = new TapChi(mTL, nXB, bPH, sPH, tPH);
                                else
                                {
                                    System.out.println("ma tai lieu da trung vui long nhap lai!!!");
                                }
                                
                            }
                            while(check==true);
                            break;
                        }
                        case "c":
                        {
                            do
                            {
                               System.out.print("nhap vao ma tai lieu: ");
                               String mTL = scanner.nextLine();
                               check = quanLiSach.kiemTra(mTL);
                               System.out.print("nhap vao ten cua nha xuat ban: ");
                               String nXB = scanner.nextLine();
                               System.out.print("nhap vao so ban da phat hanh: ");
                               int bPH = scanner.nextInt(); 
                               System.out.print("nhap vao ngay phat hanh: ");
                               int ngay = scanner.nextInt();
                               System.out.print("nhap vao thang phat hanh: ");
                               int thang= scanner.nextInt();
                               System.out.print("nhap vao nam phat hanh: ");
                               int nam = scanner.nextInt();
                               Ngay nPH = new Ngay(ngay, thang, nam);
                               scanner.nextLine();
                               if(check==false)
                               {
                                  TaiLieu bao = new Bao(mTL, nXB, bPH, nPH);
                                  quanLiSach.addDocuments(bao); 
                               }
                               else
                               {
                                   System.out.println("ma tai lieu da trung vui long nhap lai!!!"); 
                               }
                               
                            }
                            while(check==true);
                            break; 
                        }
                        default:
                        {
                            System.out.println("du lieu khong hop le");
                            break;
                        }
                    }
                    break;
                }
                case "2":
                {
                    quanLiSach.showDocuments();
                    break;
                }
                case "3":
                {
                    System.out.print("nhap vao ma tai lieu can xoa: ");
                    String maCanXoa = scanner.nextLine();
                    quanLiSach.removeDocments(maCanXoa);
                    quanLiSach.showDocuments();
                    break;
                }
                case "4":
                {
                    System.out.print("nhap vao loai tai lieu can tim kiem:(Sach,TapChi,Bao): ");
                    String loai = scanner.nextLine();
              
                    quanLiSach.timKiemTheoLoai(loai);
                    break;
                }
                case "0":
                {
                    return;
                }
                default:
                {
                    System.out.println("du lieu khong hop le");
                    continue;
                }
            }
        }
    }
    
}
