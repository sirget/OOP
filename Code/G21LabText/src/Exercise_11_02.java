
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 61010216
 */
public class Exercise_11_02 {

    public static void main(String[] args) {
        Person person = new Person("namePer", "addressPer", "0111111111", "Person@hotmail.com");
        Student student = new Student("nameStu", "addressStu", "0111111111", "Student@hotmail.com", 1);
        Employee employee = new Employee("nameEmp", "addressEmp", "0111111111", "Employee@hotmail.com", "officeEmp", 800000);
        Faculty faculty = new Faculty("nameFac", "addressFac", "0111111111", "Faculty@hotmail.com", 40000, "officehoursFac", "rankFac");
        Staff staff = new Staff("nameStaff", "addressStaff", "0111111111", "Staff@hotmail.com", "officeStaff", 300000, "title");
        System.out.println("<Person> " + person.toString());
        System.out.println();
        System.out.println("<Student> " + student.toString());
        System.out.println();
        System.out.println("<Employee> " + employee.toString());
        System.out.println();
        System.out.println("<Faculty> " + faculty.toString());
        System.out.println();
        System.out.println("<Staff> " + staff.toString());

        File file = new File("TextToString.txt");
        //System.out.println(file.exists());
        try {
            PrintWriter out = new PrintWriter(file);
            out.print("<Person> " + person.toString() + "\n\n<Student> " + student.toString()
                    + "\n\n<Employee> " + employee.toString() + "\n\n<Faculty> " + faculty.toString()
                    + "\n\n<Staff> " + staff.toString());
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

}
