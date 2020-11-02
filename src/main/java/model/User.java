package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {
    private String name;
    private UUID id;
    private Integer age;
    private Boolean active;

    public User(@JsonProperty("name") String name,
                @JsonProperty("id") UUID id,
                @JsonProperty("age") Integer age,
                @JsonProperty("active") Boolean active) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", active=" + active +
                '}';
    }
}
