package QuanLyHoSoHocSinh;

import QLKhachHang.KhachSan;

import java.util.Scanner;

public class QLHS {
    private HocSinh[] listHocSinh;
    private int soluongHocSinh;

    public QLHS() {
        listHocSinh=new HocSinh[10];
        soluongHocSinh=0;
    }
    public void addHocSinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        String hoTen=sc.nextLine();
        System.out.println("Nhap tuoi : ");
        int tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap que quan : ");
        String queQuan=sc.nextLine();
        HocSinh hocSinh = new HocSinh(hoTen,tuoi,queQuan);
        if (soluongHocSinh >= listHocSinh.length) {
            System.out.println("Danh sach khach hang da day. Vui long tang kich thuoc danh sach.");
            return;
        }

        listHocSinh[soluongHocSinh] = hocSinh;
        soluongHocSinh++;

        System.out.println("Them hoc sinh moi thanh cong.");
    }
    public void showListHS(){
        for(HocSinh hocSinh : listHocSinh){
            if (hocSinh!=null){
                hocSinh.xuatDuLieu();
            }
        }
    }
//    Hiện thị các học sinh 20 tuổi.
    public void showStudent20(){
        for (int i = 0 ; i < soluongHocSinh;i++){
            if (listHocSinh[i].getTuoi() == 20){
                listHocSinh[i].xuatDuLieu();
            }
        }
    }
    public int countStudent(){
        int count = 0;
        for (int i = 0 ; i < soluongHocSinh;i++){

            if (listHocSinh[i].getTuoi()==23 && listHocSinh[i].getQueQuan().equals("DN")){
                count++;
            }
        }
        System.out.println("So luong sinh vien 23 tuoi va o DN la : " +count);
        return count;
    }

}
