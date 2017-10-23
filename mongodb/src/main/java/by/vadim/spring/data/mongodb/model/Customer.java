package by.vadim.spring.data.mongodb.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
@CompoundIndexes({
        @CompoundIndex(name = "email_age", def = "{'email.id' : 1, 'age': 1}")
})
public class Customer {

    @Id
    private String id;
    @Indexed
    private String firstName;
    private String lastName;
    private int age;
    @Field("ListEmail")
    private List<EmailAddress> listEmailAddress;

    public Customer() {}

    @PersistenceConstructor
    public Customer(String firstName, String lastName, @Value("#root.age ?: 0") Integer age, List<EmailAddress> emailAddresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
        this.listEmailAddress=emailAddresses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<EmailAddress> getListEmailAddress() {
        return listEmailAddress;
    }

    public void setListEmailAddress(List<EmailAddress> listEmailAddress) {
        this.listEmailAddress = listEmailAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}