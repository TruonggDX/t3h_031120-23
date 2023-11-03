package QuanLyMuonTraSach;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLMuonTra qlMuonTra=new QLMuonTra();
        int luachon=0;
        do {
            System.out.println("********** M E N U **********");
            System.out.println();
            System.out.println("1. Thêm thẻ mượn ");
            System.out.println("2. Hiển thị danh sách thẻ mượn ");
            System.out.println("3. Xóa thẻ mượn theo mã thẻ mượn");
            System.out.println("4. Thoát");
            System.out.println("Xin moi ban lua chon : ");
            luachon=sc.nextInt();
            sc.nextLine();
            switch (luachon){
                case 1:
                    qlMuonTra.addTheMuon();
                    break;
                case 2:
                    qlMuonTra.hienThiTheMuon();
                    break;
                case 3:
                    qlMuonTra.xoaTheMuon();
                    System.out.println("Danh sach sau khi xoa");
                    qlMuonTra.hienThiTheMuon();
                    break;
                case 4:
                    System.out.println("exit.....DXT");
                    return;
                default:
                    System.out.println("Gia tri khong hop le ! Nhap lai");
            }
        }while (luachon!=4);
    }
}
