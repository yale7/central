package com.dm.ws.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel Mroczka daniel.mroczka@gmail.com Created: 2011-10-07 02:20:40
 *
 */
@XmlRootElement
public class Customer {

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
