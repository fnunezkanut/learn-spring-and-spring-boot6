package com.oreilly;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomSecurityEventListener implements ApplicationListener<AbstractAuthenticationFailureEvent> {


	//trigered when user fails to authenticate
	@Override
	public void onApplicationEvent( AbstractAuthenticationFailureEvent event ) {

		System.out.println( event.getException().getMessage() );
	}
}
