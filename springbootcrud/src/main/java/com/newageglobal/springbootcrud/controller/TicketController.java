package com.newageglobal.springbootcrud.controller;

import com.newageglobal.springbootcrud.dto.mapper.TicketMapper;
import com.newageglobal.springbootcrud.dto.request.TicketServiceFeatures;
import com.newageglobal.springbootcrud.dto.response.Responsedto;
import com.newageglobal.springbootcrud.dto.response.TicketDto;
import com.newageglobal.springbootcrud.model.Ticket;
import com.newageglobal.springbootcrud.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController{

    @Autowired
    private TicketService ticketService ;
    @Autowired
    private TicketMapper ticketMapper;
    @Autowired
    private TicketServiceFeatures ticketServiceFeatures;

    @PostMapping("/bookTickets")
    public String bookTickets(@RequestBody List<Ticket> tickets) {

    return "Tickets booked : " + tickets.size();

    }
    @GetMapping("/allTickets")
    public ResponseEntity<?> getTickets() {

        List<Ticket> list = ticketService.findAll();
        List<TicketDto> ticketDtoList  = ticketMapper.convertListToDto(list);

        return ResponseEntity.ok(new Responsedto(HttpStatus.OK.value(),Boolean.TRUE,ticketDtoList));
    }

    @GetMapping("/ticket/{ticketid}")
    public Ticket getTicket (@PathVariable("ticketid") int ticketid) {
        return ticketServiceFeatures.getTicketsById(ticketid);
    }

    @PostMapping("/postTicket")
    public List<Ticket> saveTicket (@RequestBody List<Ticket> ticket) {
        ticketServiceFeatures.save(ticket);
        return ticket;
    }

    @PutMapping("/putTicket/{ticketid}")
    public Ticket update (@PathVariable("ticketid") int ticketid , @RequestBody Ticket ticket) {
        ticketServiceFeatures.update(ticket , ticketid);
        return ticket;
    }

    @DeleteMapping("/deleteTicket/{ticketid}")
    private String deleteTicket (@PathVariable ("ticketid") int ticketid) {
        ticketServiceFeatures.delete(ticketid);
        return "Deleted the ticket details containing the ticketid : " + ticketid;
    }

}
