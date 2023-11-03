package QuanLyPTGT;


import QuanLyThiSinhDuThi.ThiSinhKhoiA;
import QuanLyThiSinhDuThi.ThiSinhKhoiB;
import QuanLyThiSinhDuThi.ThiSinhKhoiC;

import java.util.Scanner;

public class QLPTGT {
    private PhuongTienGT[] dsPhuongTien;
    private int soLuongPTGT;

    public QLPTGT() {
        dsPhuongTien = new PhuongTienGT[10];
        soLuongPTGT = 0;
    }

    public void themPhuongTien(PhuongTienGT phuongtien) {
        if (soLuongPTGT < dsPhuongTien.length) {
            dsPhuongTien[soLuongPTGT] = phuongtien;
            soLuongPTGT++;
            System.out.println("Them thanh cong!");
        } else {
            System.out.println("Danh sach day!");
        }
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < soLuongPTGT; i++) {
            PhuongTienGT phuongTienGT = dsPhuongTien[i];
            if (phuongTienGT instanceof oTo) {
                System.out.println("Thong tin xe oto:");
                oTo oto = (oTo) phuongTienGT;
                oto.xuatdata();
            } else if (phuongTienGT instanceof xeMay) {
                System.out.println("Thong tin xe may:");
                xeMay xemay = (xeMay) phuongTienGT;
                xemay.xuatdata();
            } else if (phuongTienGT instanceof xeTai) {
                System.out.println("Thong tin xe tai:");
                xeTai xetai = (xeTai) phuongTienGT;
                xetai.xuatdata();
            }
            System.out.println();
        }
    }
    public void xoaPTGT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau xe can xoa");
        String mauXeDelete = sc.nextLine();
        for (int i = 0; i < soLuongPTGT; i++) {
            PhuongTienGT phuongTienGT =dsPhuongTien[i];
            if (phuongTienGT!=null && phuongTienGT.getMauXe().equals(mauXeDelete)){
                for (int j = i; j < soLuongPTGT; j++) {
                    dsPhuongTien[j]=dsPhuongTien[j+1];
                }
                dsPhuongTien[soLuongPTGT - 1]=null;
                soLuongPTGT--;
                System.out.println("Success");
                return;
            }
        }
        System.out.println("Fail, Khong tim thay phuong tien co "+mauXeDelete+" de xoa");
    }
    public void timKiemTheoMau(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau xe can tim");
        String mauXe = sc.nextLine();
        for (int i = 0; i < soLuongPTGT; i++) {
            PhuongTienGT phuongTienGT =dsPhuongTien[i];
            if (dsPhuongTien[i].getMauXe().equals(mauXe)){
                if (dsPhuongTien[i] instanceof oTo) {
                    oTo oto = (oTo) phuongTienGT;
                    oto.xuatdata();
                } else if (dsPhuongTien[i] instanceof xeMay) {
                    xeMay xemay = (xeMay) phuongTienGT;
                    xemay.xuatdata();
                } else if (dsPhuongTien[i] instanceof xeTai) {
                    xeTai xetai = (xeTai) phuongTienGT;
                    xetai.xuatdata();
                }
            }
        }
    }
    public void timKiemTheoHang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang xe can tim");
        String hangXe = sc.nextLine();
        for (int i = 0; i < soLuongPTGT; i++) {
            PhuongTienGT phuongTienGT =dsPhuongTien[i];
            if (dsPhuongTien[i].getHangSX().equals(hangXe)){
                if (dsPhuongTien[i] instanceof oTo) {
                    oTo oto = (oTo) phuongTienGT;
                    oto.xuatdata();
                } else if (dsPhuongTien[i] instanceof xeMay) {
                    xeMay xemay = (xeMay) phuongTienGT;
                    xemay.xuatdata();
                } else if (dsPhuongTien[i] instanceof xeTai) {
                    xeTai xetai = (xeTai) phuongTienGT;
                    xetai.xuatdata();
                }
            }
        }
    }



}

