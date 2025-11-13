package com.rayen.chansons.repos;

import com.rayen.chansons.entities.Chanson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChansonRepository extends JpaRepository<Chanson, Long> {
}
