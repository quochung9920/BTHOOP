package com.nqh;

public class HinhChuNhat extends Hinh {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        super("Hinh chu nhat");
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }
}
