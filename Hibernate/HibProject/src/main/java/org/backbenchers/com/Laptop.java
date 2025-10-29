package org.backbenchers.com;

import jakarta.persistence.*;

import java.util.List;

/************** Embeddable ***********************
 * Embeddable annotation used for complex datatype to store in DB
 * */
//@Embeddable
@Entity
public class Laptop {
    @Id
    int lid;
    String name;
    String model;
    int ram;
//    @ManyToOne      //for OneToMany, it would be ManyToOne from laptop perspective
//    @ManyToMany //it will create a third table
    @ManyToMany(mappedBy = "laptops")   //now alien will create third table
    private List<Alien> alien;

    public List<Alien> getAlien() {
        return alien;
    }

    public void setAlien(List<Alien> alien) {
        this.alien = alien;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
//                ", alienId=" + (alien != null ? alien.getAid() : "null") +
                '}';
    }
}
