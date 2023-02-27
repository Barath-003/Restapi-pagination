package com.example.color.testservices;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.color.testentity.testentity;
import com.example.color.testrepos.testrepos;



@Service

public class testservices {
		@Autowired
	testrepos r;
	
	public String add(testentity m) {
		r.save(m);
		return "Added";
	}
	
	public List<testentity> getDetails() {
		return r.findAll();
	}
	
	public testentity updateDetails(testentity e1) {
		return r.saveAndFlush(e1);
	}
	
	public void deleteDetails(testentity e2) {
		r.delete(e2);
	}
	
	public List<testentity> getSorted(String field) {
		return r.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<testentity> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<testentity> page =r.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}

}