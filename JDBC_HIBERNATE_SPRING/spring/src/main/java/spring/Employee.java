package spring;

public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;
    private String designation;
    
    //2methods one with geter seter one with constructor

    // Getters and Setters
  //  public int getId() { return id; }
  //  public void setId(int id) { this.id = id; }

  //  public String getName() { return name; }
   // public void setName(String name) { this.name = name; }

    //public int getAge() { return age; }
   // public void setAge(int age) { this.age = age; }

//    public int getSalary() { return salary; }
//    public void setSalary(int salary) { this.salary = salary; }
//
//    public String getDesignation() { return designation; }
//    public void setDesignation(String designation) { this.designation = designation; }

    
    // 2nd method constructor
    
    public Employee(int id,String name,int age,int salary,String designation) {
    	this.id=id;
    	this.name=name;
    	this.age=age;
    	this.salary=salary;
    	this.designation=designation;
    }
    
    // Display method
    public void display() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }

    // toString method
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age +
               ", salary=" + salary + ", designation=" + designation + "]";
    }
}
