class Student{
    int roll;
    String name;
    int marks;

    public void add_values (int r, String n, int m){
        roll=r;
        name=n;
        marks=m;
        if (marks<33)
            System.out.println(name+" has been failed");
    }
    

}

public class array_objects {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        s1.add_values(1,"Ajhar",90);
        s2.add_values(2,"Noman",95);
        s3.add_values(3,"Anoy",23);

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (int i=0; i< students.length;i++){
            System.out.println(students[i].name+" "+students[i].roll +" " +students[i].marks);
        }

    }
}
