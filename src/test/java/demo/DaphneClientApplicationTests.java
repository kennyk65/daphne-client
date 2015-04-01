package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DaphneClientApplication.class)
public class DaphneClientApplicationTests {

	@Autowired ExamineServers es;
	

	@Test
	public void examine() {
		es.process();
	}
}
