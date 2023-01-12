package guru.springframework;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import guru.springframework.controllers.IndexController;

@SpringBootTest
public class Spring5RecipeAppApplicationTests {

	@Autowired
	IndexController indexController;

	@Test
	public void contextLoads() {		
		Assertions.assertThat(indexController).isNotNull();
	}

}
