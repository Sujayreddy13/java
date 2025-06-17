
class Student {
    String name;
    int rollNo;
    String department;

   
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Department : " + department);
        System.out.println();
    }

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Man";
        s1.rollNo = 1203;
        s1.department = "CSE";

        
        Student s2 = new Student();
        s2.name = "Ravi";
        s2.rollNo = 1204;
        s2.department = "ECE";

     
        s1.displayDetails();
        s2.displayDetails();
    }
}
