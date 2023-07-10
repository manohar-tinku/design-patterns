package com.pov.design.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    @Test
    public void testGetInstanceMethod(){
        GameManager gameManager1=GameManager.getInstance();
        GameManager gameManager2=GameManager.getInstance();
        Assertions.assertEquals(gameManager1,gameManager2);
    }
}
