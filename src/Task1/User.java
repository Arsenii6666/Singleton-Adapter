package Task1;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class User {
    public User(Integer id, String name, String email, Integer age){
        this.id=id;
        this.name=name;
        this.email=email;
        this.age=age;
    }
    public final Integer id;
    public String name;
    String email;
    Integer age;
    private DbConnection db;
    public void save(){
        db.getInstance().save(id, name, email, age);
    }
}
