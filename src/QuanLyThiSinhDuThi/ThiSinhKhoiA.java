package QuanLyThiSinhDuThi;

public class ThiSinhKhoiA extends ThiSinh{
    public static final String TOAN = "Toan";
    public static final String LY = "Ly";
    public static final String HOA = "Hoa";

    public ThiSinhKhoiA(String sbd, String hoTen, String diaChi, int mucUuTien) {
        super(sbd, hoTen, diaChi, mucUuTien);
    }

    public ThiSinhKhoiA() {
    }


    public String hienthidl() {
        return "ThiSinhKhoiA{" +
                "" + TOAN + " - " + LY + " - " + HOA +"}";
    }

    @Override
    public void nhapdulieu() {
        super.nhapdulieu();
    }

    public void hienthi() {
        super.hienthiTT();
        System.out.println(this.hienthidl());
    }
}
