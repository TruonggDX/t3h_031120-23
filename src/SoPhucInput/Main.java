package SoPhucInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int luachon=0;
            Scanner sc = new Scanner(System.in);
            SoPhuc soPhuc = new SoPhuc();
            do {
                System.out.println("**********MENU**********");
                System.out.println("1. Nhap so phuc");
                System.out.println("2. Hien thi so phuc");
                System.out.println("3. Cong hai so phuc");
                System.out.println("4. Nhan hai so phuc");
                System.out.println("5. Thoat");
                System.out.println("Xin moi ban lua chon : ");
                luachon=Integer.parseInt(sc.nextLine());
                switch (luachon){
                    case 1:
                        soPhuc.nhapDL();
                        break;
                    case 2:
                        soPhuc.hienThiDL();
                        break;
                    case 3:
                        SoPhuc soPhuc2 = new SoPhuc();
                        soPhuc2.nhapDL();
                        soPhuc.congHaiSoPhuc(soPhuc2);
                        break;
                    case 4:
                        SoPhuc soPhuc3 = new SoPhuc();
                        soPhuc3.nhapDL();
                        soPhuc.nhanHaiSoPhuc(soPhuc3);
                        break;
                    case 5:
                        System.out.println("Thoat");
                        return;
                    default:
                        System.out.println("Nhap sai , Nhap lai");
                        break;
                }
            }while (luachon!=5);

    }
}
