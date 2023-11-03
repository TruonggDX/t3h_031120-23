package Chuoi_VanBan;

import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao van ban : ");
        String st = scanner.nextLine();
        VanBan vanBan = new VanBan(st);
        int luachon=0;
        do {
            System.out.println("Chon chuc nang:");
            System.out.println("1. Dem so tu");
            System.out.println("2. Dem so luong ki tu 'A'");
            System.out.println("3. Chuan hoa van ban");
            System.out.println("4. Hien thi van ban vua nhap");
            System.out.println("5. Thoat");
            luachon = Integer.parseInt(scanner.nextLine());

            switch (luachon) {
                case 1:
                    int soTu = vanBan.count_word(st);
                    System.out.println("So tu trong van ban: " + soTu);
                    break;
                case 2:
                    int soLuongA = vanBan.countA(st);
                    System.out.println("So luong ki tu 'A' trong van ban: " + soLuongA);
                    break;
                case 3:
                    String vanBanChuanHoa = vanBan.chuanHoa(st);
                    System.out.println("VB chuan hoa: " + vanBanChuanHoa);
                    break;
                case 4:
                    vanBan.hienThiVanBan();
                    break;
                case 5:
                    System.out.println("Thoat");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (luachon != 8);
    }
}
