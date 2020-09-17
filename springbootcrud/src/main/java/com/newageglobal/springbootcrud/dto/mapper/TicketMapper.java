package com.newageglobal.springbootcrud.dto.mapper;

import com.newageglobal.springbootcrud.dto.response.TicketDto;
import com.newageglobal.springbootcrud.model.Ticket;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TicketMapper {

    public List<TicketDto> convertListToDto(List<Ticket> list) {
        List<TicketDto> ticketDtoList = new ArrayList<>();
        for (Ticket ticket : list) {
            ticketDtoList.add(convertEntityToDto(ticket));
        }
        return ticketDtoList;

    }

    private TicketDto convertEntityToDto(Ticket ticket) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(ticket,TicketDto.class);

    }
}
