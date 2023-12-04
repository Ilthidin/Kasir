/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package form;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author ASUS`
 */
public class koneksNGTest {

    public koneksNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUpMethod() throws Exception {
    }

    @AfterEach
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getkoneks method, of class koneks.
     */
    @Test
    public void testGetkoneks() {
        System.out.println("getkoneks");
        DatabaseService instance = new DatabaseService();
        instance.getAllItems();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}