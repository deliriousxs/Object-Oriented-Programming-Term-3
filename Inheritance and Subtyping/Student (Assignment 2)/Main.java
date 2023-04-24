 class Person {

    
    String name, gender, email;
    int age;

    public Person (String name, int age, String gender, String email){
       this.name=name;
       this.age=age;
       this.gender=gender;
       this.email=email;
    }

    public void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
    }
}

class Student extends Person{

    String id, major;
    double gpa;

    public Student(String name, int age, String gender, String email, String id, String major, double gpa) {
        super(name, age, gender, email);
        this.id=id;
        this.major=major;
        this.gpa=gpa;
    }

    public void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("ID: " + id);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        }
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        Student [] objArray = new Student[2];

        objArray[0] = new Student("Aaron",18,"Male","aaron@gmail.com","1234", "BSIT", 4.00);
        objArray[1] = new Student("Gabriel",19,"Male","gabriel@gmail.com","1348", "BSCS", 4.00);
       
      for (int i=0; i < 2; i++){
        System.out.println("Student [" + (i+1)+"]");
        objArray[i].getDetails();
        System.out.println();
        }
      
    }
}
