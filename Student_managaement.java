class Student {
    String name;
    int roll_no;
    int[] marks;
    
    
    public Student(String name, int roll_no,  int[] marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public int calculateAv(){
        int sum=0;

        for (int mark : marks) {
            sum += mark;
        }
        return (int) sum / marks.length;
    }

    public void displayinfo() {
        System.out.println("Name: " + name +""+ "RollNumber: "+ roll_no);
        System.out.println("Average Marks: " + calculateAv());
    }
}

public class Student_managaement{
    public static void main(String[] args) {
        int[] marks = {75,55,98, 81, 91};
        Student Student = new Student("Rauf :", 16, marks);
        Student.displayinfo();
        Student.calculateAv();
    }
}