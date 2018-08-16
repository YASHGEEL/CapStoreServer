import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mock;
import com.capgemini.model.Product;
import com.capgemini.repository.ProductDetails;
import com.capgemini.service.ProductDetailsService;

public class ProductPageTestCase {
	@Mock
	ProductDetails repo;
	ProductDetailsService service;
	Product clothing = new Product();

	@Test(expected = com.capgemini.exception.IncorrectId.class)
	public void testId() {
		Product mobile=new Product();
		assertEquals(123, mobile.getId());

	}

	@Test
	public void testBrand() {
		Product mobile=new Product();
		assertEquals("Samsung", mobile.getId());

	}

	@Test
	public void getDetailsTest() {
		Product clothing=new Product();
		assertEquals(clothing,service.getProductDetails(clothing.getId()));

	}

}
