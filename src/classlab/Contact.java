/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classlab;

import java.util.Objects;

/**
 *
 * @author tpronschinske
 */
public class Contact {
    
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;

  
    public Contact(String firstName, String lastName, String address, String city, String state, String zip) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setState(state);
        setZip(zip);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.firstName);
        hash = 67 * hash + Objects.hashCode(this.lastName);
        hash = 67 * hash + Objects.hashCode(this.address);
        hash = 67 * hash + Objects.hashCode(this.city);
        hash = 67 * hash + Objects.hashCode(this.state);
        hash = 67 * hash + Objects.hashCode(this.zip);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.zip, other.zip)) {
            return false;
        }
        return true;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public final void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public final void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public final void setZip(String zip) {
        this.zip = zip;
    }
    
    @Override
    public String toString(){
        return "Contact Information: " + "\n" + "First Name: " + firstName + "/n LastName: " + lastName + "/n Address: " + address + "/n City: " + city + "/n State: " + state + "/n Zip: " + zip;
        
        
        
    }
    
    
    
    
}
