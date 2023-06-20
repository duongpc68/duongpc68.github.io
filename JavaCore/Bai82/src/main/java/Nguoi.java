public class Nguoi {
    protected String hoTen;
    protected String phone;
    protected String diaChi;

    public Nguoi() {
        this.hoTen = hoTen;
        this.phone = phone;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhone(String s) {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDiaChi(String s) {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", phone='" + phone + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
