/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.kahoot.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import org.springframework.test.web.servlet.MockMvc;

import org.springframework.web.context.WebApplicationContext;
import pe.edu.upeu.kahoot.BaseTestConfig;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 *
 * @author Alumno
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = BaseTestConfig.class)
public class IndexControllerTest {
    
    @Autowired
    private WebApplicationContext wac;
    
    private MockMvc movMvc;
    
    @Before
    public void init(){
        movMvc=MockMvcBuilders.webAppContextSetup(wac).build();
    }
    
    @Test
    public void testPaginaPrincipal() throws Exception{
        movMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("login"));
    }
    
}
