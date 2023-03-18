package com.nqh;

public class Ellipse extends Hinh {
    private double trucLon;
    private double trucNho;

    public Ellipse(double trucLon, double trucNho) {
        super("Hinh elip");
        this.trucLon = trucLon;
        this.trucNho = trucNho;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * this.trucLon * this.trucNho;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI * (3 * (this.trucLon + this.trucNho) - Math.sqrt((3 * this.trucLon + this.trucNho) * (this.trucLon + 3 * this.trucNho)));
    }

    public double getTrucLon() {
        return this.trucLon;
    }

    public void setTrucLon(double trucLon) {
        this.trucLon = trucLon;
    }

    public double getTrucNho() {
        return this.trucNho;
    }

    public void setTrucNho(double trucNho) {
        this.trucNho = trucNho;
    }

}
