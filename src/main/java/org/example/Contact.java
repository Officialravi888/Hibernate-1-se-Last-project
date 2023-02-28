package org.example;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_contact")
public class Contact {

    public Contact() {
        super();
    }

    public Contact(String phone, String email, Employee employee) {
        super();
        this.phone = phone;
        this.email = email;
        this.employee = employee;
    }

    @Id
    @Column(name="contactid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @OneToOne(targetEntity=Employee.class,cascade=CascadeType.ALL)
    @JoinColumn(name="emp_id",referencedColumnName="eid")
    private  Employee  employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
