package QuanLyBienLaiThuTien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyKH quanLyKH = new QuanLyKH();
        int luaChon=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("******M E N U******");
            System.out.println("1. Them khach hang");
            System.out.println("2. Hien thi danh sach khach hang");
            System.out.println("3. Xoa khach hang");
            System.out.println("4. Sua thong tin khach hang");
            System.out.println("5. Thoat");
            System.out.println("Xin moi ban lua chon : ");
            luaChon=Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    quanLyKH.addKH();
                    break;
                case 2:
                    quanLyKH.showKH();
                    break;
                case 3:
                    quanLyKH.removeKH();
                    System.out.println("danh sach sau khi xoa");
                    quanLyKH.showKH();
                    break;
                case 4:
                    quanLyKH.editKH();
                    System.out.println("Danh sach sau khi sua");
                    quanLyKH.showKH();
                    break;
                case 5:
                    System.out.println("Thoat");
                    return;
            }
        }while (luaChon!=5);
    }
}
