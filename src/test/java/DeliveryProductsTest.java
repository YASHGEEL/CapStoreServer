import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.InvalidOrderIdException;
import com.capgemini.model.Cart;
import com.capgemini.model.Customer;
import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;

import com.capgemini.repository.UserRepository;
import com.capgemini.service.DeliveryProductsService;
import com.capgemini.service.UserService;

public class DeliveryProductsTest {
	@Before
	public void init()
	{
		
	}
	
	@Test(expected= com.capgemini.exception.InvalidOrderIdException.class)
	public void whenTheInvalidOrderIdEnteredThrowException()  {
		
	}
	
	
	@Test(expected= com.capgemini.exception.InvalidStatusException.class)
	public void whenTheInvalidStatusEnteredThrowException() {
		
	}
	
	
	@Test(expected= com.capgemini.exception.InvalidProductIdException.class)
	public void whenTheInvalidProductIdEnteredThrowException()  {
		
	}
	
	
	@Test
	public void whenTheValidInfoIsPassedSuccessfullyQtyShouldUpdateInTheInventory() {
			
	}
	
	@After
	public void close()
	{
		
	}

	
}
