package org.ufv.demo.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {
    @Test
    public void suma3att1Test(){
        // Arrange
        int esperado=8;
        Demo d = new Demo(5,"Hola");
        // Act
        int result = d.suma3att1();
        // Assert
        assertEquals(esperado,result);
    }
}
