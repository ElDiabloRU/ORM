package Hibernate;


import javax.persistence.*;

@Entity
@Table(name = "News")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Theme")
    private String theme;
    private String description;

    public News(){

    }

    public News(String theme, String description){
        this.theme = theme;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", description=" + description +
                '}';
    }

}
