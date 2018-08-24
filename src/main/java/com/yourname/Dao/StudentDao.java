package com.yourname.Dao;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.yourname.Entity.Student;
import org.springframework.stereotype.Repository;

@Repository

public class StudentDao {
    private static Map<Integer,Student> students;
    static
    {
        students=new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Rahul", "ComputerScience"));
                put(2, new Student(2, "Amit", "Information Technology"));
                put(3, new Student(3, "Harshit", "Information Technology"));
                put(4, new Student(4, "Asmit", "Electronic"));
                put(5, new Student(5, "Akshita", "Electronic"));
                put(6, new Student(6, "Aron", "Electronic"));
                put(7, new Student(7, "Akhil", "Electronic"));
            }
        };

    }
    public Collection<Student>getAllStudents()
    {
        return this.students.values();
    }

    public Student getStudentById(int id)
    {
        return this.students.get(id);
    }

    public void removeStudentById(int id)
    {
        this.students.remove(id);
    }

    public void updateStudentById(Student student)
    {
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(),student);
    }

    public void insertStudentToDB(Student student)
    {
        this.students.put(student.getId(),student);

    }

}
