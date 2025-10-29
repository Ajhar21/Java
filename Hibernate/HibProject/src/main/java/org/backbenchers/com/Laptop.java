package org.backbenchers.com;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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
    @ManyToOne      //for OneToMany, it would be ManyToOne from laptop perspective
    private Alien alien;

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
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
                ", alienId=" + (alien != null ? alien.getAid() : "null") +
                '}';
    }
}
