/*
 Day la lop thong bao loi sai nhap du lieu cua ung dujng,
Vi la lop thong bao loi la lop con cua lop Exception
 */
package basic;

/**
 *
 * @author Trick
 */
public class MyException extends Exception {
    //daam dung khong tham so
    public MyException(){
        super("Loi sai nhap du lieu!!!!");// super là nói về lớp cha- đại diện đối tượng cha
    }
    
    //ham dung co tham so - la 1 chuoi thong báo cụ thể
    public MyException(String tb){
        super(tb);
    }
}
