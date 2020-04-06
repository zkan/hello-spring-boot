package team.odds.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import team.odds.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
