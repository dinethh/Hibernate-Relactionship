package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author:Dineth Panditha
 * Date  :3/3/2023
 * Time  :2:18 PM
 * Name  :Hibernate
 */
@Entity
public class Student {
    @Id
    private String sID;
    private String name;

    public Student() {
    }

    public Student(String sID, String name) {
        this.sID = sID;
        this.name = name;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sID='" + sID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
