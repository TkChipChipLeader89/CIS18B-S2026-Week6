package edu.norcocollege.cis18b.week6.mini04;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureLab {
// Type erasure will remove generic type info at runtime
// This affects things like logging and diagonsitics because List<string> and List<integer>
// appears as the same type, making it harder to distinguish them during during debugging.
    public static void main(String[] args) {
        List<String> courseNames = new ArrayList<>();
        List<Integer> sectionCounts = new ArrayList<>();

        boolean sameRuntimeClass = courseNames.getClass() == sectionCounts.getClass();
        boolean listInstanceCheck = courseNames instanceof List;

        System.out.println("Same runtime class: " + sameRuntimeClass);
        System.out.println("List is instance of java.util.List: " + listInstanceCheck);
        System.out.println("Course token simple name: " + TypeTokenPrinter.simpleNameOf(String.class));
    }
}
