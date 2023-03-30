package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:Dineth Panditha
 * Date  :3/3/2023
 * Time  :4:21 PM
 * Name  :Hibernate
 */
@Entity
public class Subject {
    @Id
    private String subID;
    private String subName;

    @ManyToMany
    private List<Lecture> lectureList = new ArrayList<>();

    public Subject() {
    }

    public Subject(String subID, String subName, List<Lecture> lectureList) {
        this.subID = subID;
        this.subName = subName;
        this.lectureList = lectureList;
    }

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public List<Lecture> getLectureList() {
        return lectureList;
    }

    public void setLectureList(List<Lecture> lectureList) {
        this.lectureList = lectureList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subID='" + subID + '\'' +
                ", subName='" + subName + '\'' +
                ", lectureList=" + lectureList +
                '}';
    }
}
