package team.odds.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import team.odds.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
