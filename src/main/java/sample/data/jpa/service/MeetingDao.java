package sample.data.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.data.jpa.domain.Meeting;

public interface MeetingDao extends JpaRepository<Meeting, Long> {



}
