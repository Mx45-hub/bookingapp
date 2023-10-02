package com.booking.bookingapp2;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "bookingapp")
public class bmodel {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    
    private String surname;

    private String email;

    private String style;

    private String cellphone;

    private String inputDate;

    private String inputTime;


    public bmodel() {
    }

    public bmodel(Long id, String firstname, String surname, String email, String style, String cellphone, String inputDate, String inputTime) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.style = style;
        this.cellphone = cellphone;
        this.inputDate = inputDate;
        this.inputTime = inputTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getCellphone() {
        return this.cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getInputDate() {
        return this.inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public String getInputTime() {
        return this.inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public bmodel id(Long id) {
        setId(id);
        return this;
    }

    public bmodel firstname(String firstname) {
        setFirstname(firstname);
        return this;
    }

    public bmodel surname(String surname) {
        setSurname(surname);
        return this;
    }

    public bmodel email(String email) {
        setEmail(email);
        return this;
    }

    public bmodel style(String style) {
        setStyle(style);
        return this;
    }

    public bmodel cellphone(String cellphone) {
        setCellphone(cellphone);
        return this;
    }

    public bmodel inputDate(String inputDate) {
        setInputDate(inputDate);
        return this;
    }

    public bmodel inputTime(String inputTime) {
        setInputTime(inputTime);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof bmodel)) {
            return false;
        }
        bmodel bmodel = (bmodel) o;
        return Objects.equals(id, bmodel.id) && Objects.equals(firstname, bmodel.firstname) && Objects.equals(surname, bmodel.surname) && Objects.equals(email, bmodel.email) && Objects.equals(style, bmodel.style) && Objects.equals(cellphone, bmodel.cellphone) && Objects.equals(inputDate, bmodel.inputDate) && Objects.equals(inputTime, bmodel.inputTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, surname, email, style, cellphone, inputDate, inputTime);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstname='" + getFirstname() + "'" +
            ", surname='" + getSurname() + "'" +
            ", email='" + getEmail() + "'" +
            ", style='" + getStyle() + "'" +
            ", cellphone='" + getCellphone() + "'" +
            ", inputDate='" + getInputDate() + "'" +
            ", inputTime='" + getInputTime() + "'" +
            "}";
    }



    
    
}
