package views;

import model.AgeComparator;
import model.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students students1 = new Students("Kien", 30, "HT");
        Students students2 = new Students("Nam", 26, "HN");
        Students students3 = new Students("Anh", 38, "HT");
        Students students4 = new Students("Tung", 38, "HT");
        List<Students> lists = new ArrayList<Students>();
        lists.add(students1);
        lists.add(students2);
        lists.add(students3);
        lists.add(students4);
        Collections.sort(lists);
        for (Students st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Students st : lists) {
            System.out.println(st.toString());
        }
    }
}
