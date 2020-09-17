package com.newageglobal.springbootcrud.dao;

import com.newageglobal.springbootcrud.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket,Integer> {

}
