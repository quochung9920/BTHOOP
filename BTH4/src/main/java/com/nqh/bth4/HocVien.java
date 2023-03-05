/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nqh.bth4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class HocVien {
    private static int dem = 0;
    private int maHV;
    private String hoTen;
    private Date ngaySinh;
    private double[] diem;
    
    {
        dem++;
        this.maHV = dem;
    }
    
    public HocVien(){
        
    }
    
    public HocVien(String name, Date d){
        this.hoTen = name;
        this.ngaySinh = d;
    }
    
    public HocVien(String name, String date) throws ParseException{
        this(name, CauHinh.f.parse(date));
    }
    
    public void nhapHocVien() throws ParseException{
        System.out.printf("Ho ten: ");
        this.hoTen = CauHinh.sc.nextLine();
        System.out.printf("Ngay sinh: ");
        this.ngaySinh = CauHinh.f.parse(CauHinh.sc.nextLine());
    }
    
    public void nhapDiem(){
        this.diem = new double[CauHinh.NUMBER];
        for(int i = 0; i < CauHinh.NUMBER; i++){
            System.out.printf("Nhap diem mon thu %d ", i+1);
            this.diem[i] = Double.parseDouble(CauHinh.sc.nextLine());
        }
        
    }
    
    
    
    public void hienThi(){
        System.out.printf("ID: %d\nTen: %s\nNgay sinh: %s\n", this.maHV, this.hoTen, CauHinh.f.format(this.ngaySinh));
        if(this.diem != null){
            for(double d: this.diem){
                System.out.printf("%.1f\t", d);
            }
            System.out.println();
        }
    }
    
    public int getMaHV(){
        return maHV;
    }
    
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }
}
