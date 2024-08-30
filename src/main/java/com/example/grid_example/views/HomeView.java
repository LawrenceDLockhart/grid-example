package com.example.grid_example.views;

import com.example.grid_example.model.Person;
import com.example.grid_example.services.PersonService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {

        H1 h1 = new H1("Vaadin Grid Example");
        Grid<Person> grid = new Grid<>(Person.class, false);
        grid.addColumn(Person::getName).setHeader("Name").setSortable(true);
        grid.addColumn(Person::getEmail).setHeader("Email").setSortable(true);
        grid.addColumn(Person::getTitle).setHeader("Title").setSortable(true);

        List<Person> people = PersonService.getPeople();
        grid.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);
        grid.setItems(people);
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        grid.setAllRowsVisible(true);

        grid.addThemeVariants(GridVariant.LUMO_COMPACT, GridVariant.LUMO_NO_BORDER);

        add(h1, grid);
    }
}
