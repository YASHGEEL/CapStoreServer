

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.repository.UserRepository;
import com.capgemini.service.ManagingMerchantImpl;
import com.capgemini.service.ManagingMerchantService;
import com.capgemini.service.UserService;

public class ManagingMerchantTest {

	ManagingMerchantService service;
	
	@Mock
	UserRepository userrepo;
	
	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
		
		service = new ManagingMerchantImpl(userrepo);
	}
	
	@Test
	public void MerchantisAddedSuccessfully() {
		
		
	}
	
	@Test
	public void MerchantisDeletedSuccessfully()
	{

}
	
@Test
public void MerchantisUpdatedSuccessfully()
{

}


}

