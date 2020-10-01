/*
Test Case cho cau truc lap trinh IF_ELSE
 */
package app;

import java.util.*; //nhung thu vien chua lop Scanner

public class Test_If {

    public static void main(String[] args) {
        Test_If o = new Test_If();
        o.kiemTraNAMNHUAN();
    }

    //Ham kiem tra nam nhuan
    void kiemTraNAMNHUAN() {
        //khia bao bien doi tuong sc de thuc hien chuc nang nhap dw lieu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam muon kiem tra:"); //(Nextline, nextint()) -} Scanner -> ham nhap du lieu tu ban phim
        int year = sc.nextInt(); //Ham cho nhap 1 so nguyen

        //Kiem tra gia tri cua bien year
        if ((year % 4 == 0) && (year % 100 != 0)
                || (year % 400 == 0)) {
            System.out.printf("%d la nam nhuan", year);
        } else {
            System.out.printf("%d khong phai nam nhuan", year);
        }
    }
}