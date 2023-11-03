package QuanLyHoDanCu;

import java.util.Scanner;

public class KhuPho {
    private HoGiaDinh[] listHGD;
    private int soHoGD;
    public KhuPho(){
        this.listHGD=new HoGiaDinh[10];
        this.soHoGD=0;
    }
    public void addHGD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong ho gia dinh");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin ho gia dinh thu "+(i+1)+" la : ");
            HoGiaDinh hoGiaDinh = new HoGiaDinh();
            hoGiaDinh.nhapTT();
            listHGD[soHoGD]=hoGiaDinh;
            soHoGD++;
            System.out.println("Them thanh cong");
        }
        if (soHoGD>=listHGD.length){
            System.out.println("Danh sach day");
            return;
        }
    }

    public void showHGD(){
        for (int i = 0; i < soHoGD; i++) {
            listHGD[i].xuatTT();
        }
    }
}
