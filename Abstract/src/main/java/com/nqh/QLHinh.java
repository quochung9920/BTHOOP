package com.nqh;

import java.util.ArrayList;
import java.util.List;

public class QLHinh {
    private List<Hinh> dsHinh;

    public QLHinh() {
        this.dsHinh = new ArrayList<Hinh>();
    }

    public void themHinh(Hinh hinh) {
        this.dsHinh.add(hinh);
    }

    public void xoaHinh(int index) {
        this.dsHinh.remove(index);
    }

    @Override
    public String toString() {
        String result = "";
        for (Hinh hinh : this.dsHinh) {
            result += "\n" + hinh.toString() + "\n==========================";
        }
        return result;
    }

    public List<Hinh> getDsHinh(String loai) {
        List<Hinh> dsHinh = new ArrayList<Hinh>();
        for (Hinh hinh : this.dsHinh) {
            if (hinh.getTen().equals(loai)) {
                dsHinh.add(hinh);
            }
        }
        return dsHinh;
    }

    public void sapXepTangDan() {
        for (int i = 0; i < this.dsHinh.size() - 1; i++) {
            for (int j = i + 1; j < this.dsHinh.size(); j++) {
                if (this.dsHinh.get(i).tinhDienTich() > this.dsHinh.get(j).tinhDienTich()) {
                    Hinh temp = this.dsHinh.get(i);
                    this.dsHinh.set(i, this.dsHinh.get(j));
                    this.dsHinh.set(j, temp);
                }
            }
        }
    }

    public void sapXepGiamDan() {
        for (int i = 0; i < this.dsHinh.size() - 1; i++) {
            for (int j = i + 1; j < this.dsHinh.size(); j++) {
                if (this.dsHinh.get(i).tinhChuVi() < this.dsHinh.get(j).tinhChuVi()) {
                    Hinh temp = this.dsHinh.get(i);
                    this.dsHinh.set(i, this.dsHinh.get(j));
                    this.dsHinh.set(j, temp);
                }
            }
        }
    }





}