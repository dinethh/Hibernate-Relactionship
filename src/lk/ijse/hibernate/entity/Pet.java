package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Author:Dineth Panditha
 * Date  :3/3/2023
 * Time  :3:19 PM
 * Name  :Hibernate
 */
@Entity
public class Pet {
    @Id
    private String pet_ID;
    private  String pet_name;

    @ManyToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(String pet_ID, String pet_name, Owner owner) {
        this.pet_ID = pet_ID;
        this.pet_name = pet_name;
        this.owner = owner;
    }

    public String getPet_ID() {
        return pet_ID;
    }

    public void setPet_ID(String pet_ID) {
        this.pet_ID = pet_ID;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pID='" + pet_ID + '\'' +
                ", name='" + pet_name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
