package com.capgemini.service;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.OrderDetails;
import com.capgemini.model.PromoCode;
import com.capgemini.repository.OrderRepository;
import com.capgemini.repository.PromoRepository;

@Service
public class PromoValidationImpl implements PromoValidation {

	@Autowired
	PromoRepository promorepo;
	
	@Autowired
	OrderRepository orderrepo;

	@Override
	public String ValidatingPromo(int orderId, String promoname) {
		// TODO Auto-generated method stub
		PromoCode promo=promorepo.getPromoCode(promoname);
		OrderDetails order= orderrepo.getOrderDetails(orderId);
		
		if(promo!=null)
		{
			LocalDate localDate = LocalDate.now();
			Date date1=Date.valueOf(localDate);
			if(promo.getStartTime().before(date1) && promo.getEndTime().after(date1) && (order.getAmount()>=promo.getMinimumAmount()))
			{
				order.setAmount(order.getAmount()-promo.getDiscountAmount());
				orderrepo.save(order);
				return "Promo Code Applied Successfully!";
			}
			else
			{
				return "Invalid Promo Code!";
			}
		}
		else
		{
			return "Invalid PromoCode!";
		}
	}

	@Override
	public String RemovePromo(int orderId, String promoname) {
		// TODO Auto-generated method stub
		PromoCode promo=promorepo.getPromoCode(promoname);
		OrderDetails order= orderrepo.getOrderDetails(orderId);
		
		
			
				order.setAmount(order.getAmount()+promo.getDiscountAmount());
				orderrepo.save(order);
				return "Promo Code Removed!";
	
	
	}
	

}
