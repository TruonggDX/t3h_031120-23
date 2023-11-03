package QuanLyHoDanCu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luachon=0;
        KhuPho khuPho=new KhuPho();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***** M E N U *****");
            System.out.println("1. Them ho gia dinh");
            System.out.println("2. Hien thi danh sach cac ho gia dinh");
            System.out.println("3. Thoat");
            System.out.println("Xin moi ban lua chon : ");
            luachon=Integer.parseInt(sc.nextLine());
            switch (luachon){
                case 1:
                    khuPho.addHGD();
                    break;
                case 2:
                    khuPho.showHGD();
                    break;
                case 3:
                    System.out.println("Thoat");
                    return;
            }
        }while (luachon!=3);
    }
}
