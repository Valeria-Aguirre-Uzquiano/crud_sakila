package bo.edu.ucb.crud_sakila;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="language")
public class Language {
    @Id
    @Column(name = "language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int language_id;
    @Column(name = "name")
    private String language;
    @Column(name = "last_update")
    private Date last_update;

    public Language(){

    }

    public int getLanguage_id() {
        return language_id;
    }

    public String getLanguage() {
        return language;
    }

    public Date getLast_update() {
        return last_update;
    }
    
    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
