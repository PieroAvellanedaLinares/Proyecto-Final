/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author piero
 */
public class administrador {
    private String adminnombre;
    private String email;

    public administrador(String adminnombre, String email) {
        this.adminnombre = adminnombre;
        this.email = email;
    }

    public String getAdminnombre() {
        return adminnombre;
    }

    public void setAdminnombre(String adminnombre) {
        this.adminnombre = adminnombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
