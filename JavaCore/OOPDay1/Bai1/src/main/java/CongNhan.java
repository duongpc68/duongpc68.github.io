public class CongNhan extends CanBo {
private int bac;

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public CongNhan(String hoTen, int age, String gioiTinh, String diaChi, int bac) {
        super(hoTen, age, gioiTinh, diaChi);

    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                '}';
    }
}
