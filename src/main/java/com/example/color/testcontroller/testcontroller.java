package com.example.color.testcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.color.testentity.testentity;
import com.example.color.testservices.testservices;

@RestController

public class testcontroller {
		@Autowired
		testservices s;

		@GetMapping("/get")
		public List<testentity> showDetails() {
			return s.getDetails();
		}

		@PostMapping("/post")
		public String addDetails(@RequestBody testentity m) {
			s.add(m);
			return "Added product " + m.getId();
		}
		@PutMapping("/update")
		public testentity updateInfo(@RequestBody testentity st) {
			return s.updateDetails(st);
		}
		@DeleteMapping("/delete")
		public void deleteInfo(@RequestBody testentity st2) {
			s.deleteDetails(st2);
		}

		//sorting
		@GetMapping("/product/{field}")
		public List<testentity> getWithSort(@PathVariable String field) {
			return s.getSorted(field);
		}

		// pagination
		@GetMapping("/product/{offset}/{pageSize}")
		public List<testentity> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			return s.getWithPagination(offset, pageSize);
		}
	}

