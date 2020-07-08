package br.com.bridi.abstractFactoryPattern;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simpleController")
public class SimpleControllerToCall {

	@Inject
	@Qualifier("productA")
	private AbsFactoryProduct absFactoryA;
	
	@Inject
	@Qualifier("productB")
	private AbsFactoryProduct absFactoryB;
	
	@RequestMapping(path = "/controller", produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<String> testing() {
		
		absFactoryA.createProductA();
		absFactoryA.createProductB();
		
		absFactoryB.createProductB();
		absFactoryB.createProductA();
		
	    return null;
	    
	}
	
}
