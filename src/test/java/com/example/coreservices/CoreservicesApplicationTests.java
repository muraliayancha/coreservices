package com.example.coreservices;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.services.core.util.RestUtil;


@SpringBootTest
class CoreservicesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testAccountService() {
		
		RestUtil util = new RestUtil();
		List<String> accounts = util.getAccounts();
		assertThat(accounts, is(not(empty())));

	}
	
	
}

