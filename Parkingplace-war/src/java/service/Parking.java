/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import data.Ticket;
import data.dataholder;
import java.util.List;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author mhaas
 */
@WebService(serviceName = "CarParkParking")
//@Stateless()
public class Parking {
    
    private dataholder ParkingSpace;
    
    public Parking() {
        ParkingSpace = new dataholder();
    }

    @WebMethod(operationName = "getTicketList")
    public List<Ticket> getTicketList(){
        return ParkingSpace.getParkingList();
    }
}
