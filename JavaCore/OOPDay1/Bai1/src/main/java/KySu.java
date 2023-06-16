public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, int age, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, age, gioiTinh, diaChi);
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
