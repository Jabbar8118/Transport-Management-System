
package transport.management.system;


public abstract class Person {

   
   private String name;
   private int age;
   private int id;
   private String gender;

    public Person(String name , int age , int id , String gender){
        setName(name);
         setId( id);
         setAge(age);
         setGender(gender);
    }
    abstract public void travel();
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
     public int getId(){
        return id;
    }
      public int getAge(){
        return age;
    }
       public String getGender(){
        return gender;
    }

}

    

