package com.adarsh.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class UserServiceVerifyTest {

    @Test
    void testVerifyInteraction() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Hello Mockito");

        UserService service = new UserService(mockApi);

        // Act
        String result = service.fetchData();

        // Assert
        assertEquals("Hello Mockito", result);

        // Verify interaction
        verify(mockApi).getData();
    }
}