import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mock;
import com.capgemini.model.Product;
import com.capgemini.repository.ImageRepository;
import com.capgemini.service.ImageService;

public class ImageTest {
	
	@Mock
	ImageRepository repo;
	ImageService service;
	
	@Test
	public void testImageurl() {
		Product image = new Product();
		image.setImageUrl("https://en.gravatar.com/userimage/143241489/5f92fe848a0ee5abe504f5ad4c6f6d1c.jpg");
	    assertEquals("https://en.gravatar.com/userimage/143241489/5f92fe848a0ee5abe504f5ad4c6f6d1c.jpg", image.getImageUrl());
	}
	@Test
	public void testNonempty() {
		Product prdt = new Product();
		prdt.setImageUrl(null);
		assertNotNull( prdt.getImageUrl());
	}
	
}
