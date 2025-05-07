package interop;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class CustomerJava {
    private int id;
    private String email;
    private String name;

    @Override
    public String toString() {
        return "interop.CustomerJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


public void prettyPrint() {
        System.out.println(email);
}

public @NotNull String  neverNull(){
        return "A String";
}

public String sometimesNull(){
        return "A New  String ";
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerJava that = (CustomerJava) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
