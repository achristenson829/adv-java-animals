package us.mattgreen;

/**
 * Created by mgreen14 on 12/27/17.
 */
public abstract class Person extends Animal{
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}