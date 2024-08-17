package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.time.Duration;
import java.time.Instant;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void MD5test() {
		String p1 = DigestUtils.md5DigestAsHex("123".getBytes());
		String p2 = DigestUtils.md5DigestAsHex("123".getBytes());
		System.out.println(p1);
		System.out.println(p2);
	}

	@Test
	void DelayTimeDuration() {
		// Current time point
		Instant now = Instant.now();

		// Set the delay time
		Duration delay = Duration.ofDays(1)
				.plusHours(3)
				.plusMinutes(20)
				.plusSeconds(12);

		// Calculate the time point after the delay
		Instant delayedTime = now.plus(delay);

		// Print results
		System.out.println("Current time: " + now);
		System.out.println("Delay:" + delay);
		System.out.println("Time after delay: " + delayedTime);
	}
}
