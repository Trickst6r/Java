/*
La Lop kiem thu cac doi tuong Student 
 */
package App;

public class TestStudent {

    public static void main(String[] args) {
        //khoi tao ma lop hoc cho cac sinh vien thuoc class Student
        Student.batch = "1097-M0";
        //tao doi tuong sinh vien thu 1 va cap phat bo nho cho no
        Student sv1 = new Student();
        sv1.id = 1000;
        sv1.name= "Ricaro Milos";
        sv1.yob=2000;
        sv1.gender=true;
        
        //tao doi tuong sinh vien thu 2 va cap phat bo nho cho no
        Student sv2 = new Student();
        sv2.id = 1001;
        sv2.name= "Nude Tiger";
        sv2.yob=2002;
        sv2.gender=false;
        
        //in ra thong tin cua cac sinh vien
        System.out.printf("id=%d, name=%s, batch=%s, year of birth:%d \n",
                sv1.id, sv1.name, Student.batch, sv1.yob);
        
        //in ra thong tin cua cac sinh vien 2
        System.out.printf("id=%d, name=%s, batch=%s, year of birth:%d\n",
                sv2.id, sv2.name, Student.batch, sv2.yob);
        
        //in ra gia tri cua doi tuong sv1 va sv2
        System.out.println("\n=============\n");
        System.out.println(sv1);
        System.out.println(sv2);
        
        
    }
}
