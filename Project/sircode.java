public class sircode {
    
}
/*
 * pastebin
Paste from thaneshwara 24 October 2025 4:32 +0000
This paste expires on 2026-10-25.

Syntax highlighting: text

View raw Toggle wrap Copy to clipboard
package comA;

import java.util.Scanner;
class Emp
{
	 Scanner sc = new Scanner(System.in);
	 int id;
	    String name;
	    int age;
	     int salary ;
	    String desig;
	Emp(){
		System.out.print("ID : ");  id = sc.nextInt();
        System.out.print("Name : ");  name = sc.next();
        System.out.print("Age : ");  age = sc.nextInt();
	}
}
class Developer extends Emp
{
    public Developer() {
    	  salary = 80000;
 	     desig="Developer"; 
    }
    void display() {
        System.out.println("developer data");
        System.out.println("ID : "+ id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+ age);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+desig);
    }
    void raiseSalary() {
    	salary= salary + 15000;
    }
}
class Tester extends Emp
{
	public Tester() {
  	  salary = 50000;
	     desig="Tester"; 
	}
    void display() {
        System.out.println("tester data");
        System.out.println("ID : "+ id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+ age);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+desig);
    }
    void raiseSalary() {
    	salary= salary + 10000;
    }
}
class Manager extends Emp
{

	public Manager() {
	  	  salary = 80000;
		     desig="Manager"; 
		}
    void display() {
        System.out.println("ID : "+ id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+ age);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+desig);
    }
    void raiseSalary() {
    	salary= salary + 20000;
    }
 
}
class clerk extends Emp
{
	public clerk() {
	  	  salary = 20000;
		     desig="clerk"; 
		}
    void display() {
        System.out.println("clerk data");
        System.out.println("ID : "+ id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+ age);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+desig);
    }
    void raiseSalary() {
    	salary= salary + 5000;
    }
}
public class Project {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ch1,ch2,ch3,ch4=0;
        Developer d=null;
        Tester t=null;
        Manager m=null;
        clerk c= null;
        do{
            System.out.println("1)create");
            System.out.println("2)Display");
            System.out.println("3)Raise Salary ");
            System.out.println("4)exit");
            ch1=sc.nextInt();
 
            if(ch1==1){
                do {
            System.out.println(">>>>>>>> 1) Developer");
            System.out.println(">>>>>>>> 2) Tester");
            System.out.println(">>>>>>>> 3) Manager");
            System.out.println(">>>>>>>> 4)clerk");
            System.out.println(">>>>>>>>  5)Exit");
            ch2=sc.nextInt();
 
            if(ch2==1){
                d= new Developer();
            }
            if(ch2==2){
                t=new Tester();
            }
            if(ch2==3){
                m=new Manager();
            }
            if(ch2==4){
                c=new clerk();
            }
           
        } while (ch2!=5);  
 
            }
       
 
       
        if(ch1==2){
        do{
            System.out.println("which one to display ?");
            System.out.println(">>>>>>>> 1) Developer");
            System.out.println(">>>>>>>> 2) Tester");
            System.out.println(">>>>>>>> 3) Manager");
            System.out.println(">>>>>>>> 4)clerk");
            System.out.println(">>>>>>>>  5)Exit");
            ch3=sc.nextInt();
            if(ch3==1){
                if(d!=null){
                    d.display();
                }else{
                    System.out.println("--------------(Developer Not Created)-------------------------");
                }
               
            }
            if(ch3==2){
                if(t!=null){
                    t.display();
                }else{
                    System.out.println("-------------(Tester Not Created)------------------");
                }
            }
            if(ch3==3){
                if(m!=null){
                    m.display();
                }else{
                    System.out.println("---------------(Manager Not Created)------------");
                }
            }
            if(ch3==4){
                if(c!=null){
                    c.display();
                }else{
                    System.out.println("--------------(clerk Not Created)-----------");
                }
            }
        }while(ch3!=5);
    }
          
    if(ch1==3){
    	 do{
             System.out.println("which one to display ?");
             System.out.println(">>>>>>>> 1) Developer");
             System.out.println(">>>>>>>> 2) Tester");
             System.out.println(">>>>>>>> 3) Manager");
             System.out.println(">>>>>>>> 4)clerk");
             System.out.println(">>>>>>>>  5)Exit");
             ch4=sc.nextInt();
             if(ch4==1){
                 if(d!=null){
                     d.raiseSalary();
                     System.out.println("Developer salary Raised ....!");
                 }else{
                     System.out.println("--------------(Developer Not Created)-------------------------");
                 }
                
             }
             if(ch4==2){
                 if(t!=null){
                     t.raiseSalary();
                     System.out.println("Tester salary Raised ....!");
                 }else{
                     System.out.println("-------------(Tester Not Created)------------------");
                 }
             }
             if(ch4==3){
                 if(m!=null){
                     m.raiseSalary();
                     System.out.println("Manager salary Raised ....!");
                 }else{
                     System.out.println("---------------(Manager Not Created)------------");
                 }
             }
             if(ch4==4){
                 if(c!=null){
                     c.raiseSalary();
                     System.out.println("CLERK salary Raised ....!");
                 }else{
                     System.out.println("--------------(clerk Not Created)-----------");
                 }
             }
         }while(ch4!=5);
    }
    if(ch1==4){
    	System.out.println("Thank  you ");
           System.exit(0);
    } 
 
    }while(ch1!=4);
   
 
}
}
New paste
Please log in to create a paste.

Log in

© 2025 Canonical Ltd. Ubuntu and Canonical are registered trademarks of Canonical Ltd.
Legal info
Go to the top of the page
 */
// --------------------------------when to use this, super-----------------------------------------------------------------//

 /*
  * class parent{
  int a =1000;
  }

  class child extends parent{
  
  int a=100;
  void display(int a){
  System.out.println(a); //local variable
  System.out.println(this.a); //current class
  System.out.println(super.a); //parent class
  
  }
  }

  class main{
  public static void main(String [] args){
  child c= new child();
  c.display(10);
  }}
  */


// polymorphism

/*
 * 
 * 2 class Emp

3

//method, is only one but diffeenent behiviour ploymophisn

// 2 compile time

50 Demo00300ps

ME System Library 5

6/1

com

// over loding

1) constructore over lodibg

com/t

8

7/1

2) method over loding

// run time

come

9

// over riding

comc

16

// method over rdibng

// constructor over riding this will not suppoert

Demoljava

PolyDemo

11

12 Emp()()

13

Emp(int id, String name, int age, String desig, int Salary, String pan ){

14

//HR

15 }

16

Emp(int id, String name, String project, String location){

18

17 System.out.println("Manager Prospective ");

19-void draw(){

20 System.out.println("you can draw what ever you want ");

21

} 22 void draw(int n){

23 System.out.println("Area of Cicle: "+ (2*2.5*г г));

24 }

25 void draw(int 1,int b){

26 System.out.println("Rectazngle:"+ (1 *b));

27 }

28}

29 public class Demol {

30 public static void main(String[] args) {

31 Empe = new Emp();

32 e.draw();

33.draw(10);

34 e.draw(150, 20);

35 Emp e1= new Emp(100, "Thanesh", "FB", "BANGLORE");
 */
































