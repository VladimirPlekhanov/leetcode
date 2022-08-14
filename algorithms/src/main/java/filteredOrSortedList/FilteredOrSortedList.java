package filteredOrSortedList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredOrSortedList {


    static class Person {
        String name;
        int billions;

        Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }

    }

    public List<Person> filteredList(List<Person> personList) {
        return personList.stream().filter(person -> person.billions >= 100).collect(Collectors.toList());
    }

    public List<Person> sortedList(List<Person> personList) {
        return personList.stream().sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
    }

    public List<Person> filteredSortedList(List<Person> personList) {
        return personList.stream().filter(person -> person.billions >= 100)
                .sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
    }

}
