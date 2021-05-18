
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Person)) {
            return false;
        } 
        
        Person other = (Person) object;
        
        if (
                (this.name.equals(other.name)) & 
                (this.height == other.height) & 
                (this.weight == other.weight) & 
                (this.birthday.equals(other.birthday))
                ) {
            return true; 
        }
        
        return false;
    }
    // implement an equals method here for checking the equality of objects
}
