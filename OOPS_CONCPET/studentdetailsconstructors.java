
import java.util.*;
class StudentData 
{
    int ID;
    String name;
    int rank;
    StudentData(int ID, String name, int rank) 
    {
        //Type your code here
        this.ID=ID;
        this.name=name;
        this.rank=rank;
    }
    void display() 
    {
        System.out.println("Roll No: "+ID);
        System.out.println("Name: "+name);
        System.out.println("Rank: "+rank);
    }
}
public class studentdetailsconstructors
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int id=sc.nextInt();
        String name=sc.next();
        int rank=sc.nextInt();
        StudentData obj = new StudentData(id,name,rank);
        obj.display();
        //Type your code here
    }
}
