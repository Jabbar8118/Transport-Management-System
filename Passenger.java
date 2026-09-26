
package transport.management.system;


public class Passenger extends Person{
    private String address;
    private double ticket;
    public Passenger(String name , int age , int id , String gender, String address, double ticket){
        super(name,age,id,gender);
        setAddress(address);
        setTicket(ticket);
      
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTicket(double ticket){
        this.ticket=ticket;
    }
        

    public String getAddress() {
        return address;
    }
    public double getTicket(){
        return ticket;
    }
    public void travel(){
      System.out.println(getName()+" is sitting and travelling");  
             
    }

    }


