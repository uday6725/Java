import java.io.*;

interface Person {
    void acceptPerson() throws IOException;
    void displayPerson();
}

interface Student {
    void acceptStudent() throws IOException;
    void displayStudent();
}

interface Graduate extends Person, Student {
    void acceptGraduate() throws IOException;
    void displayGraduate();
}

class Academics implements Graduate {
    private String name;
    private int age;
    private String address;
    private int roll;
    private String specialization;
    private int sub1, sub2, sub3, sub4;
    private int total;
    private float percentage;
    private String grade;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void acceptPerson() throws IOException {
        System.out.println("Enter Name: ");
        name = br.readLine();
        
        System.out.println("Enter the age of student:");
        age = Integer.parseInt(br.readLine()); 
        while (age <= 0) {
            System.out.println("Enter valid age:");
            age = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter Address: ");
        address = br.readLine();
    }

    public void displayPerson() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void acceptStudent() throws IOException {
        System.out.println("Enter the roll number of student:");
        roll = Integer.parseInt(br.readLine());  
        while (roll <= 0) {
            System.out.println("Enter valid roll number:");
            roll = Integer.parseInt(br.readLine());
        }
    }

    public void displayStudent() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + roll);
    }

    public void acceptGraduate() throws IOException {
        System.out.println("Enter Specialization: ");
        specialization = br.readLine();
        
        System.out.println("Enter the marks for subject 1:");
        sub1 = Integer.parseInt(br.readLine());  
        while (sub1 < 0 || sub1 > 100) {
            System.out.println("Enter valid marks:");
            sub1 = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the marks for subject 2:");
        sub2 = Integer.parseInt(br.readLine());
        while (sub2 < 0 || sub2 > 100) {
            System.out.println("Enter valid marks:");
            sub2 = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the marks for subject 3:");
        sub3 = Integer.parseInt(br.readLine());
        while (sub3 < 0 || sub3 > 100) {
            System.out.println("Enter valid marks:");
            sub3 = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the marks for subject 4:");
        sub4 = Integer.parseInt(br.readLine());
        while (sub4 < 0 || sub4 > 100) {
            System.out.println("Enter valid marks:");
            sub4 = Integer.parseInt(br.readLine());
        }

        total = sub1 + sub2 + sub3 + sub4;
        percentage = (float) total / 4;
        
        if (percentage >= 85) {
            grade = "First Class Distinction";
        } else if (percentage >= 75) {
            grade = "Distinction";
        } else if (percentage >= 35) {
            grade = "Passed";
        } else {
            grade = "Fail";
        }
    }

    public void displayGraduate() {
        System.out.println("\nGraduate Student Details:");
        System.out.println("Specialization: " + specialization);
        System.out.println("Marks - Subject 1: " + sub1);
        System.out.println("Marks - Subject 2: " + sub2);
        System.out.println("Marks - Subject 3: " + sub3);
        System.out.println("Marks - Subject 4: " + sub4);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class Assign3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of students: ");
        int num = Integer.parseInt(br.readLine());

        Academics[] students = new Academics[num];

        for (int i = 0; i < num; i++) {
            System.out.println("\nEntering details for Student " + (i + 1) + ":");
            students[i] = new Academics();
            
            students[i].acceptPerson();
            students[i].acceptStudent();
            students[i].acceptGraduate();
        }

        for (int i = 0; i < num; i++) {
            System.out.println("\nDisplaying details for Student " + (i + 1) + ":");
            students[i].displayPerson();
            students[i].displayStudent();
            students[i].displayGraduate();
        }
    }
}
