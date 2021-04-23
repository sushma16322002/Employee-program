public class Employee{
    public void name(String name1,String name2,String name3){
    System.out.println(name1+" "+name2+" "+name3);   
    }
    public void yearOfJoining(int year1,int year2,int year3){
    System.out.println(year1+" "+year2+" "+year3); 
    }
    public void address(String addr1,String addr2,String addr3){
    System.out.println(addr1+" "+addr2+" "+addr3);    
    }
    public static void main(String args[]){
    System.out.println("Name " + " Year of Joining" + " Address ");
    Employee obj=new Employee();
    obj.name("Robert wallstreet","sam wallstreet","john wallstreet");
    obj.yearOfJoining(1994,2000,1999);
    obj.address("64C-","68D-","26B-");
    }
}
