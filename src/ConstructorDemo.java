public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1= new Student("karan", 1045, 8.8);
        s1.displayProfile();
        System.out.println(s1.findPercentage());

    }
    static class Student{
        String name;
        int rollNumber;
        double cgpa;

        public Student(String name, int rollNumber, double cgpa) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.cgpa = cgpa;
        }

        public void displayProfile(){
            System.out.println(rollNumber +" "+name + " "+ cgpa );
        }
        public double findPercentage(){
            double percentage= cgpa*10;
            return percentage;

        }
    }
}
