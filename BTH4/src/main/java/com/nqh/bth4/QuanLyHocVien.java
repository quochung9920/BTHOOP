/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nqh.bth4;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class QuanLyHocVien {

    private List<HocVien> ds = new ArrayList<>();

    public void nhapDsHocVien(HocVien... h) {
        this.ds.addAll(Arrays.asList(h));
    }

    public void nhapDsHocVien(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            HocVien h = new HocVien();
            h.nhapHocVien();
            this.ds.add(h);
        }
    }

    public void nhapDsHocVien(String path) throws FileNotFoundException, ParseException {
        File f = new File(path);
        try ( Scanner sc = new Scanner(f);) {

            while (sc.hasNext()) {
                HocVien h = new HocVien(sc.nextLine(), sc.nextLine());
                this.ds.add(h);
            }
        }
    }
    
    public void timKiem(String s){
        
        System.out.println(this.ds.stream().filter(x -> x.getMaHV() == Integer.parseInt(s)));
        
    }
    
    public void nhapDiem(){
        
        this.ds.forEach(x -> {
            System.out.printf("== Nhap diem cho sinh vien thu %d ==\n", x.getMaHV());
            x.nhapDiem();
        });
    }

    public void hienThi() {
        this.ds.forEach(h -> h.hienThi());
    }

    /**
     * @return the ds
     */
    public List<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }

}
