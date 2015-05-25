package com.demo.springsecurity.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;


/**
 * Created by Naveen Bensily on 5/23/15.
 */
@Component
public class UserNamePasswordAuth implements AuthenticationProvider {

    private Logger logger= LoggerFactory.getLogger("UserNamePasswordAuth");

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        logger.debug("Entering Custom Authentication classs");

        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
