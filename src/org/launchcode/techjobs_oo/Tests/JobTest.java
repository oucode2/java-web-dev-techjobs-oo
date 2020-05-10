package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.launchcode.techjobs_oo.Main;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;


public class JobTest {
    Job test_jobOne;
    Job test_jobTwo;

    @Before
    public void createCarObject() {
        test_jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_jobTwo = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
    }
    @Test
    public void testSettingJobId() {
        System.out.println(test_jobOne.getId());
        System.out.println(test_jobTwo.getId());
        assertFalse(test_jobOne.getId() == test_jobTwo.getId());
    }
}
