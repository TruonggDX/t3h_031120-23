package QuanLyPTGT;

import QuanLyThiSinhDuThi.ThiSinhKhoiA;
import QuanLyThiSinhDuThi.ThiSinhKhoiB;
import QuanLyThiSinhDuThi.ThiSinhKhoiC;
import SoPhucInput.SoPhuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luachon=0;
        Scanner sc = new Scanner(System.in);
        QLPTGT qlptgt = new QLPTGT();
        do {
            System.out.println("**********MENU**********");
            System.out.println("1. Them phuong tien");
            System.out.println("2. Hien thi phuong tien");
            System.out.println("3. Xoa phuong tien theo mau");
            System.out.println("4. Tim phuong tien theo hang san xuat");
            System.out.println("5. Tim phuong tien theo mau");
            System.out.println("6. Thoat");
            System.out.println("Xin moi ban lua chon : ");
            luachon=Integer.parseInt(sc.nextLine());
            switch (luachon){
                case 1:
                    int temp=0;
                    System.out.println("1. Them o to");
                    System.out.println("2. Them xe may");
                    System.out.println("3. Them xe tai");
                    System.out.println("Xin moi ban lua chon : ");
                    temp=Integer.parseInt(sc.nextLine());
                    switch (temp){
                        case 1:
                            oTo oTo = new oTo();
                            oTo.nhapDL();
                            qlptgt.themPhuongTien(oTo);
                            break;
                        case 2:
                            xeMay xeMay = new xeMay();
                            xeMay.nhapDL();
                            qlptgt.themPhuongTien(xeMay);
                            break;
                        case 3:
                            xeTai xeTai = new xeTai();
                            xeTai.nhapDL();
                            qlptgt.themPhuongTien(xeTai);
                            break;
                        default:
                            System.out.println("Loi");
                    }
                    break;
                case 2:
                    qlptgt.hienThiDanhSach();
                    break;
                case 3:
                    qlptgt.xoaPTGT();
                    break;
                case 4:
                    qlptgt.timKiemTheoHang();
                    break;
                case 5:
                    qlptgt.timKiemTheoMau();
                    break;
                case 6:
                    System.out.println("Thoat");
                    return;
                default:
                    System.out.println("Nhap sai , Nhap lai");
                    break;
            }
        }while (luachon!=6);

    }
}
