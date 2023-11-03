package QLKhachHang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyKH quanLyKH=new QuanLyKH();

        int luaChon=0;
        do {
            System.out.println("**********M E N U**********");
            System.out.println("1. Thêm mới Khách hàng.");
            System.out.println("2. Hiển thị danh sách khách hàng.");
            System.out.println("3. Tính tiền thuê phòng (CMND).");
            System.out.println("4. Xoá Khách hàng theo CMND.");
            System.out.println("5. Thoat");
            System.out.println("Lua chon cua ban : ");
            luaChon=Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    quanLyKH.addNguoi();
                    break;
                case 2:
                    quanLyKH.displayKH();
                    break;
                case 3:
                    quanLyKH.tienPhong();
                    break;
                case  4:
                    quanLyKH.removeNguoi();
                    quanLyKH.displayKH();
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
            }

        }while (luaChon!=5);
    }
}
