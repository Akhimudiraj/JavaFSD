import java.util.*;

class employee{
    String name;
    int id;
    int age;
    employee(String name, int id, int age){
        this.name=name;
        this.id=id;
        this.age=age;
        
    }
    void display(){
        System.out.println("Name "+name);
        System.out.println("id "+id);
        System.out.println("age "+age);
    }

}

class clerk extends employee{
    clerk(String name,int id,int age){
        super(name, id, age);
    }
}

class developer extends employee{
    developer(String name,int id,int age){
        super(name, id, age);
    }

}


class InProject{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ch1,ch2,ch3=0;
        clerk c= null;
        developer d=null;
        do{
            System.out.println("1.) create ");
            System.out.println("2.)Display");
            System.out.println("3.)exit");
            ch1=sc.nextInt();
            sc.nextLine(); 
            if(ch1==1){
                do{
                    System.out.println("1.) create clerk");
                    System.out.println("2.)create developer");
                    System.out.println("3.)exit");
                    ch2=sc.nextInt();
                    sc.nextLine(); 
                    if(ch2==1){
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter age: ");
                        int age = sc.nextInt();
                        c = new clerk(name, id, age);
                    }else if(ch2==2){
                         System.out.print("Enter name: ");
                        sc.nextLine(); 
                        String name = sc.nextLine();
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter age: ");
                        int age = sc.nextInt();
                        d = new developer(name, id, age);
                    }else if(ch2==3){
                        System.out.println("exit");
                    }

                    
                }while(ch2!=3);
                
            }
            else if(ch1==2){
                do{
                    System.out.println("1. Display Clerk");
                    System.out.println("2. Display Developer");
                    System.out.println("3.) exit");
                    ch3=sc.nextInt();

                      if (ch3 == 1) {
                        if (c != null) {
                            System.out.println("Clerk Details:");
                            c.display();
                        } else {
                            System.out.println("clerk not created ");
                        }
                    } else if(ch3==2){
                            if(d!=null){
                                System.out.println("developer details");
                                d.display();
                            }else{
                                System.out.println("developer not created");
                            }
                    } else if(ch3==3){
                                System.out.println("exit");
                    }
                }while(ch3!=3);
        }
        else if(ch1==3){
            System.out.println("Thank u");
        }
        
    }while(ch1!=3);


}
    }
