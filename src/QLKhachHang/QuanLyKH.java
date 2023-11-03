package QLKhachHang;

import java.util.Scanner;

public class QuanLyKH {
    private KhachSan[] listKhachHang;
    private int soLuongKhachHang;

    public QuanLyKH() {
        listKhachHang=new KhachSan[10];
        soLuongKhachHang=0;
    }
    public void addNguoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        String hoTen=sc.nextLine();
        System.out.println("Nhap tuoi : ");
        int tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so CMND : ");
        long soCMND=Long.parseLong(sc.nextLine());
        System.out.println("Nhap so ngay thue: ");
        int soNgayThue=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap loai phong ( A. Loại A B.Loại B C.Loại C ) : ");
        String loaiPhong=sc.nextLine();
        switch (loaiPhong){
            case "A" :
                loaiPhong ="A";
                break;
            case "B" :
                loaiPhong="B";
                break;
            case "C":
                loaiPhong="C";
                break;
            default:
                System.out.println("Gia tri khong hop le");
                break;
        }
        KhachSan khachSan = new KhachSan(hoTen,tuoi,soCMND,soNgayThue,loaiPhong);

        if (soLuongKhachHang >= listKhachHang.length) {
            System.out.println("Danh sach khach hang da day. Vui long tang kich thuoc danh sach.");
            return;
        }

        listKhachHang[soLuongKhachHang] = khachSan;
        soLuongKhachHang++;

        System.out.println("Them khach hang moi thanh cong.");
    }

    public void displayKH(){
        for(KhachSan khachSan : listKhachHang){
            if (khachSan != null){
                khachSan.display();
            }
        }
    }


    public void removeNguoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so CMND cua Khach Hang can xoa : ");
        long cmndDelete=sc.nextLong();
        for (int i = 0 ; i < soLuongKhachHang;i++){
            Nguoi nguoiDelete = this.listKhachHang[i];
            if (nguoiDelete!=null && nguoiDelete.getSoCMND() == (cmndDelete)){
                for (int j = i ; j < soLuongKhachHang;j++){
                    listKhachHang[j]=listKhachHang[j+1];
                }
                listKhachHang[this.soLuongKhachHang - 1 ]=null;
                soLuongKhachHang--;
                System.out.println("Success");
                return;
            }
        }
        System.out.println("Fail, Khong tim thay tai lieu co "+cmndDelete);
    }

    public float tienPhong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số CMND của khách hàng: ");
        long cmndNew = Long.parseLong(sc.nextLine());
        float tien=0;
        for (int i = 0; i < soLuongKhachHang; i++) {
            if (listKhachHang[i].getSoCMND() == cmndNew) {
                if (listKhachHang[i].getLoaiPhong().equals("A")) {
                    tien = listKhachHang[i].getPhongA() * listKhachHang[i].getSoNgayThue();
                    break;
                } else if (listKhachHang[i].getLoaiPhong().equals("B")) {
                    tien = listKhachHang[i].getPhongB()  * listKhachHang[i].getSoNgayThue();
                    break;
                } else if (listKhachHang[i].getLoaiPhong().equals("C")) {
                    tien = listKhachHang[i].getPhongC()  * listKhachHang[i].getSoNgayThue();
                    break;
                }
                break;
            }
        }

        System.out.println("Tiền thuê phòng: " + tien);
        return tien;
    }


}
