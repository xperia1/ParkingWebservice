/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author mhaas
 */
public class dataholder {
    
    private List<Ticket> data = new ArrayList();
    
    public dataholder() {
        initParkingList();
    }
    
    
    private void initParkingList(){
        
        for (int i = 0; i < 100; i ++ ) {
            Ticket tmpTicket = new Ticket();
            tmpTicket.setTicketnumber(i+100);
            tmpTicket.setEntrytime(GenerateTimestampNow());
            data.add(tmpTicket);
        }
    }
    
    private String GenerateTimestampNow(){
        DateFormat df = new SimpleDateFormat("dd:MM:yy HH:mm:ss");
        Date dateobj = new Date();
        return df.format(dateobj);
    }
    
    
    public List<Ticket> getParkingList(){
        return data;
    }

    
}
