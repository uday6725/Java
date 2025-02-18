import java.io.*;

class Person {
    protected String name;
    protected int mob;
    protected String address;
    protected int age;

    public Person(String n, int m, int a, String add) {
        this.name = n;
        this.mob = m;
        this.address = add;
        this.age = a;
    }

    public final void displayPerson() {
        System.out.println("Person details:");
        System.out.println("Person name: " + name);
        System.out.println("Person age: " + age);
        System.out.println("Person mobile: " + mob);
        System.out.println("Person address: " + address);
    }
}

class Student extends Person {
    private int roll;
    private int sub1, sub2, sub3, sub4;
    private int total;
    private float percentage;

    public Student(String n, int m, int a, String add, int r) {
        super(n, m, a, add);
        this.roll = r;
    }

    void acceptMarks() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the marks for subject 1:");
        int s1 = Integer.parseInt(br.readLine());
        while (s1 < 0 || s1 > 100) {
            System.out.println("Enter valid marks:");
            s1 = Integer.parseInt(br.readLine());
        }
        sub1 = s1;

        System.out.println("Enter the marks for subject 2:");
        int s2 = Integer.parseInt(br.readLine());
        while (s2 < 0 || s2 > 100) {
            System.out.println("Enter valid marks:");
            s2 = Integer.parseInt(br.readLine());
        }
        sub2 = s2;

        System.out.println("Enter the marks for subject 3:");
        int s3 = Integer.parseInt(br.readLine());
        while (s3 < 0 || s3 > 100) {
            System.out.println("Enter valid marks:");
            s3 = Integer.parseInt(br.readLine());
        }
        sub3 = s3;

        System.out.println("Enter the marks for subject 4:");
        int s4 = Integer.parseInt(br.readLine());
        while (s4 < 0 || s4 > 100) {
            System.out.println("Enter valid marks:");
            s4 = Integer.parseInt(br.readLine());
        }
        sub4 = s4;

        total = sub1 + sub2 + sub3 + sub4;
        percentage = ((float) total / ) * 100;
    }

    public void displayStudent() {
        displayPerson();
        System.out.println("Student Roll No: " + roll);
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage);
    }
}

class UndergraduateStudent extends Student {
    private int year;

    public UndergraduateStudent(String n, int m, int a, String add, int r, int y) {
        super(n, m, a, add, r);
        this.year = y;
    }

    public void displayUndergraduate() {
        displayStudent();
        System.out.println("Year: " + year);
    }
}

class GraduateStudent extends UndergraduateStudent {
    private String specialization;

    public GraduateStudent(String n, int m, int a, String add, int r, int y, String s) {
        super(n, m, a, add, r, y);
        this.specialization = s;
    }

    public void displayGraduate() {
        displayUndergraduate();
        System.out.println("Specialization: " + specialization);
    }
}

public class Main136 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the no of students");
        int no=Integer.parseInt(br.readLine());
        
        GraduateStudent[] g=new GraduateStudent[no];
        
        for(int i=0;i<no;i++)
        {
        System.out.println("enter the details for the student"+(i+1));                                

        System.out.println("Enter the name of student:");
        String n = br.readLine();

        System.out.println("Enter the age of student:");
        int a = Integer.parseInt(br.readLine());                                                                                                                  
        while (a <= 0) {
            System.out.println("Enter valid age:");
            a = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the address of student:");
        String addr = br.readLine();

        System.out.println("Enter the roll number of student:");
        int r = Integer.parseInt(br.readLine());
        while (r <= 0) {
            System.out.println("Enter valid roll number:");
            r = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the mobile number of student:");
        int m = Integer.parseInt(br.readLine());
        while (m <= 0) {
            System.out.println("Enter valid mobile number:");
            m = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter year of study:");
        int year = Integer.parseInt(br.readLine());

        System.out.println("Enter specialization:");
        String specialization = br.readLine();

        g[i] = new GraduateStudent(n, m, a, addr, r, year, specialization);
        g[i].acceptMarks();
        
        
    }
   
    	
        for(int j=0;j<no;j++)
        {
        System.out.println("displaying"+(j+1));
         g[j].displayGraduate();
	
	}
}
}

