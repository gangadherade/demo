package com.bezkoder.spring.jpa.h2.model;

import com.bezkoder.spring.jpa.h2.repository.TutorialRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public class Mutation implements GraphQLMutationResolver {
    @Autowired
    TutorialRepository tutorialRepository;

    public Mutation() {

    }

    public Tutorial writeTutorial(String title, String text) {
        try {
            return tutorialRepository
                    .save(new Tutorial(title, text, false));

        } catch (Exception e) {
            return null;
        }
    }
}
