package training.springboot.model; //

import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "photo")
@AllArgsConstructor
//public class Photo implements Serializable { // helps transform java class into different types of stream?
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// pasiskaityti, katra naudoti, nors veiks visi, auto ar identity etc
    @Column(name = "ID")
    private Long id;

    @Column(name = "name") //@NotNull or @Column(nullable = false) gali buti
    private String name;

    @Column(name = "description")
    private String description;

    public Photo() {

    }


    // @Column(name = "Photo", length = Integer.MAX_VALUE, nullable = false)
    // private byte[] photoByte;

//    @Column(length = 50000) // byte value is very long, since the default value is small, we change it to bigger
//    private byte[] photoByte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
         return "Photo [id = " + id + " , name =" + name + " , description =" + description
                 + "photo =" +"]";
    }
}

