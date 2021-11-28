package sample.data.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.data.jpa.domain.OnlineClass;

public interface OnlineClassDao extends JpaRepository<OnlineClass, Long> {

}
