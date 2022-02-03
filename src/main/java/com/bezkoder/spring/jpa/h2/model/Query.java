package com.bezkoder.spring.jpa.h2.model;

import com.bezkoder.spring.jpa.h2.repository.TutorialRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Query implements GraphQLQueryResolver {

@Autowired
TutorialRepository tutorialRepository;
public List<Tutorial> recentTutorials(){
    List<Tutorial> tutorials = new ArrayList<Tutorial>();
    tutorialRepository.findAll().forEach(tutorials::add);
    return tutorials;
}

}
