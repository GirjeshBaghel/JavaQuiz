package com.entity;
import java.util.List;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class QuestionForm {

	private List<Question> questions;
	
	
}
