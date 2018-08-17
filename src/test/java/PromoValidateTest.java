
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PromoValidateTest {

	@Before
	public void init()
	{
		
	}
	@Test
	public void whenPromoCodeIsValid() 
	{
		
	}
	
	@Test(expected=com.capgemini.exception.PromoCodeInvalidException.class)
	public void whenPromoCodeIsInValid() 
	{
		
	}
	
	@Test(expected=com.capgemini.exception.DateExceededException.class)
	public void whenCurrentDateExceedsEndDate()
	{
		
	}
	
	@Test(expected=com.capgemini.exception.DateExceededException.class)
	public void whenCurrentdateIsBehindStartDate()
	{
		
	}
	
	@Test(expected=com.capgemini.exception.PromoCodeInvalidException.class)
	public void whenMinimumOrderAmountIsNotMet()
	{
		
	}
	

	@After
	public void close()
	{
		
	}
}
