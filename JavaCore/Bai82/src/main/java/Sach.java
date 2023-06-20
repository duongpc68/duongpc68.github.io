public class Sach {
    private static int AUTO_ID = 10000;
    private int idSach;
    private String tenSach;
    private String tacGia;
   private int namXuatBan;
private ChuyenNganh chuyenNganh;

//    public Sach(int idSach, String tenSach, String tacGia, int namXuatBan, ChuyenNganh chuyenNganh) {
//        this.idSach = idSach;
//        this.tenSach = tenSach;
//        this.tacGia = tacGia;
//        this.namXuatBan = namXuatBan;
//        this.chuyenNganh = chuyenNganh;
//    }

    public Sach() {
this.idSach = AUTO_ID;
AUTO_ID++;
    }


    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia(String s) {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan(String s) {
        return namXuatBan;
    }


    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public ChuyenNganh getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(ChuyenNganh chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "idSach=" + idSach +
                ", tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", namXuatBan='" + namXuatBan + '\'' +
                ", chuyenNganh=" + chuyenNganh +
                '}';
    }

    public int getMaSach() {
        return idSach;
    }
}
