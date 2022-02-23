package com.pixeltrice.springbootimportcsvfileapp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "salesbd")
public class DeveloperTutorial {

    @Id
    @Column(name = "phonenumber")
    private long phonenumber;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    public DeveloperTutorial() {

    }

    public DeveloperTutorial(long phonenumber, String name, String  email) {
        this.phonenumber = phonenumber;
        this.name = name;
        this.email = email;

    }

    public long getphonenumber() {
        return phonenumber;
    }

    public void setphonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Tutorial [phonenumber=" + phonenumber + ", name=" + name + ", email=" + email + "]";
    }
}
