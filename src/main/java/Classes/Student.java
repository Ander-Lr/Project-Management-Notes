/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Student {
    private String name;
    private String FirtsLastName;
    private String SecondLastName;
    private Date date;
    private String identification;
    private String phone;
    private String email;
    private ArrayList<Asignature> ArrayList;

    public Student(String name, String FirtsLastName, String SecondLastName, Date date, String identification, String phone, String email, ArrayList<Asignature> ArrayList) {
        this.name = name;
        this.FirtsLastName = FirtsLastName;
        this.SecondLastName = SecondLastName;
        this.date = date;
        this.identification = identification;
        this.phone = phone;
        this.email = email;
        this.ArrayList = ArrayList;
    }

    public ArrayList<Asignature> getArrayList() {
        return ArrayList;
    }

    public void setArrayList(ArrayList<Asignature> ArrayList) {
        this.ArrayList = ArrayList;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirtsLastName() {
        return FirtsLastName;
    }

    public void setFirtsLastName(String FirtsLastName) {
        this.FirtsLastName = FirtsLastName;
    }

    public String getSecondLastName() {
        return SecondLastName;
    }

    public void setSecondLastName(String SecondLastName) {
        this.SecondLastName = SecondLastName;
    }

    public Date getDate() {
        return date;
    }
    public int getAge() {
        LocalDate dateOfBirth = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
