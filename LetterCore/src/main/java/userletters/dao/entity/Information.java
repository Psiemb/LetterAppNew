package userletters.dao.entity;

import javax.persistence.*;

@Entity
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int size;
    private Type type;

    @OneToOne(mappedBy = "information")
    private Letter letter;

    public Information() {
    }

    public Information(int size, Type type) {
        this.size = size;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
