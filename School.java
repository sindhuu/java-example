class Person
{
String FirstName;
String LastName;

Person(String fname,String lname)
{
FirstName=fname;
LastName=lname;
 }
void display()
{
System.out.println("Firstname:" +FirstName);
System.out.println("Lastname:" +LastName);
}
}

class Student extends Person{
int id;
int rollno;
 
Student(String fname, String lname, int i, int r)
{
super(fname,lname);
id=i;
rollno=r;
}
void display()
{
super.display();
System.out.println("id:" +id);
System.out.println("roll no:" +rollno);
}
}

public class School{
public static void main(String args[]){
Student s=new Student("sindhu","shamily",122,50);
s.display();
}
}







