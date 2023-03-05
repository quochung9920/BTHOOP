/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.nqh.bth4;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author admin
 */
public class App {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Date d = new Date(103, 6, 21);
        HocVien h1 = new HocVien("Nguyen Van A", "12/2/2000");
        HocVien h2 = new HocVien("Tran Thi B", "9/5/2001");
        HocVien h3 = new HocVien("Pham Van C", d);
        QuanLyHocVien ql = new QuanLyHocVien();
//        ql.nhapDsHocVien(h1,h2,h3);
        ql.nhapDsHocVien("src/main/resources/hocvien.txt");
//        ql.nhapDiem();

        ql.hienThi();
        ql.timKiem("5");
        
    }
}
