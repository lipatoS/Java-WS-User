package org.example.client;

import org.example.client.generated.UserService;
import org.example.client.generated.UserServiceImplService;
import org.example.client.generated.Gender;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {
    static UserServiceImplService service;
    static UserService userService;

    @BeforeAll
    static void setup(){
        service = new UserServiceImplService();
        userService = service.getUserServiceImplPort();
    }

    @Test
    void givenUserPhone_whenUserPhone222_thenUserIsAlex(){
        assertEquals("222-222",userService.findByName("Alex").getPhone());
    }
    @Test
    void givenUserAge_whenUserAge35_thenUserIsOlga(){
        assertEquals(35,userService.findByName("Olga").getAge());
    }
    @Test
    void givenUserGender_whenUserGenderMale_thenUserIsOleg(){
        assertEquals(Gender.MALE,userService.findByName("Oleg").getGender());
    }
}
