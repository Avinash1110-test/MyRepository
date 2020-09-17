package com.newageglobal.springbootcrud.service.impl;

import com.newageglobal.springbootcrud.dao.TicketRepository;
import com.newageglobal.springbootcrud.model.Ticket;
import com.newageglobal.springbootcrud.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAll() {

        return (List<Ticket>) ticketRepository.findAll();

    }

}
