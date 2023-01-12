package guru.springframework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;



@WebMvcTest(IndexController.class)
public class IndexControllerTest {
    
    @MockBean
    IndexController indexController;
    
    MockMvc mockMvc;

    @BeforeEach
    void setUp(){
        this.mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
    }

    @Test
    @DisplayName("index page request")
    void testGetIndexPage() throws Exception {        
        mockMvc
            .perform(MockMvcRequestBuilders.get("/index"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
