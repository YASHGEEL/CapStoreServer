package com.capgemini.test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.NotNull;

import com.capgemini.model.Product;
import com.capgemini.model.PromoCode;
import com.capgemini.repository.ProductRepository;
import com.capgemini.repository.PromoRepository;
import com.capgemini.service.PromoDisplayService;
import com.capgemini.service.PromoServiceImpl;



public class testcases {
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
		public void promoDisplay() {
		/*List<PromoCode> promo=promoservice.promoDisplay();
		//when(promorepository.findAll()).thenReturn(promocode);
		assertEquals(false,promo.isEmpty());*/
		}
		
		@Test
		public void newProductDisplay() {
		/*List<Product> pro=promoservice.newProductsDisplay();
		assertEquals(pro.isEmpty(),false);*/
		}
		
	    @Test(expected=NullPointerException.class)
	    public void whenPromoListisEmpty() {
		/*List<PromoCode> promo=promoservice.promoDisplay();
	    assertNotNull(promo);*/

		//assertEquals(null,promo);
	}
}


