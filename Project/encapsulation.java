class emp{
    //hide the data members in single class : encapsulation

    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        emp e= new emp();
        e.setId(100);
        e.setName("Harish");
        System.out.println(e.getId());
        System.out.println(e.getName());
    }
    
}
