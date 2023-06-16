public class NhanVien extends CanBo {
private String congViec;
    public NhanVien(String hoTen, int age, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, age, gioiTinh, diaChi);
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
