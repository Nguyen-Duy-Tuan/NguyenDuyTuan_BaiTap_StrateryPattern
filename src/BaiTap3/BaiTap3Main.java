/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String args[]) throws ParseException {
        // TODO code application logic here
         QLSV qlsv = new QLSV();
        // tạo danh sách sinh viên
        ArrayList<SinhVien> dssv = new ArrayList<>();
        // thêm danh sách 
        dssv.add(new SinhVien("Nguen Duy Tuan", new SimpleDateFormat("yyyy,mm,dd").parse("1999,2,14"), 9));
        dssv.add(new SinhVien("Vo Hao", new SimpleDateFormat("yyyy,mm,dd").parse("1999,5,12"), 7));
        dssv.add(new SinhVien("Bui Cao Quang", new SimpleDateFormat("yyyy,mm,dd").parse("2000,8,22"), 8));
        qlsv.setSinhVien(dssv);
        
        //in danh sách theo tên
        System.out.println("IN DAMH SACH TEN ");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
        System.out.println("---------------+++---------------");
        //in danh sách theo điểm
        System.out.println("IN DAMH SACH DIEM");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
