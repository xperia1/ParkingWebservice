/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

    

/**
 *
 * @author mhaas
 */
//Class for Ticket
public class Ticket {
    private String Entrytime;
    private String Exittime;
    private int Ticketnumber;
    private int paid;
    private int deleted;
    
    //Getter and Setter

    public String getEntrytime() {
        return Entrytime;
    }

    public void setEntrytime(String Entrytime) {
        this.Entrytime = Entrytime;
    }

    public String getExittime() {
        return Exittime;
    }

    public void setExittime(String Exittime) {
        this.Exittime = Exittime;
    }

    public int getTicketnumber() {
        return Ticketnumber;
    }

    public void setTicketnumber(int Ticketnumber) {
        this.Ticketnumber = Ticketnumber;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        if(paid <= 1 && paid >= 0){
            this.paid = paid;
        }
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        if(deleted <= 1 && deleted >=0){
           this.deleted = deleted; 
        }
    }
    
}
