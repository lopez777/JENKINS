package asteroidJenkins;
// testing email noti for multiple recipientss
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.psnbtech.Game;

public class AsteroidTest {

	@Ignore
	@Test
	public void testGetHello() {		
		Game g = new Game();
		assertEquals("Testing hello with Jenkins!", g.getHello());
	}

}
