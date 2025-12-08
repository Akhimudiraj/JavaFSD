// public class refer {
    
// }

// package oops;

// import java.util.Scanner;
// class Employee{
//   Scanner sc = new Scanner(System.in);
//   int id;
//   String name;
//   int age;
//   Employee(){
//     System.out.println("====================");
//     System.out.print("Enter ID : ");
//     this.id = sc.nextInt();
//     System.out.print("Enter name : ");
//     this.name = sc.next();
//     System.out.print("Enter age : ");
//     this.age = sc.nextInt();
//   }
//   void display() {
//     System.out.println("ID : "+ this.id);
//     System.out.println("Name : " + this.name);
//     System.out.println("Age : " + this.age);
//   }
// }
// class Developers extends Employee{
//   int salary = 80000;
//   String designation = "Developer";
//   void display() {
//     System.out.println("====================");
//     super.display();
//     System.out.println("Salary: " + this.salary);
//     System.out.println("Designation : " + this.designation);
//   }
//   void raiseSalary() {
//     this.salary = this.salary + 15000;
//   }
// }
// class Testers extends Employee{
//   int salary = 60000;
//   String designation = "Tester";
//   void display() {
//     System.out.println("====================");
//     super.display();
//     System.out.println("Salary: " + this.salary);
//     System.out.println("Designation : " + this.designation);
//   }
//   void raiseSalary() {
//     this.salary = this.salary + 10000;
//   }
// }
// class Manager extends Employee{
//   int salary = 95000;
//   String designation = "Manager";
//   void display() {
//     System.out.println("====================");
//     super.display();
//     System.out.println("Salary: " + this.salary);
//     System.out.println("Designation : " + this.designation);
//   }
//   void raiseSalary() {
//     this.salary = this.salary + 20000;
//   }
// }
// class Clerk extends Employee{
//   int salary = 30000;
//   String designation = "Clerk";
//   void display() {
//     System.out.println("====================");
//     super.display();
//     System.out.println("Salary: " + this.salary);
//     System.out.println("Designation : " + this.designation);
//   }
//   void raiseSalary() {
//     this.salary = this.salary + 5000;
//   }
// }
// public class Demo {
//   public static void main(String args[]) {
//     Developers dev = null;
//     Testers test = null;
//     Manager manager = null;
//     Clerk clerk = null;
//     Scanner sc = new Scanner(System.in);
//     int ch1 = 0;
//     do {
//       System.out.println("============");
//       System.out.println("Main Menu");
//       System.out.println("1) Create");
//       System.out.println("2) Display");
//       System.out.println("3) Raise Salary");
//       System.out.println("4) Exit");
//       System.out.print("Enter your choice: ");
//       ch1 = sc.nextInt();
//       if (ch1==1) {
//         int ch2 = 0;
//         do {
//           System.out.println("=====================");
//           System.out.println("Create Menu");
//           System.out.println("1) Developer");
//           System.out.println("2) Tester");
//           System.out.println("3) Manager");
//           System.out.println("4) Clerk");
//           System.out.println("5) Exit");
//           System.out.print("Enter your choice: ");
//           ch2 = sc.nextInt();
//           if (ch2==1) {
//             if (dev!=null) {
//               System.out.println("====================");
//               System.out.println("Already created an developer record");
//             }else {
//               dev = new Developers();
//             }
//           }else if (ch2==2) {
//             if(test!=null) {
//               System.out.println("====================");
//               System.out.println("Already created a tester record");
//             }else {
//               test = new Testers();
//             }
//           }else if (ch2==3) {
//             if(manager!=null) {
//               System.out.println("====================");
//               System.out.println("Already created a manager record");
//             }else {
//               manager = new Manager();
//             }
//           }else if(ch2==4) {
//             if (clerk!=null) {
//               System.out.println("====================");
//               System.out.println("Already created a clerk record");
//             }else {
//               clerk = new Clerk();
//             }
//           }
//         }while(ch2!=5);
//       }else if (ch1==2) {
//         int ch2 = 0;
//         do {
//           System.out.println("=====================");
//           System.out.println("Display Menu");
//           System.out.println("1) Developer Details");
//           System.out.println("2) Tester Details");
//           System.out.println("3) Manager Details");
//           System.out.println("4) Clerk Details");
//           System.out.println("5) Exit");
//           System.out.print("Enter your choice: ");
//           ch2 = sc.nextInt();
//           if (ch2==1) {
//             if (dev!=null) {
//               dev.display();
//             }else {
//               System.out.println("====================");
//               System.out.println("No developer record found.");
//             }
//           }else if (ch2==2) {
//             if (test!=null) {
//               test.display();
//             }else {
//               System.out.println("====================");
//               System.out.println("No tester record found.");
//             }
//           }else if (ch2==3) {
//             if (manager!=null) {
//               manager.display();
//             }else {
//               System.out.println("====================");
//               System.out.println("No manager record found.");
//             }
//           }else if (ch2==4) {
//             if(clerk!=null) {
//               clerk.display();
//             }else {
//               System.out.println("====================");
//               System.out.println("No clerk record found.");
//             }
//           }
//         }while(ch2!=5);
//       }else if (ch1==3) {
//         if (dev!=null) {
//           dev.raiseSalary();
//           System.out.println("====================");
//           System.out.println("Developer salary raised");
//         }
//         if (test!=null) {
//           test.raiseSalary();
//           System.out.println("====================");
//           System.out.println("Tester salary raised");
//         }
//         if (manager!=null) {
//           manager.raiseSalary();
//           System.out.println("====================");
//           System.out.println("Manager salary raised");
//         }
//         if(clerk!=null) {
//           clerk.raiseSalary();
//           System.out.println("====================");
//           System.out.println("Clerk salary raised");
//         }
//       }
//     }while(ch1!=4);
//     System.out.println("====================");
//     System.out.println("Thank you");
//   }
// }
 