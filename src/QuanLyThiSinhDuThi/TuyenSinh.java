package QuanLyThiSinhDuThi;

import java.util.Scanner;

public class TuyenSinh {
    private ThiSinh[] danhSachThiSinh;
    private int soLuongThiSinh;
    public TuyenSinh() {
        this.soLuongThiSinh = 0;
        this.danhSachThiSinh = new ThiSinh[10];
    }
    public void addThiSinh(ThiSinh thiSinh) {
        if (soLuongThiSinh < 10) {
            danhSachThiSinh[soLuongThiSinh] = thiSinh;
            soLuongThiSinh++;
            System.out.println("Success!");
        } else {
            System.out.println("Fail! Danh sach day");
        }
    }
    public void showThiSinh() {
        for (int i = 0; i < soLuongThiSinh; i++) {
            ThiSinh thiSinh = danhSachThiSinh[i];
            if (thiSinh instanceof ThiSinhKhoiA) {
                ThiSinhKhoiA thiSinhKhoiA = (ThiSinhKhoiA) thiSinh;
                System.out.println("Thong tin thi sinh khoi A:");
                thiSinhKhoiA.hienthi();
            } else if (thiSinh instanceof ThiSinhKhoiB) {
                ThiSinhKhoiB thiSinhKhoiB = (ThiSinhKhoiB) thiSinh;
                System.out.println("Thong tin thi sinh khoi B:");
                thiSinhKhoiB.hienthi();
            } else if (thiSinh instanceof ThiSinhKhoiC) {
                ThiSinhKhoiC thiSinhKhoiC = (ThiSinhKhoiC) thiSinh;
                System.out.println("Thong tin thi sinh khoi C:");
                thiSinhKhoiC.hienthi();
            }
            System.out.println();
        }
    }
    public void SearchSBD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so bao danh can tim thi sinh");
        String sbdSearch = sc.nextLine();
        for (int i = 0; i < soLuongThiSinh; i++) {
            ThiSinh thiSinh = danhSachThiSinh[i];
            if (danhSachThiSinh[i].getSbd().equals(sbdSearch)){
                if (danhSachThiSinh[i] instanceof ThiSinhKhoiA) {
                    ThiSinhKhoiA thiSinhKhoiA = (ThiSinhKhoiA) thiSinh;
                    thiSinhKhoiA.hienthi();
                } else if (danhSachThiSinh[i] instanceof ThiSinhKhoiB) {
                    ThiSinhKhoiB thiSinhKhoiB = (ThiSinhKhoiB) thiSinh;
                    thiSinhKhoiB.hienthi();
                } else if (danhSachThiSinh[i] instanceof ThiSinhKhoiC) {
                    ThiSinhKhoiC thiSinhKhoiC = (ThiSinhKhoiC) thiSinh;
                    thiSinhKhoiC.hienthi();
                }
            }
        }

    }



}
