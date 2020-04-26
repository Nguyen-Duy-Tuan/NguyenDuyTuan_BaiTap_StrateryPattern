/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class QLSV {
    ArrayList<SinhVien> sinhVien = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void setSinhVien(ArrayList<SinhVien> sinhVien) {
        this.sinhVien = sinhVien;
    }
    public void sapXep()
    {
         for(int i = 0;i < sinhVien.size() - 1  ; i++ )
         {
             for(int j = 0 ;j < sinhVien.size() -1 - i ;j++)
             {
                 if(soSanh.soSanh(sinhVien.get(j), sinhVien.get(j +1 )) > 0)
                     Collections.swap(sinhVien ,j ,j+1);
             }
         }
    }
    public void inDS()
    {
         for(int i=0; i<sinhVien.size();i++)
        {
            System.out.println("Danh sách sinh viên "+ i+"\n"
                     +"Họ tên :"+sinhVien.get(i).getHoTen()+"\n"
                     +"Ngày Sinh :"+sinhVien.get(i).getNgaySinh()+"\n"
                     +"Điểm Trung bình :"+sinhVien.get(i).getDiemTB());
        }
    }

}
