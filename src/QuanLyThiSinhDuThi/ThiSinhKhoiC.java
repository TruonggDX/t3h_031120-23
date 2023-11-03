package QuanLyThiSinhDuThi;

public class ThiSinhKhoiC extends ThiSinh{
    public static final String VAN = "Van";
    public static final String SU = "Su";
    public static final String DIA = "Dia";

    public ThiSinhKhoiC(String sbd, String hoTen, String diaChi, int mucUuTien) {
        super(sbd, hoTen, diaChi, mucUuTien);
    }

    public ThiSinhKhoiC() {
    }

    public String thongtin() {
        return "ThiSinhKhoiC{" +
                "" + VAN + " - " + SU + " - " + DIA +"}";
    }

    @Override
    public void nhapdulieu() {
        super.nhapdulieu();
    }


    public void hienthi() {
        super.hienthiTT();
        System.out.println(this.thongtin());
    }
}
