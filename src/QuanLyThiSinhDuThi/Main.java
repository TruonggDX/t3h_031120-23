package QuanLyThiSinhDuThi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh tuyenSinh= new TuyenSinh();
        int luachon = 0;
        do {
            System.out.println("********** M E N U **********");
            System.out.println();
            System.out.println("1. Them thi sinh");
            System.out.println("2. Hien thi danh sach thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat");
            System.out.println("Xin moi ban lua chon : ");
            luachon=Integer.parseInt(sc.nextLine());
            switch (luachon){
                case 1:
                    int temp=0;
                    System.out.println("1. Them Thi Sinh Khoi A");
                    System.out.println("2. Them Thi Sinh Khoi B");
                    System.out.println("3. Them Thi Sinh Khoi C");
                    System.out.println("Xin moi ban lua chon : ");
                    temp=Integer.parseInt(sc.nextLine());
                    switch (temp){
                        case 1:
                            ThiSinhKhoiA thiSinhKhoiA =new ThiSinhKhoiA();
                            thiSinhKhoiA.nhapdulieu();
                            tuyenSinh.addThiSinh(thiSinhKhoiA);
                            break;
                        case 2:
                            ThiSinhKhoiB thiSinhKhoiB = new ThiSinhKhoiB();
                            thiSinhKhoiB.nhapdulieu();
                            tuyenSinh.addThiSinh(thiSinhKhoiB);
                            break;
                        case 3:
                            ThiSinhKhoiC thiSinhKhoiC = new ThiSinhKhoiC();
                            thiSinhKhoiC.nhapdulieu();
                            tuyenSinh.addThiSinh(thiSinhKhoiC);
                            break;
                        default:
                            System.out.println("Loi");
                    }
                    break;
                case 2:
                    tuyenSinh.showThiSinh();
                    break;
                case 3:
                    tuyenSinh.SearchSBD();
                    break;
                case 4:
                    System.out.println("Thoat");
                    return;
                default:
                    System.out.println("Nhap gia tri khong hop le ! Xin moi ban nhap lai");
                    break;
            }
        }while (luachon!=4);


    }

}
