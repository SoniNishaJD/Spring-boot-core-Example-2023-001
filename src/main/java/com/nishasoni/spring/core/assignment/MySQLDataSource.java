package com.nishasoni.spring.core.assignment;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource {

    @Override
    public String[] getEmails() {

        String[] emails = { "nishasoni@gmail.com", "tony@gmail.com", "john@gmail.com" };

        return emails;
    }
}
