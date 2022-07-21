/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.javaunitest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author RAISA
 */

public class JavaUnitTest {
    
    @Test
    public void firstTestMethod(){
        Assertions.assertTrue(true);
    }
    
    @BeforeAll
    static void setupAll(){
        System.out.println("setupAll");
     
    }
    
    @BeforeEach
    void setup(){
        System.out.println("setup");
    }
    @AfterEach
    void teardown(){
        System.out.println("teardown");
    }
    
    @AfterAll
    static void teardownAll(){
        System.out.println("teardownAll");
            
    }
    
    
    //A tester
    @Test 
    void unTest(){
        System.out.print("un Test");
        Assertions.assertTrue(true);
    }
    
    @Test
    void unAutreTest(){
        System.out.print("Une autre class de test");
        Assertions.assertTrue(true);
    }
}

