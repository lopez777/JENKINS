package asteroidJenkins;
// testing with asteroid jenkins project email plugin 3
import static org.junit.Assert.*;
import org.junit.Test;
import org.psnbtech.Game;

public class AsteroidTest {

	@Test
	public void testGetHello() {
		Game g = new Game();
		assertEquals("Testing hello with Jenkins!", g.getHello());
	}

}
