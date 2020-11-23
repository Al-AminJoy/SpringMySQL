package com.alamin.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alamin.demo.model.Ticket;
public interface TicketDao extends JpaRepository<Ticket,Integer>{

}
