/*
Class Student chua thong tin mo ta sinh vien, bao gom:
id, name, batch, namsinh, gioitinh
 */
package App;

/**
 *
 * @author Trick ( tên tác giả )
 */
public class Student {
        //chua cac thuoc tinh cua sinh vien
        public int id;
        public String name;
        public static String batch; //static: dung chung cho tat ca doi tuong
        public int yob;
        public boolean gender;
//Târ cả các class đều là con của class Object -> được thừa kế tất cả 
        //methods (phương thức) + atributes (thuộc tính) của lớp cha
   @Override
   public String toString(){
       return String.format("%8d, %-20s, %8s, %5d, %s ", id, name, batch, yob, gender?"Nam":"Nu");
   }
}
