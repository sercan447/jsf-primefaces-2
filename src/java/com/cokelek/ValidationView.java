
package com.cokelek;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ValidationView {
    
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
    
    public void save(){
        FacesContext.getCurrentInstance().addMessage(null, 
                            new FacesMessage("Kontrol  : "+this.firstname + " / "+this.lastname));
    }
    
}
