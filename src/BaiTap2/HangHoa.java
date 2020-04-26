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
public class HangHoa {
    private final String tenHH;
    private final int gia;
    private final String moTa;

    public HangHoa(String tenHH, int gia, String moTa) 
    {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    
    public String inHH() {
       return "Tên Hàng Hóa:"+tenHH+"\n"+"Giá:"+gia+"\n"+"Mô Tả:"+moTa;
    }

    public int getGia() {
        return gia;
    }
    
}
