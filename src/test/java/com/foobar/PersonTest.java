package com.foobar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

	@Test
	void itIsNamed() {
		Person person = Person.builder()
			.name("Adam")
			.build();
		assertEquals("Adam", person.name);
	}


}
