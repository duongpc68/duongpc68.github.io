public class QuanLyTheMuon {
    public TheMuon[] danhSachTheMuon;
    public int soLuongTheMuon;
    public QuanLyTheMuon(){
        danhSachTheMuon = new TheMuon[100];
        soLuongTheMuon = 0;
    }
    public void themTheMuon(TheMuon theMuon){
        if (soLuongTheMuon < danhSachTheMuon.length){
            danhSachTheMuon[soLuongTheMuon] = theMuon;
            soLuongTheMuon++;
            System.out.println("Thêm thẻ mượn thành công");
        }
        else {
            System.out.println("Danh sách thẻ mượn đã đầy!");
        }
    }
    public void xoaTheMuon(int maPhieuMuon){
        boolean timThay = false;
        for (int i = 0; i < soLuongTheMuon; i++){
            if (danhSachTheMuon[i].getMaPhieuMuon() == maPhieuMuon){
                for (int j = i; j < soLuongTheMuon - 1; j++){
                    danhSachTheMuon[j] = danhSachTheMuon[j+1];
                }
                danhSachTheMuon[soLuongTheMuon - 1] = null;
                soLuongTheMuon--;
                System.out.println("Xóa thẻ thành công!");
                timThay=true;
                break;
            }
        }
        if(!timThay){
            System.out.println("Không tìm thấy thẻ mượn với mã phiếu mượn" + maPhieuMuon);
        }
    }
    public void hienThiDanhSachTheMuon(){
        if (soLuongTheMuon == 0){
            System.out.println("Danh sách thẻ mượn rỗng!");
        }
        else {
            System.out.println("Danh sách thẻ mượn: ");
            for (int i = 0; i< soLuongTheMuon; i++){
                System.out.println(danhSachTheMuon[i]);
            }

        }
    }
}
