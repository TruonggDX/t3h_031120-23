package QuanLyBienLaiThuTien;

import java.util.Scanner;

public class QuanLyKH {
    private KhachHang[] listKH;
    private int soLuongKH;
    public QuanLyKH(){
        this.listKH=new KhachHang[10];
        this.soLuongKH = 0;
    }

    public void addKH(){
        KhachHang khachHang = new KhachHang();
        khachHang.nhap();
        if (soLuongKH>=listKH.length){
            System.out.println("Danh sach day");
        }
        listKH[soLuongKH]=khachHang;
        soLuongKH++;
        System.out.println("them thanh cong");
    }
    public void showKH(){
        for(KhachHang khachHang : listKH){
            if (khachHang!=null){
                khachHang.hienthi();
            }
        }
    }
    public void removeKH(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten khach hang can xoa : ");
        String tenDelete = sc.nextLine();
        for(int i = 0 ; i < soLuongKH;i++){
            KhachHang khachHang = listKH[i];
            if (khachHang!=null && khachHang.getHoTen().equals(tenDelete)){
                for (int j = i; j < soLuongKH; j++) {
                    listKH[j]=listKH[j+1];
                }
                listKH[soLuongKH - 1]=null;
                soLuongKH--;
                return;
            }
        }
        System.out.println("Fail,Khong tim thay khach hang co ten "+tenDelete +"de xoa");
    }
    public void editKH(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten khach hang can sua : ");
        String tenEdit = sc.nextLine();
        for (int i = 0; i < soLuongKH; i++) {
            if (listKH[i].getHoTen().equals(tenEdit)){
                System.out.println("Thong tin khach hang can sua");
                listKH[i].hienthi();
                System.out.println("Sua thong tin khach hang");
                System.out.println("Nhap ho ten : ");
                String hoTen=sc.nextLine();
                System.out.println("Nhap so nha : ");
                int soNha=Integer.parseInt(sc.nextLine());
                System.out.println("Nhap ma cong to : ");
                String maCongTo=sc.nextLine();
                listKH[i].setHoTen(hoTen);
                listKH[i].setSoNha(soNha);
                listKH[i].setMaCongTo(maCongTo);
                System.out.println("Edit thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay khach hang can sua.");
    }
}
