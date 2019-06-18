package com.capgemini.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.exception.PromoCodeNotFoundException;
import com.capgemini.model.Product;
import com.capgemini.model.PromoCode;
import com.capgemini.repository.ProductRepository;
import com.capgemini.repository.PromoRepository;
import com.capgemini.service.PromoDisplayService;
import com.capgemini.service.PromoServiceImpl;



public class TestCasesPromo {
	PromoDisplayService promoservice;
	@Mock
	PromoRepository promorepository;
	@Mock
	ProductRepository productrepository;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	//}
		promoservice = new PromoServiceImpl();}
	PromoCode promocode =new PromoCode();
		@Test
		public void promoDisplay() throws PromoCodeNotFoundException {
		
		/*//System.out.println(promo);
		//promocode.setId(10);
		//promocode.setDescription("hai");
		//promocode.setDiscountAmount(100);
		String str="2018-08-18";
		Date date=Date.valueOf(str);
		promocode.setEndTime(date);*/
		List<PromoCode> promo=promoservice.promoDisplay();
		//when(promorepository.findAll()).thenReturn(promocode);
		Iterator<PromoCode> iterator=promo.iterator();
		while(iterator.hasNext()) {
			promocode=iterator.next();
		}
		assertEquals(100,promocode.getDiscountAmount());
		}
		 @Test(expected=NullPointerException.class)
		    public void whenPromoListisEmpty() throws PromoCodeNotFoundException {
			List<PromoCode> promo=promoservice.promoDisplay();
		    assertNotNull(promo);

			//assertEquals(null,promo);
		    }
		@Test
		public void newProductDisplay() throws ProductNotFoundException {
		List<Product> pro=promoservice.newProductsDisplay();
		assertEquals(false,pro.isEmpty());
		}
		
	    @Test(expected=NullPointerException.class)
	    public void whenProductListisEmpty() throws ProductNotFoundException {
		List<Product> product=promoservice.newProductsDisplay();
	    assertNotNull(product);
	    }
	    @After
	    public void close() {
	    	
	    }
	}



