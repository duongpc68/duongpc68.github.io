package Static;

public enum CustomerLevel {
    CA_NHAN ("Cá Nhân"),
    DAI_DIEN_DON_VI_HANH_CHINH("Đại Diện Đơn Vị Hành Chính"),
    DAI_DIEN_DON_VI_KINH_DOANH("Đại Diện Đơn Vị Kinh Doanh");
    public String name;
    CustomerLevel(String name){
        this.name = name;
    }
}
