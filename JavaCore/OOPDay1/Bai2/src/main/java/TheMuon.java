public class TheMuon {
    public int maPhieuMuon;
    public int ngayMuon;
    public int hanTra;
    public int soHieuSach;
    public SinhVien sinhVien;

    public TheMuon(int maPhieuMuon, int ngayMuon, int hanTra, int soHieuSach, SinhVien sinhVien) {
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }

    public int getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(int maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra(int hanTra) {
        this.hanTra = hanTra;
    }

    public int getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "maPhieuMuon=" + maPhieuMuon +
                ", ngayMuon=" + ngayMuon +
                ", hanTra=" + hanTra +
                ", soHieuSach=" + soHieuSach +
                ", sinhVien=" + sinhVien +
                '}';
    }
}
