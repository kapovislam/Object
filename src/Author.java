import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Автор - " + firstName + " " + lastName;
    }

    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        if (this == other) {
            return true;
        }
        Author author = (Author) other;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);

    }
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}
