package org.backbenchers.com;

import jakarta.persistence.*;

import java.util.List;

/********************* change table name & column name *******************
 *
 * Entity & Table is slightly different in ORM concept, tbale is DB entity, Entity is class representation of a table
 * @Entity(name="alien_table") will change Entity & Table name both
 * @Table(name="alien_table") will change the DB table name
 * @Column(name="a_name")  //it will change column name
 * @Transient      //it will delete column from DB, but work as a variable here
 * @OneToOne   //this annotation indicate laptop is parent table, has one to one relation with alien table
 * @OneToMany(mappedBy = "lid")    //this will prevent to create new table
 * The mappedBy value must match the name of the variable in the child entity (Laptop)
 * that refers back to the parent (Alien).
 * ******************************************************************************/

/******************** Cache, EAGER Fetch, LAZY Fetch ****************************
 * Hibernate by default give Level 1 caching, caching for same session for same data
 * Level 1 caching-> won't ask select query in same session
 * will ask query in different session
 * LAZY fetch won't make join query unless object needed to be print
 * EAGER fetch always make join query
 * **********************************************************************************/

/************************* Caching ******************************
 * Same data request to server within same session, Hibernate won't call DB for next time.
 * Hibernate returns data from cache
 * Hibernate doesn't provide caching for different sessions
 * Have to use external library Jcache(EHCACHE, Ceffeine) for caching between defferent sessions
 * *****************************************************************/


//@Entity(name="alien_table")
@Entity
@Table(name="alien_table")
public class Alien {
    @Id
    int aid;
    @Column(name="a_name")  //it will change column name
    String aname;
    @Transient      //it will delete column from DB, but work as a variable here
    String tech;
//    @OneToOne   //this annotation indicate laptop is parent table, has one to one relation with alien table
//    @OneToMany      //it creates ego issue, it will create a table cause redundancy
//    @OneToMany(mappedBy = "alien")    //this will prevent to create new table, mapping done by alien from Laptop class
//    @OneToMany(mappedBy = "lid")  //it will also do the same

//    @ManyToMany
    @OneToMany(fetch = FetchType.EAGER)   //by default it is  (fetch = FetchType.LAZY)
    private List<Laptop> laptops;

    public List<Laptop> getLaptops(){
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops){
        this.laptops=laptops;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
