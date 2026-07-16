class employees {
    private String name;
    private float salary;
    private int id;
    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    public void setter(String name,float salary,int id){
        this.name=name;
        this.salary=salary;
        this.id=id;
    }
}
class test{
    public static void main(String[] args) {
        employees e=new employees();
        System.out.println(e.getName());
        e.setter("BINOD", 25000, 9);

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("ID: " + e.getId());
    }
}

