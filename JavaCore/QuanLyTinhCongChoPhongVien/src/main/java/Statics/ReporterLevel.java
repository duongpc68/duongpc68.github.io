package Statics;

public enum ReporterLevel {
    CHUYEN_NGHIEP("Chuyên Nghiệp"),
    NGHIEP_DU("Nghiệp Dư"),
    CONG_TAC_VIEN("Cộng Tác Viên");
   public String name;

    ReporterLevel(String name) {
        this.name = name;
    }

}
