package com.javatpoint;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

@SpringBootTest
class SpringBootCrudOperationApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void when_getAllInstructors_thenStatus200()
			throws Exception {
/*
		createTestEmployee("Admin");

		mvc.perform(get("/instructor")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content()
						.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].name", is("bob")));*/
	}

	@Test
	public void when_addInstructor_thenStatus200()
			throws Exception {
	//To be added
	}
}