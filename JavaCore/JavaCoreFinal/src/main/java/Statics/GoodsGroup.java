package Statics;

public enum GoodsGroup {
    DIEN_TU("Điện Tử"),
    DIEN_LANH("Điện Lạnh"),
    MAY_TINH("Máy Tính"),
    THIET_BI_VAN_PHONG("Thiết Bị Văn Phòng");
    public String name;

    GoodsGroup(String name) {
        this.name = name;
    }
}
