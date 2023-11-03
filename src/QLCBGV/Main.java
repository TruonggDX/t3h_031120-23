package QLCBGV;

import QLKhachHang.QuanLyKH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyCBGV quanLyCBGV = new QuanLyCBGV();
        Scanner sc = new Scanner(System.in);
        int luaChon=0;
        do {
            System.out.println("**********M E N U**********");
            System.out.println("1. Thêm mới CBGV.");
            System.out.println("2. Hiển thị danh sách CBGV.");
            System.out.println("3. Xoá CBGV theo MaSoGV.");
            System.out.println("4. Thoat");
            System.out.println("Lua chon cua ban : ");
            luaChon=Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    quanLyCBGV.addCBVG();
                    break;
                case 2:
                    quanLyCBGV.showListCBGV();
                    break;
                case 3:
                    quanLyCBGV.removeCBGV();
                    System.out.println("Danh sach sau khi xoa");
                    quanLyCBGV.showListCBGV();
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
            }

        }while (luaChon!=4);
    }

}
