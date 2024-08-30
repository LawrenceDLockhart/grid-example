package com.example.grid_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@Theme("my-theme")
public class GridExampleApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(GridExampleApplication.class, args);
    }
}
