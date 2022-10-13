package com.example.noteapp.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

	@GetMapping("/ping")
	public String ping(@RequestParam(value = "name", defaultValue = "pong") String name) {
		return name;
  }
}