package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Author:Dineth Panditha
 * Date  :3/3/2023
 * Time  :2:18 PM
 * Name  :Hibernate
 */
@Entity
public class Laptop {
    @Id
    private String lID;
    private String description;

    @OneToOne
    private Student student;


    public Laptop() {
    }

    public Laptop(String lID, String description, Student student) {
        this.lID = lID;
        this.description = description;
        this.student = student;
    }

    public String getlID() {
        return lID;
    }

    public void setlID(String lID) {
        this.lID = lID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lID='" + lID + '\'' +
                ", description='" + description + '\'' +
                ", student=" + student +
                '}';
    }
}
