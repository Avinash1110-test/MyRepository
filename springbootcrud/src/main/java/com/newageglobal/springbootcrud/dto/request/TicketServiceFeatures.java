package com.newageglobal.springbootcrud.dto.request;

import com.newageglobal.springbootcrud.dao.TicketRepository;
import com.newageglobal.springbootcrud.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceFeatures {

    @Autowired
    TicketRepository ticketRepository;

    public Ticket getTicketsById(int id) {

        return ticketRepository.findById(id).get();

    }
    public void save(List<Ticket> ticket) {

        ticketRepository.saveAll(ticket);

    }
    public void delete(int id) {

        ticketRepository.deleteById(id);

    }
    public void update(Ticket ticket, int ticketid) {

        ticketRepository.save(ticket);

    }
}
