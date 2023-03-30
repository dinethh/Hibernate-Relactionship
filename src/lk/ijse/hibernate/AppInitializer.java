package lk.ijse.hibernate;


import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Author:Dineth Panditha
 * Date :3/1/2023
 * Time :2:32 PM
 * Project Name :Hibernate
 */
public class AppInitializer {
    public static void main(String[] args) {
        //student Laptop (one to one)
       /* Student s1 = new Student();
        s1.setsID("S001");
        s1.setName("Dineth");

        Laptop l1 = new Laptop();
        l1.setlID("L001");
        l1.setDescription("Acer");
        l1.setStudent(s1);*/


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        //student Laptop save
        /* session.save(s1);
        session.save(l1);*/

        //owner and pet objects (one to many)
        /*Owner own1 = new Owner();
        own1.setoID("O-001");
        own1.setoName("Nimal");

        Pet p1 = new Pet();
        p1.setPet_ID("P-001");
        p1.setPet_name("Cat");
        p1.setOwner(own1);

        Pet p2 = new Pet();
        p2.setPet_ID("P-002");
        p2.setPet_name("Parrot");
        p2.setOwner(own1);*/

        //pet add Methodology 1
       /* ArrayList<Pet> petList = new ArrayList<>();
        petList.add(p1);
        petList.add(p2);
        own1.setPetList(petList);*/

        //pet add methodology 2
        /*own1.getPetList().add(p1);
        own1.getPetList().add(p2);*/

        //owner and pet save
       /* session.save(own1);
        session.save(p1);
        session.save(p2);*/

        //lecture and subject (many to many)
       /* Lecture lec1 = new Lecture();
        lec1.setLecID("L001");
        lec1.setLecName("Niroth");

        Lecture lec2 = new Lecture();
        lec2.setLecID("L002");
        lec2.setLecName("Prasad");

        Subject sub1 = new Subject();
        sub1.setSubID("S001");
        sub1.setSubName("PRF");

        Subject sub2 = new Subject();
        sub2.setSubID("S002");
        sub2.setSubName("Java");*/

        //subject lectures add methodology 1
        /*ArrayList<Subject> subjectList = new ArrayList<>();
        subjectList.add(sub1);
        subjectList.add(sub2);

        ArrayList<Lecture> lectureList = new ArrayList<>();
        lectureList.add(lec1);
        lectureList.add(lec2);

        lec1.setSubjectList(subjectList);
        lec2.setSubjectList(subjectList);

        sub1.setLectureList(lectureList);
        sub2.setLectureList(lectureList);*/

        //subject lectures add methodology 2
       /* lec1.getSubjectList().add(sub1);
        lec2.getSubjectList().add(sub2);

        sub1.getLectureList().add(lec1);
        sub2.getLectureList().add(lec2);*/


        //subject lectures save
        /*session.save(lec1);
        session.save(lec2);
        session.save(sub1);
        session.save(sub2);*/


        transaction.commit();
        session.close();


    }
}
