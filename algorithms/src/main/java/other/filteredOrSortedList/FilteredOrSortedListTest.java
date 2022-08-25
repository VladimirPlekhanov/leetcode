package other.filteredOrSortedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilteredOrSortedListTest {

    FilteredOrSortedList f = new FilteredOrSortedList();

    @Test
    public void filteredOrSortedListTest() {
        List<FilteredOrSortedList.Person> people = new ArrayList<>();
        people.add(new FilteredOrSortedList.Person("Warren Buffett", 120));
        people.add(new FilteredOrSortedList.Person("Jeff Bezos", 150));
        people.add(new FilteredOrSortedList.Person("Bill Gates", 100));
        people.add(new FilteredOrSortedList.Person("Mark Zuckerberg", 50));

        List<FilteredOrSortedList.Person> hundredClub = f.filteredList(people);
        List<FilteredOrSortedList.Person> sortedClub = f.sortedList(people);
        List<FilteredOrSortedList.Person> hundredSortedClub = f.filteredSortedList(people);

        hundredClub.forEach(person -> System.out.println(person.name));
        System.out.println();
        sortedClub.forEach(person -> System.out.println(person.name));
        System.out.println();
        hundredSortedClub.forEach(person -> System.out.println(person.name));
    }

}
