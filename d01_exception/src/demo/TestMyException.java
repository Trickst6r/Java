/*
 Lop nay duoc viet ra de kiem thu lop MyException
 */
package demo;

import java.util.Scanner;
import basic.MyException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMyException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Nhap vao 1 so > 0: ");
                int n = Integer.parseInt(sc.nextLine().trim());
                //tai sao khong the su dung sc.nextInt?
                //int n = sc.nextInt();
                if (n < 0) {
           
                //giải pháp 1 ném mệnh đề vào ( click bóng đèn)
                //giải pháp 2 try -
                throw new MyException("Nhap- sai roi, nhap so > 0 moi dung");
            }
                break;// nhap dung -> thoat vong lap
        }catch(Exception e){
            //sc = new Scanner(System.in);
                System.out.println("Loi: " + e.getMessage());
        
            }
            }//ket thuc While
        System.out.println("FINISHED");
        }

    }


