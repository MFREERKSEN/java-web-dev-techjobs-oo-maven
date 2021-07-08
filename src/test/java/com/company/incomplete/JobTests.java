package com.company.incomplete;

import com.company.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class JobTests {
    private Job assertFalse;
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly

    public static final Job job1 = new Job();

    public static final Job job2 = new Job();


    @Test
    public void testSettingJobId() {
        Assertions.assertFalse(job1.getId() == job2.getId());
        Assertions.assertTrue(job2.getId() == job1.getId() + 1);
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assertions.assertTrue(job3.getName() == "Product tester");
        Assertions.assertTrue(job3.getEmployer().toString().equals("ACME"));
        Assertions.assertTrue(job3.getLocation().toString().equals("Desert"));
        Assertions.assertTrue(job3.getPositionType().toString().equals("Quality control"));
        Assertions.assertTrue(job3.getCoreCompetency().toString().equals("Persistence"));
        System.out.println(job3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        Assertions.assertNotEquals(job1, job2);
    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assertions.assertTrue(job3.toString().contains("\n"));
    }

    @Test
    public void testToStringHasLabelsForEachField() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assertions.assertTrue(job3.toString().contains("ID: "));
        Assertions.assertTrue(job3.toString().contains("Name: "));
        Assertions.assertTrue(job3.toString().contains("Employer: "));
        Assertions.assertTrue(job3.toString().contains("Location: "));
        Assertions.assertTrue(job3.toString().contains("Position Type: "));
        Assertions.assertTrue(job3.toString().contains("Core Competency: "));

    }

    @Test
    public void testToStringDataNotAvailable() {
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
        Assertions.assertTrue((job3.toString().contains("Data not available")));
    }
}
