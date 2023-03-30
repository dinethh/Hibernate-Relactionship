package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:Dineth Panditha
 * Date  :3/3/2023
 * Time  :3:19 PM
 * Name  :Hibernate
 */
@Entity
public class Owner {
    @Id
    private String oID;
    private  String oName;

    @OneToMany(mappedBy = "owner")
    private List<Pet> petList=new ArrayList<>();

    public Owner() {
    }

    public Owner(String oID, String oName, List<Pet> petList) {
        this.oID = oID;
        this.oName = oName;
        this.petList = petList;
    }

    public String getoID() {
        return oID;
    }

    public void setoID(String oID) {
        this.oID = oID;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "oID='" + oID + '\'' +
                ", oName='" + oName + '\'' +
                ", petList=" + petList +
                '}';
    }
}
