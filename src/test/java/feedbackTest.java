import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.InvalidFeedbackException;
import com.capgemini.model.Cart;
import com.capgemini.model.Customer;
import com.capgemini.model.FeedBack;
import com.capgemini.model.Product;
import com.capgemini.repository.FeedBackRepository;
import com.capgemini.repository.UserRepository;
import com.capgemini.service.UserFeedBackService;
import com.capgemini.service.UserService;

public class feedbackTest {
	UserFeedBackService userFeedback;
	@Mock
	FeedBackRepository repository;

	@Before
	public void setUp() throws InvalidFeedbackException {
		MockitoAnnotations.initMocks(this);

		//userFeedback = new UserService(repository);
		
	}

	

	@Test
	public void test() throws InvalidFeedbackException {

		

	}

	@Test
	public void FeedBackNotEmpty() throws InvalidFeedbackException {
		

	}
	@Test
	public void getId() throws InvalidFeedbackException {
		
	}
	@Test
	public void getStartDate() throws InvalidFeedbackException {
		
		
	}
	@Test
	public void getEndDate() throws InvalidFeedbackException {
		
				
	}
	@After
	public void close() {
		
	}
	
	
	
	

}
