package guru.springframework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp(){
        indexController = new IndexController();
    }

    @Test
    @DisplayName("index page request")
    void testGetIndexPage() {
        assertEquals("index", indexController.getIndexPage());
    }
}
