/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package form;

import org.junit.jupiter.api.Test;

/**
 * @author ASUS
 */
public class koneksTest {
    @Test
    public void testGelAllItems() {
        DatabaseService instance = new DatabaseService();
        instance.getAllItems();
    }

    @Test
    public void testFindById() {
        DatabaseService instance = new DatabaseService();
        instance.findById("BRS");
    }

}
