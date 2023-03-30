package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:Dineth Panditha
 * Date  :3/3/2023
 * Time  :4:22 PM
 * Name  :Hibernate
 */
@Entity
public class Lecture {
    @Id
    private String lecID;
    private String lecName;

    @ManyToMany(mappedBy = "lectureList")
    private List<Subject> subjectList = new ArrayList<>();

    public Lecture() {
    }

    public Lecture(String lecID, String lecName, List<Subject> subjectList) {
        this.lecID = lecID;
        this.lecName = lecName;
        this.subjectList = subjectList;
    }

    public String getLecID() {
        return lecID;
    }

    public void setLecID(String lecID) {
        this.lecID = lecID;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lecID='" + lecID + '\'' +
                ", lecName='" + lecName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
