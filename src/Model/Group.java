package Model;
// Generated Dec 4, 2017 10:13:39 PM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Group generated by hbm2java
 */
@Entity
@Table(name="group"
    ,catalog="testsystem"
)
public class Group  implements java.io.Serializable {


     private String id;
     private String name;
     private Byte deleted;
     private List<User> users = new ArrayList<User>(0);

    public Group() {
    }

	
    public Group(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Group(String id, String name, Byte deleted) {
       this.id = id;
       this.name = name;
       this.deleted = deleted;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false, length=36)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="deleted")
    public Byte getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="group")
    public List<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(List<User> users) {
        this.users = users;
    }




}


