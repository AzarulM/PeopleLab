package Lab;

public abstract class Person {
    private String firstName;
    private String familyName;

    public Person(String firstName, String familyName)
    {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public abstract String getFirstName();

    public abstract String getFamilyName();

    
    public abstract boolean equals(Person p);

    public String toString()
    {
        return firstName + " " + familyName;
    }
}
