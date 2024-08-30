package com.example.grid_example.services;

import com.example.grid_example.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        // Predefined names and titles
        String[] names = {
                "John Doe", "Jane Smith", "Michael Johnson", "Emily Davis", "William Brown",
                "Jessica Wilson", "David Lee", "Sarah Jones", "James Garcia", "Laura Martinez",
                "Daniel Hernandez", "Olivia Clark", "Matthew Lewis", "Emma Robinson", "Joshua Walker",
                "Sophia Young", "Andrew Allen", "Isabella King", "Christopher Wright", "Mia Scott"
        };

        String[] titles = {
                "Software Engineer", "Product Manager", "Data Scientist", "UX Designer", "DevOps Engineer",
                "Marketing Specialist", "Sales Manager", "Business Analyst", "HR Manager", "Financial Analyst",
                "Content Writer", "SEO Specialist", "Customer Support", "QA Engineer", "IT Administrator",
                "Project Manager", "Graphic Designer", "Account Manager", "Operations Manager", "Network Engineer"
        };

        for (int i = 0; i < 20; i++) {
            Person person = new Person(names[i]);
            person.setEmail(names[i].toLowerCase().replace(" ", ".") + "@example.com");
            person.setTitle(titles[i]);
            people.add(person);
        }

        return people;
    }
}
