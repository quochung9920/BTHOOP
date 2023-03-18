package com.nqh;

public abstract class Hinh {
    public String ten;

    public Hinh(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return this.ten;
    }

    public abstract double tinhDienTich();

    public abstract double tinhChuVi();

    public String toString() {
        return this.ten + "\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi();
    }

    
}
