package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class student1 {


	@Value("${Value.name}")
	private String newnameString;
	@GetMapping("/")
	public String homePage() {
		return "Welcome to Student list";
	}
	@GetMapping("/list")
	public List<Student>getList(){
		List<Student>detailsList=new ArrayList<>();
		detailsList.add(new Student(1,"xxxx",2));
		detailsList.add(new Student(2,"yyyy",12));
		detailsList.add(new Student(3,"zzzz",7));
		return detailsList;
	}

}