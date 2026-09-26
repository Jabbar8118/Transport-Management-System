
package transport.management.system;


public class Driver extends Person{
    double salary;
public Driver(String name, int age , int id , String gender, double salary){
    super(name,age , id , gender);
     setSalary(salary);
    
}
    

    public void setSalary(double salary) {
        this.salary = salary;
    }

   

    public double getSalary() {
       return salary;
    }
    public void travel(){
      System.out.println(getName()+" is driving the vehicle");  
             
    }
}


