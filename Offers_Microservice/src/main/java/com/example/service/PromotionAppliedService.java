package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Offer;
import com.entity.OfferApplied;
import com.entity.Promotion;
import com.entity.PromotionApplied;
import com.example.dao.OfferAppliedDao;
import com.example.dao.PromotionAppliedDao;

@Service
public class PromotionAppliedService 
{
	@Autowired
    private PromotionAppliedDao promotionAppliedDao;

    public List<PromotionApplied> getAllPromotionsApplied() {
        return promotionAppliedDao.findAll();
    }

    public Optional<PromotionApplied> getPromotionAppliedById(Long id) {
        return promotionAppliedDao.findById(id);
    }

    public PromotionApplied savePromotionApplied(Long promotionId, Long BookingId) {
        PromotionApplied promotionApplied=new PromotionApplied();
        promotionApplied.setPromotion(new Promotion());
        promotionApplied.getPromotion().setPromotionId(promotionId);
        promotionApplied.setBookingId(BookingId);
        return promotionAppliedDao.save(promotionApplied);

    }
}
