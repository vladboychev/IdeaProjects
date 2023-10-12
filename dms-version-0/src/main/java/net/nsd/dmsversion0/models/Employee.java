package net.nsd.dmsversion0.models;

import jakarta.persistence.*;

@Entity
@Table(name = "empls")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empl_id")
    private int id;

    @Column(name = "sap_num")
    private String sapNumber;

    @Column(name = "f_name")
    private String firstName;

    @Column(name = "m_name")
    private String middleName;

    @Column(name = "l_name")
    private String lastName;

    @Column(name = "pin")
    private String pin;

    public Employee() {
    }

    public Employee(String sapNumber, String firstName, String middleName, String lastName, String pin) {
        this.sapNumber = sapNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSapNumber() {
        return sapNumber;
    }

    public void setSapNumber(String sapNumber) {
        this.sapNumber = sapNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", sapNumber='" + sapNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
