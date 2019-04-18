package JavaTakeHome;

import com.company.Student;

/**
 * Created by Simay on 13.4.2019.
 */
public class GraduateStudents extends Students {

    GraduateStudents(String name, String sname, int id, double cgpa) {
        super.setName(name);
        super.setSname(sname);
        super.setId(id);
        super.setCgpa(cgpa);
    }

    @Override
    public void display() {
        System.out.println("Graduate Student:");
        super.display();
    }
}
