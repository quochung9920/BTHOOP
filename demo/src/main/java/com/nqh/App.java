package com.nqh;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TamGiac tg = new TamGiac(3, 4, 5);
        TamGiac tg2 = new TamGiacCan(3, 4);
        TamGiac tg3 = new TamGiacDeu(3);
        Ellipse elip = new Ellipse(3, 4);
        Ellipse ht = new HinhTron(3);
        Ellipse ht2 = new HinhTron(5);
        HinhChuNhat hcn = new HinhChuNhat(3, 4);
        HinhChuNhat hv = new HinhVuong(3);

        QLHinh ql = new QLHinh();
        ql.themHinh(tg3);
        ql.themHinh(tg);
        ql.themHinh(tg2);
        ql.themHinh(hv);
        ql.themHinh(elip);
        ql.themHinh(ht2);
        ql.themHinh(hcn);
        ql.themHinh(ht);
        System.out.println(ql);

        // System.out.println("Danh sach hinh tron: \n");
        // for (Hinh hinh : ql.getDsHinh("Hinh tron")) {
        //     System.out.println(hinh);
        // }

        // ql.sapXepTangDan();
        // System.out.println(ql);

        ql.sapXepGiamDan();
        System.out.println(ql);

    }
}
