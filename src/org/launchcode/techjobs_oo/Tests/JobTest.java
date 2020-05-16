package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;


public class JobTest {
    Job test_jobOne;
    Job test_jobTwo;
    Job test_jobThree;

    @Before
    public void createCarObject() {
        test_jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_jobTwo = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        test_jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
   public void testSettingJobId() {
        assertFalse(test_jobOne.getId() == test_jobTwo.getId());
        assertTrue(test_jobTwo.getId() == test_jobOne.getId() + 1);
    }

    @Test
    public void testJobConstructorSetAllFields() {
        assertTrue(test_jobOne instanceof Job);
        assertEquals("Product tester", test_jobOne.getName());
        assertEquals("ACME", test_jobOne.getEmployer().getValue());
        assertEquals("Desert", test_jobOne.getLocation().getValue());
        assertEquals("Quality control", test_jobOne.getPositionType().getValue());
        assertEquals("Persistence", test_jobOne.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {

        assertFalse(test_jobOne == test_jobThree);

    }

    @Test
    public void testToStringForBlankLines()  {
        assertTrue(test_jobOne.toString().startsWith("\r\n"));
        assertTrue(test_jobOne.toString().endsWith("\r\n"));
    }

    @Test
    public void testToStringForIdLine()  {
        assertTrue(test_jobOne.toString().contains("ID: " + test_jobOne.getId()));
    }

    @Test
    public void testToStringForName()  {
        assertTrue(test_jobOne.toString().contains("Name: " + test_jobOne.getName()));
    }

    @Test
    public void testToStringForEmployer()  {
        assertTrue(test_jobOne.toString().contains("Employer: " + test_jobOne.getEmployer()));
    }

    @Test
    public void testToStringForLocation()  {
        assertTrue(test_jobOne.toString().contains("Location: " + test_jobOne.getLocation()));
    }

    @Test
    public void testToStringForPositionType()  {
        assertTrue(test_jobOne.toString().contains("Position Type: " + test_jobOne.getPositionType()));
    }

    @Test
    public void testToStringForCoreCompetency()  {
        assertTrue(test_jobOne.toString().contains("Core Competency: " + test_jobOne.getCoreCompetency()));
    }
}