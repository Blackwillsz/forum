package br.com.alura.forum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ForumApplicationTests {

	@SuppressWarnings("deprecation")
	@Test
	void contextLoads() {
		Assert.notNull(true);
	}

}
