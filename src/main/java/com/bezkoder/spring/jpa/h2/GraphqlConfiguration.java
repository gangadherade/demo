package com.bezkoder.spring.jpa.h2;

import com.bezkoder.spring.jpa.h2.model.Mutation;
import com.bezkoder.spring.jpa.h2.model.Query;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class GraphqlConfiguration {

    @Bean
    public Query query() {
        return new Query();
    }

    @Bean
    public Mutation mutation() {
        return new Mutation();
    }

}
