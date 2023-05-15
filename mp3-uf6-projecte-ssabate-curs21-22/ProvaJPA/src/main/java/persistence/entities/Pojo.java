package persistence.entities;

import jakarta.persistence.*;

import java.io.Serializable;


/**
 *
 * @author profe
 */
@Entity
@Table(name = "POJO")
public class Pojo implements Serializable{
    
    
    private static final long serialVersionUID = 1L;
    
    //@Id @GeneratedValue
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "X")
    private int x;
    @Column(name = "Y")
    private int y;

    public Pojo() {
    }

    public Pojo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Long getId() {
        return id;
    }

    public int getX() {
         return x;
    }

    public int getY() {
         return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
