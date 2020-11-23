package com.alamin.demo.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alamin.demo.dao.TicketDao;
import com.alamin.demo.model.Ticket;

@RestController
@RequestMapping("/")
public class TicketController {
	@Autowired
	TicketDao dao;
	@PostMapping("/bookTickets")
    public Ticket bookTicket(@RequestBody Ticket tickets) {
    	dao.save(tickets);
    	return tickets;
    }
	@GetMapping("/getTickets")
    public List<Ticket> getTickets(){
    	return (List<Ticket>) dao.findAll();
    }
}
