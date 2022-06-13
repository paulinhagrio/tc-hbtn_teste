package mei.src;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String fullName(String name, String surname){
        return name + " " + surname;
    }

    public float calculateYearlySalary(){
        return this.salary * 12;

    }

    public boolean isMEI(){

        LocalDate personBirthDate = LocalDate.ofInstant(this.birthDate.toInstant(), ZoneId.systemDefault());
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(personBirthDate, currentDate);

        if(calculateYearlySalary() > 130000) return false;
        if(age.getYears() < 18) return false;
        if(anotherCompanyOwner) return false;
        if(pensioner) return false;
        if(publicServer) return false;

        return true;
    }
}
