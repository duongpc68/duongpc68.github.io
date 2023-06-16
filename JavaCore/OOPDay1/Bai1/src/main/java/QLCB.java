

public class QLCB {
    CanBo [] danhSachCanBo;
    int soLuongCanBo;
    public QLCB(){
        danhSachCanBo = new CanBo[100];
        soLuongCanBo = 0;
    }
    public void themCanBo(CanBo canBo){
        danhSachCanBo[soLuongCanBo] = canBo;
        soLuongCanBo++;
        System.out.println("Thêm mới cán bộ thành công!");
    }
public void timKiemCanBoTheoTen(String hoTen){
        boolean found = false;
        for (int i = 0; i < soLuongCanBo; i++){
            if (danhSachCanBo[i].getHoTen().equalsIgnoreCase(hoTen)){
                System.out.println("Thông tin cán bộ được tìm thấy: ");
                System.out.println(danhSachCanBo[i]);
                found = true;
                break;
            }
            else {
                System.out.println("Không tồn tại cán bộ có họ tên: "+hoTen);
            }
        }

}
public void hienThiDanhSachCanBo(){
        if (soLuongCanBo == 0){
            System.out.println("Danh sách cán bộ rỗng!");
        }
        else {
            System.out.println("Danh sách cán bộ:");
            for (int i = 0; i < soLuongCanBo; i++){
                System.out.println(danhSachCanBo[i]);
            }
        }
}
public void thoatChuongTrinh(){
    System.out.println("Chương trình dừng hoạt động!");
    System.exit(0);
}
}
