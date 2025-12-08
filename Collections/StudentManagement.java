/*
 *  1. Student Management System
 Concepts: Concepts: ArrayList, Collections.sort, Comparator
 • Student – id, name, age, marks
 • StudentService – add, remove, search, sort students
 • StudentApp – main class for user interaction
 */



import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    int age;
    double marks;

    Student() {
        System.out.println("Enter id");
        id = sc.nextInt();
        sc.nextLine();
        

        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter age");
        age = sc.nextInt();

        System.out.println("Enter marks");
        marks = sc.nextDouble();
    }

    void Studentdisplay() {
        System.out.println("================");
        System.out.println("Student id " + id);
        System.out.println("Student name " + name);
        System.out.println("Student age " + age);
        System.out.println("Student marks " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int ch1, ch2, ch3 = 0;

        do {
            System.out.println("1.) ADD");
            System.out.println("2.) Remove");
            System.out.println("3.) Search");
            System.out.println("4.) Sort");
            System.out.println("5.) Exit");
            ch1 = sc.nextInt();

            if (ch1 == 1) {
                al.add(new Student());
                System.out.println("Student added successfully");
            }

            if (ch1 == 2) {
                System.out.println("Enter id to remove");
                int id = sc.nextInt();
                for (int i = 0; i < al.size(); i++) {
                    if (al.get(i).id == id) {
                        al.remove(i);
                        System.out.println("Student removed successfully");
                        break;
                      
                    }else{
                        System.out.println(" student not found");
                    }
                }
            
                   
            }

            if (ch1 == 3) {
                System.out.println("Enter id to search");
                int id = sc.nextInt();
                for (Student s : al) {
                    if (s.id == id) {
                        s.Studentdisplay();
                        System.out.println("Student displayed successfully");
                        break;
                     
                    }else{
                        System.out.println("Student not found");
                    }
                }
               
                    
            }

            if (ch1 == 4) {
                System.out.println("Students sorted by marks:");
                al.sort(new Comparator<Student>() {
                    public int compare(Student s1, Student s2){
                        return Double.compare(s2.marks, s1.marks);  
                    }
                    
                });
                for(Student s:al){
                    s.Studentdisplay();
                }
                
            }

            if(ch1==5){
                System.out.println("Thank uuuuu");
            }

        } while (ch1 != 5);
    }
}
