/*
Lop mo ta thong tin cua 1 khach hang bao gom
Thuoc tinh: ma so, ten, email, nam sinh, gioi tinh
Phuong thuc xu ly: nhap du lieu, xuat du lieu
 */
package app;

import java.util.Scanner;

public class Customer {

    //khai bao thuoc tinh 
    public String id, name;
    String email;
    protected int yob;
    public boolean gender;
    public int rate = 1;

    //ham dung ko tham so
    public Customer() {
        id = "C00";
        name = "Ricado";
        email = "khong biet";
        yob = 2010;
        gender = true;
    }

    //phuong thuc nhap thong tin khach hang
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>Nhap thong tin khach hang:  ");

        System.out.print("Nhap mo so:  ");
        id = sc.nextLine();

        System.out.print("Nhap email:  ");
        email = sc.nextLine();

        //nhap nam sinh [1900-2015]
        while (true) {
            System.out.print("Nhap nam sinh [1900-2015]:  ");
            yob = sc.nextInt();
            if (yob >= 1900 && yob <= 2015) {
                break;
            }
            System.out.println("Nam sunh ko hop le, vui long nhap lai");
        }

        sc = new Scanner(System.in);
        //Nhap gioi tinh
        while (true) {
            System.out.print("Nhap gioi tinh [nam/nu]: ");
            String s = sc.nextLine().trim().toLowerCase();

            if (s.equals("nam") || s.equals("nu")) {
                gender = s.equals("nam");
                break;
            }
            System.out.println("Gioi tinh ko hop le, vui long nhap lai");
        }

    }

//phuong thuoc xuat thong tin khach hang
    public void display() {
        System.out.println(">>Thong tin chi tiet khach hang");
        System.out.println("Ma so: \n " + id);
        System.out.println("Ten: \n" + name);
        System.out.println("Email: \n " + email);
        System.out.printf("Nam sinh: %d- Tuoi %d \n" , yob, 2020 - yob);
        System.out.printf("Gioi tinh: %s", gender ? "Nam" : "Nu");
    }

    public Customer(String id, String name, String email, int yob, boolean gender) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gender = gender;
    }
}
