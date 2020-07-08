package br.com.bridi.observerPattern.spring;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simpleControllerObserver")
public class SimpleControllerToCall {

	@Inject
	@Qualifier("com.bridi.observerPattern.spring")
	List<IObserver> listToNotify;
	
	@RequestMapping(path = "/controllerObserver", produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<String> testing() {
		
		listToNotify.forEach(IObserver::update);
		
	    return null;	    
	}
	
	
}
