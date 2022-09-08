package fileLesson;

import Stream.sender_receiver.Data;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private Date birthDay;

    public Student(String firstName, String lastName, Integer age, Date birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDay = birthDay;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return String.format("ismi: "+firstName+"  familyasi: "+lastName+"  yoshi: "+age+"  tugSana: "+birthDay);
    }
}
