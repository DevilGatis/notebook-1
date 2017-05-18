package lv.tele2.javacourses;

import asg.cliche.Command;

import java.util.ArrayList;

public class Person extends Record {
    private String firstName;
    private String lastName;
    private ArrayList<String> phone;

    public String getFirstName() {
        return firstName;
    }

    @Command
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Command
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + getId() + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        if(firstName.toLowerCase().contains(str.toLowerCase()))
            return true;
        if(lastName.toLowerCase().contains(str.toLowerCase()))
            return true;
        for(String ph: phone){
            if (ph.toLowerCase().contains(str.toLowerCase()))
                return true;
        }
        return false;
    }
}
