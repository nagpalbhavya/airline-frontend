package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}