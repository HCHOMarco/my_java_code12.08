/*
2、由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个集合中，要求集合中的元素按照年龄大小正序排序；
最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行。
 */

//import java.util.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Test_EX {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<Student>();
        Scanner kb = new Scanner(System.in);
        String name;
        String BROKE = "exit";
        int id,age;
        while(true){
            name=kb.next();
            if(name.equals(BROKE))break;
            id=kb.nextInt();
            age=kb.nextInt();
            students.add(new Student(name,id,age));
        }

        Iterator<Student> it = students.iterator();
        while(it.hasNext()) {
            Student p = (Student)it.next();
            System.out.println(p.getName());
        }
    }
}


