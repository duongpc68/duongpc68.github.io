public class Sach {
    public static int maSachCount = 10000;
    public int maSach;
    public String tenSach;
    public String tacGia;
    public String chuyenNganh;
    public int namXuatBan;

    public Sach(String tenSach, String tacGia, String chuyenNganh, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.namXuatBan = namXuatBan;
    }
    public static int tangMaSach(){
        return maSachCount++;
    }

    public static int getMaSachCount() {
        return maSachCount;
    }

    public static void setMaSachCount(int maSachCount) {
        Sach.maSachCount = maSachCount;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                ", namXuatBan=" + namXuatBan +
                '}';
    }
}

