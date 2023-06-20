public class BanDoc extends Nguoi {
 private static int maBanDocCount = 10000;
  private int maBanDoc;
    private String loaiBanDoc;

    public BanDoc(String hoTen, String diaChi,String soDienThoai, String loaiBanDoc) {
        super(hoTen, diaChi, Integer.parseInt(soDienThoai), loaiBanDoc);
        this.loaiBanDoc = loaiBanDoc;
    }


    //mã bạn đọc tự tăng
    static int tangMaBanDoc(){
        return maBanDocCount++;
    }

    public static int getMaBanDocCount() {
        return maBanDocCount;
    }

    public static void setMaBanDocCount(int maBanDocCount) {
        BanDoc.maBanDocCount = maBanDocCount;
    }

    public int getMaBanDoc() {
        return maBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        this.maBanDoc = maBanDoc;
    }

    public String getLoaiBanDoc() {
        return loaiBanDoc;
    }

    public void setLoaiBanDoc(String loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }

    @Override
    public String toString() {
        return "BanDoc{" +
                "maBanDoc=" + maBanDoc +
                ", loaiBanDoc='" + loaiBanDoc + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

}
