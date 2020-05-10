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
        assertFalse(test_jobOne.getId() == test_jobTwo.getId());
        assertTrue(test_jobTwo.getId() == test_jobOne.getId()+1);
    }
    @Test
    public void testJobConstructorSetAllFields() {
        assertTrue(test_jobOne instanceof Job);
        assertEquals(1, test_jobOne.getId(),.001);
        assertEquals("Product tester", test_jobOne.getEmployer());
        //assertEquals("ACME", test_jobOne.getEmployer());
        //assertEquals("Desert", test_jobOne.getLocation());
        //assertEquals("Quality control", test_jobOne.getPositionType());
        //assertEquals("Persistence", test_jobOne.getCoreCompetency());
    }
}
