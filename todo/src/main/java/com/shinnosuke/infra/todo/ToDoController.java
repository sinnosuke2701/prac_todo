package com.shinnosuke.infra.todo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ToDoController {
	
	@RequestMapping(value = "/xdm/v1/infra/todo/ToDoList")
	public String ToDoList() {
		return "/xdm/v1/infra/todo/ToDoList";
	}
	
}
