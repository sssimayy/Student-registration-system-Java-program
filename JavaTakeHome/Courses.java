package JavaTakeHome;

import java.util.ArrayList;

/**
 * Created by Simay on 13.4.2019.
 */
public class Courses {

    private String courseName;
    private int courseCode;
    private int semester;
    ArrayList<Students> studentsArrayList=new ArrayList<>();

    public Courses(String _courseName, int _courseCode, int _semester){
        this.courseName=_courseName;
        this.courseCode=_courseCode;
        this.semester=_semester;

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void registerCourse(){


    }


    public void addStudent(Students students){
        if (studentsArrayList.size()<30){
           /* if (courseCode/100 > 1 && courseCode/100<4 && students instanceof RegularStudents){
                System.out.println("Student is added");
                studentsArrayList.add(students);
            }
            else if (courseCode/100 == 5 && students instanceof GraduateStudents) {
                System.out.println("Student is added");
                studentsArrayList.add(students);
            }
            else if (courseCode/100 == 7 && students instanceof SpecialStudents) {
                System.out.println("Student is added");
                studentsArrayList.add(students);
            }*/
            System.out.println("Student is added");
            studentsArrayList.add(students);

        }else System.out.println("Capacity is full");

    }

    public void printCourseInfo(){

        System.out.println("Course Name:"+courseName+"Course Code:"+courseCode+"Course Semester:"+semester);
    }




}
