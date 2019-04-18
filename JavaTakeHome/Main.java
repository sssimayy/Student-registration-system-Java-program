package JavaTakeHome;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Simay on 13.4.2019.
 */

public class Main {

    public static void main(String ...args){
        Students student;

        ArrayList<Courses> coursesArrayList=new ArrayList<>();

        int ans;
        do {
        System.out.println("1- Create new course:");
        System.out.println("2- Register user to the course:");
        System.out.println("3- Display all the registered students' information to a course");
        System.out.println("4- Quit");

        Scanner scanner= new Scanner(System.in);
        ans=scanner.nextInt();


    if (ans == 1) {
        ArrayList<Courses> returningList = addCourse(scanner, coursesArrayList);
        if (returningList != null) {
            coursesArrayList = returningList;
        }

    } else if (ans == 2) {
        System.out.println("Enter course code:");
        printCourses(coursesArrayList);
        int cCode = scanner.nextInt();
        Courses desiredCourse = findCourse(cCode, coursesArrayList);
        if (desiredCourse == null)
            System.out.println("There is no such a course...");
        else {
                if (cCode/100==5){
                   student=new GraduateStudents(" Ali"," Kaya",123,1.89);
                    addStudentToCourse(student, desiredCourse);

                }
                else if (cCode/100==7){
                    student= new SpecialStudents(" Ayşe"," Demir",354,3.80);
                    addStudentToCourse(student,desiredCourse);
                }
                else if (cCode/100 <=4 && cCode/100 >=1){
                    student= new RegularStudents(" Ahmet"," Yılmaz",124,2.82);
                    addStudentToCourse(student,desiredCourse);
                }
            System.out.println(desiredCourse.getCourseName());
        }

    } else if (ans==3){
       
        System.out.println("Enter Course code to list students:");
        int a=scanner.nextInt();

        Courses desiredCourse = findCourse(a, coursesArrayList);
        System.out.println(desiredCourse.studentsArrayList.size());
        for (Students s:desiredCourse.studentsArrayList ) {
            //System.out.println("hi");
            s.display();

        }

    }


}while (ans!=4);
        System.out.println("Exit..");
    }

    public static   ArrayList<Courses> addCourse(Scanner scanner, ArrayList<Courses> coursesArrayList) {

        if (coursesArrayList.size()<10) {
            System.out.println("Enter course name:");
            String courseName = scanner.next();
            System.out.println("Course name: "+courseName.toString());
            System.out.println("Enter course code:");
            int courseCode = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Course code: "+courseCode);
            System.out.println("Enter course semester");
            int courseSemester = scanner.nextInt();
            System.out.println("Course semester: "+courseSemester);

            coursesArrayList.add(new Courses(courseName,courseCode,courseSemester));
            System.out.println(courseName+" is added.");

        }
        else System.out.println("Course capacity is full!");

        return coursesArrayList;
    }

    public static Courses findCourse(int code, ArrayList<Courses> coursesArrayList){

        for (Courses courses:coursesArrayList){
            if (courses.getCourseCode()== code)
                return courses;

        }
            return null;

    }
    public static void  addStudentToCourse(Students students,Courses courses){

        courses.addStudent(students);

    }
    public static void printCourses(ArrayList<Courses> coursesArrayList){
        for (Courses courses:coursesArrayList){
            courses.printCourseInfo();
        }

    }
}
