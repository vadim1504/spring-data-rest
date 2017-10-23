package by.vadim.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmailAddress {

    @Id
    private String id;
    private String value;

    public EmailAddress() {

    }

    public EmailAddress(String id, String value) {
        this.id=id;
        this.value = value;
    }

    public EmailAddress(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
