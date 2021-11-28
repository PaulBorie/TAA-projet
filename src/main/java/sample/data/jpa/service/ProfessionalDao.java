package sample.data.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.data.jpa.domain.Professional;


public interface ProfessionalDao extends JpaRepository<Professional, Long> {



}
