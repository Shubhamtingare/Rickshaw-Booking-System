package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Rickshaw;

@Repository
public interface RickshawRepository extends JpaRepository<Rickshaw, Long> {
    List<Rickshaw> findByLocationAndAvailability(String location, boolean availability);
}

