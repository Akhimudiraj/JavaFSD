import java.util.*;

class emp {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    int age;
    int salary;
    String design;

    emp() {
        System.out.println("Id");
        id = sc.nextInt();

        System.out.println("name");
        name = sc.next();

        System.out.println("age");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("=================");
        System.out.println("id " + id);
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("salary " + salary);
        System.out.println("designation " + design);
    }

    void raiseSalary() {
        // will be overridden in subclasses
    }
}

class developer extends emp {
    public developer() {
        salary = 80000;
        design = "developer";
    }

    void raiseSalary() {
        salary = salary + 15000;
    }
}

class manager extends emp {
    public manager() {
        salary = 100000;
        design = "manager";
    }

    void raiseSalary() {
        salary = salary + 20000;
    }
}

class clerk extends emp {
    public clerk() {
        salary = 50000;
        design = "clerk";
    }

    void raiseSalary() {
        salary = salary + 5000;
    }
}

class tester extends emp {
    public tester() {
        salary = 50000;
        design = "tester";
    }

    void raiseSalary() {
        salary = salary + 10000;
    }
}

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch1, ch2, ch3, ch4 = 0;

        ArrayList<emp> emp = new ArrayList<emp>();

        do {
            System.out.println("1.Create");
            System.out.println("2.Display");
            System.out.println("3.Raise Salary");
            System.out.println("4.Exit");
            ch1 = sc.nextInt();

                //create choice
            if (ch1 == 1) {
                do {
                    System.out.println("   1.Developer");
                    System.out.println("   2.Tester");
                    System.out.println("   3.Manager");
                    System.out.println("   4.Clerk");
                    System.out.println("   5.Exit");
                    ch2 = sc.nextInt();

                    if (ch2 == 1) {
                        emp.add(new developer());
                    }
                    if (ch2 == 2) {
                        emp.add(new tester());
                    }
                    if (ch2 == 3) {
                        emp.add(new manager());
                    }
                    if (ch2 == 4) {
                        emp.add(new clerk());
                    }

                } while (ch2 != 5);
            }
            
            if (ch1 == 2) {
                do {
                    System.out.println("1.Developer");
                    System.out.println("2.Tester");
                    System.out.println("3.Manager");
                    System.out.println("4.Clerk");
                    System.out.println("5.Exit");
                    ch3 = sc.nextInt();

                    Iterator i = emp.iterator();
                    while (i.hasNext()) {
                        emp e = (emp) i.next();

                        if (ch3 == 1 ) {
                            e.display();
                        }
                        if (ch3 == 2 ) {
                            e.display();
                        }
                        if (ch3 == 3 ) {
                            e.display();
                        }
                        if (ch3 == 4)  {
                            e.display();
                        }
                    }
                } while (ch3 != 5);
            }

            if (ch1 == 3) {
                do {
                    System.out.println("1.Developer");
                    System.out.println("2.Tester");
                    System.out.println("3.Manager");
                    System.out.println("4.Clerk");
                    System.out.println("5.Exit");
                    ch4 = sc.nextInt();

                    Iterator i = emp.iterator();
                    while (i.hasNext()) {
                        emp e = (emp) i.next();

                        if (ch4 == 1 ) {
                            e.raiseSalary();
                           
                        }
                        if (ch4 == 2 ) {
                            e.raiseSalary();
                           
                        }
                        if (ch4 == 3 ) {
                            e.raiseSalary();
                          
                        }
                        if (ch4 == 4 ) {
                            e.raiseSalary();
                            
                        }
                    }
                } while (ch4 != 5);
            }

            if (ch1 == 4) {
                System.out.println("Thank you!");
            }

        } while (ch1 != 4);
    }
}
