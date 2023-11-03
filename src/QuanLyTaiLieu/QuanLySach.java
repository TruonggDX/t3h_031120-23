package QuanLyTaiLieu;

import java.util.Scanner;
public class QuanLySach {
    private TaiLieu[] listTaiLieu;
    private int soLuongTaiLieu;

    public QuanLySach() {
        listTaiLieu = new TaiLieu[100];
        soLuongTaiLieu = 0;
    }

    public void themMoiTaiLieu(TaiLieu taiLieu) {
        if (soLuongTaiLieu < 100) {
            listTaiLieu[soLuongTaiLieu] = taiLieu;
            soLuongTaiLieu++;
            System.out.println("Success!");
        } else {
            System.out.println("Fail! Danh sach day");
        }
    }


    public void deleteTaiLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu can xoa: ");
        String idDelete = scanner.nextLine();
        for (int i = 0; i < this.soLuongTaiLieu; i++) {
            TaiLieu taiLieuDelete = this.listTaiLieu[i];
            if (taiLieuDelete != null && taiLieuDelete.getMaTL().equals(idDelete)) {
                for (int j = i; j < this.soLuongTaiLieu - 1; j++) {
                    listTaiLieu[j] = listTaiLieu[j + 1];
                }
                listTaiLieu[this.soLuongTaiLieu - 1] = null;
                this.soLuongTaiLieu--;
                System.out.println("Success!");
                return;
            }
        }
        System.out.println("Fail, Khong tim thay tai lieu co "+ idDelete );
    }


    public void hienThiThongTinTaiLieu() {
            for (TaiLieu taiLieu: listTaiLieu) {
                if (taiLieu != null){
                    taiLieu.displayData();
                }
            }
    }

    public void timKiemTheoLoai() {
        Scanner sc = new Scanner(System.in);
        Sach[] listSach = new Sach[soLuongTaiLieu];
        TapChi[] listTapChi = new TapChi[soLuongTaiLieu];
        Bao[] listBao = new Bao[soLuongTaiLieu];
        System.out.println("Nhap tai lieu ban muon tim : ( 1. Sách  2. Tạp chí   3. Báo ) : ");
        int choose = sc.nextInt();
        sc.nextLine();
        int index = 0;
        switch (choose){
            case 1:

                for (int i = 0; i < soLuongTaiLieu; i++) {
                    TaiLieu taiLieu = listTaiLieu[i];
                    if (taiLieu.getClass() == Sach.class) {
                        listSach[index] = (Sach) taiLieu;
                        index++;
                    }
                }
                for (int i = 0; i < index; i++) {
                    Sach sach = listSach[i];
                    sach.displayData();
                }
                break;
            case 2:

                for (int i = 0; i < soLuongTaiLieu; i++) {
                    TaiLieu taiLieu = listTaiLieu[i];
                    if (taiLieu.getClass() == TapChi.class) {
                        listTapChi[index] = (TapChi) taiLieu;
                        index++;
                    }
                }
                for (int i = 0; i < index; i++) {
                    TapChi tapChi = listTapChi[i];
                    tapChi.displayData();
                }
                break;
            case 3:

                for (int i = 0; i < soLuongTaiLieu; i++) {
                    TaiLieu taiLieu = listTaiLieu[i];
                    if (taiLieu.getClass() == Bao.class) {
                        listBao[index] = (Bao) taiLieu;
                        index++;
                    }
                }
                for (int i = 0; i < index; i++) {
                    Bao bao = listBao[i];
                    bao.displayData();
                }
                break;
            default:
                System.out.println("Loi");
                break;
        }

    }
}



