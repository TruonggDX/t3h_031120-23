package QuanLyTaiLieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach();
        int luaChon=0;
        do {
            System.out.println("**********M E N U**********");
            System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo.");
            System.out.println("2. Xoá tài liệu theo mã tài liệu mã tài liệu.");
            System.out.println("3. Hiện thị thông tin về tài liệu.");
            System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
            System.out.println("5. Thoat");
            System.out.println("Lua chon cua ban : ");
            luaChon=Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    System.out.println("Chọn loại tài liệu cần thêm: ");
                    System.out.println("1. Sách");
                    System.out.println("2. Tạp chí");
                    System.out.println("3. Báo");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập mã tài liệu: ");
                            String maSach = sc.nextLine();
                            System.out.println("Nhập nhà xuất bản: ");
                            String nhaXB = sc.nextLine();
                            System.out.println("Nhập số bản phát hành: ");
                            int soBanPH = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập tên tác giả: ");
                            String tenTG = sc.nextLine();
                            System.out.println("Nhập số trang: ");
                            int soTrang = Integer.parseInt(sc.nextLine());
                            Sach sach = new Sach(maSach, nhaXB, soBanPH, tenTG, soTrang);
                            quanLySach.themMoiTaiLieu(sach);
                            break;
                        case 2:
                            System.out.println("Nhập mã tài liệu: ");
                            String maTapChi = sc.nextLine();
                            System.out.println("Nhập nhà xuất bản: ");
                            String nhaXBTapChi = sc.nextLine();
                            System.out.println("Nhập số bản phát hành: ");
                            int soBanPHTapChi = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập số phát hành: ");
                            int soPH = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập tháng phát hành: ");
                            int thangPH = Integer.parseInt(sc.nextLine());
                            TapChi tapChi = new TapChi(maTapChi, nhaXBTapChi, soBanPHTapChi, soPH, thangPH);
                            quanLySach.themMoiTaiLieu(tapChi);
                            break;
                        case 3:
                            System.out.println("Nhập mã tài liệu: ");
                            String maBao = sc.nextLine();
                            System.out.println("Nhập nhà xuất bản: ");
                            String nhaXBBao = sc.nextLine();
                            System.out.println("Nhập số bản phát hành: ");
                            int soBanPHBao = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập ngày phát hành: ");
                            int ngayPHBao = Integer.parseInt(sc.nextLine());
                            Bao bao = new Bao(maBao, nhaXBBao, soBanPHBao, ngayPHBao);
                            quanLySach.themMoiTaiLieu(bao);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
                case 2:
                    quanLySach.deleteTaiLieu();
                    System.out.println("Danh sach sau khi xoa");
                    quanLySach.hienThiThongTinTaiLieu();
                    break;
                case 3:
                    quanLySach.hienThiThongTinTaiLieu();
                    break;
                case  4:
                    quanLySach.timKiemTheoLoai();
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
            }

        }while (luaChon!=5);







    }
}


