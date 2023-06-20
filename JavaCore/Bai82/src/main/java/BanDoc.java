public class BanDoc extends Nguoi {
private static int maBanDocCount = 10000;
    private  int maBanDoc;
    private String loaiBanDoc;

    public BanDoc(String hoTen, String phone, String diaChi,String loaiBanDoc) {
        super();
    }

    public BanDoc() {
this.maBanDoc = maBanDocCount;
maBanDocCount++;
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


}
