/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Admin
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        HangHoa hangHoa1 = new HangHoa("SoColast", 30000, "Kẹo ngọt");
        HangHoa hangHoa2 = new HangHoa("Pulict", 5000000, "Bánh ngọt");
        GioHang gioHang1 = new GioHang();
        gioHang1.themHH(hangHoa1);
        gioHang1.themHH(hangHoa2);
        gioHang1.setHinhThucTT(new ThanhToanCOD());
        gioHang1.inDSHH();
        System.out.println("Tiền khách phải trả: "+gioHang1.getThanhToan(gioHang1.getTienHang())+"\n");
        
        HangHoa hangHoa3 = new HangHoa("CoCa CoLa", 6300000, "Nước ngọt");
        HangHoa hangHoa4 = new HangHoa("Revia", 200000, "Nước lọc");
        GioHang gioHang2 = new GioHang();
        gioHang2.themHH(hangHoa3);
        gioHang2.themHH(hangHoa4);
        gioHang2.setHinhThucTT(new ThanhToanOnline());
        gioHang2.inDSHH();
        System.out.println("Tiền khách phải trả: "+gioHang2.getThanhToan(gioHang2.getTienHang()));
        
    }
}
