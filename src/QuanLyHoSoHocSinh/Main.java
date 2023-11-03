package QuanLyHoSoHocSinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLHS qlhs=new QLHS();
        int luachon=0;
        do {
            System.out.println("**********M E N U**********");
            System.out.println();
            System.out.println("1. Them hoc sinh");
            System.out.println("2. Hien thi danh sach hoc sinh");
            System.out.println("3. Hien thi cac hoc sinh 20 tuoi");
            System.out.println("4. So luong hoc sinh 20 tuoi va que o DN ");
            System.out.println("5. Thoat");
            System.out.println("Xin moi ban lua chon : ");
            luachon=sc.nextInt();
            sc.nextLine();
            switch (luachon){
                case 1:
                    qlhs.addHocSinh();
                    break;
                case 2:
                    qlhs.showListHS();
                    break;
                case 3:
                    qlhs.showStudent20();
                    break;
                case 4:
                    qlhs.countStudent();
                    break;
                case 5:
                    System.out.println("Thoat");
                    return;
                default:
                    System.out.println("Gia tri nhap khong hop le ! Nhap lai....DXT");
                    break;
            }
        }while (luachon!=5);
    }

}
