package com.nqh;

public class TamGiac extends Hinh {
    private double canhA;
    private double canhB;
    private double canhC;

    public TamGiac(double canhA, double canhB, double canhC) {
        super("Tam giac thuong");
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    @Override
    public double tinhDienTich() {
        double p = (this.canhA + this.canhB + this.canhC) / 2;
        return Math.sqrt(p * (p - this.canhA) * (p - this.canhB) * (p - this.canhC));
    }

    @Override
    public double tinhChuVi() {
        return this.canhA + this.canhB + this.canhC;
    }

    public double getCanhA() {
        return this.canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return this.canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return this.canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }
    
}
