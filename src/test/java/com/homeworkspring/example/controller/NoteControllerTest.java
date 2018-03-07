//package com.homeworkspring.example.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.homeworkspring.example.document.Note;
//import com.homeworkspring.example.repository.NoteRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.*;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.Matchers.hasSize;
//import static org.hamcrest.core.Is.is;
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//public class NoteControllerTest {
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private NoteRepository noteRepository;
//
//    @InjectMocks
//    private NoteController noteController;
//
//    @Before
//    public void init(){
//        MockitoAnnotations.initMocks(this);
//        mockMvc = MockMvcBuilders
//                .standaloneSetup(noteController)
//                .build();
//    }
//
//    @Test
//    public void testGetAll() throws Exception {
//        Note note1 = new Note();
//        note1.setId("1");
//        note1.setDate(new Date().toString());
//        note1.setText("Text1");
//        note1.setUser("User1");
//        Note note2 = new Note();
//        note2.setId("2");
//        note2.setDate(new Date().toString());
//        note2.setText("Text2");
//        note2.setUser("User2");
//        List<Note> notes = Arrays.asList(note1, note2);
//        when(noteRepository.findAll()).thenReturn(notes);
//        mockMvc.perform(get("/note"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
//                .andExpect(jsonPath("$", hasSize(2)))
//                .andExpect(jsonPath("$[0].id", is("1")))
//                .andExpect(jsonPath("$[0].text", is("Text1")))
//                .andExpect(jsonPath("$[0].user", is("User1")))
//                .andExpect(jsonPath("$[1].id", is("2")))
//                .andExpect(jsonPath("$[1].text", is("Text2")))
//                .andExpect(jsonPath("$[1].user", is("User2")));
//        verify(noteRepository, times(1)).findAll();
//        verifyNoMoreInteractions(noteRepository);
//    }
//
//    @Test
//    public void testGetById() throws Exception {
//        Note note1 = new Note();
//        note1.setId("1");
//        note1.setDate(new Date().toString());
//        note1.setText("Text1");
//        note1.setUser("User1");
//
//        when(noteRepository.findById("1")).thenReturn(note1);
//
//        mockMvc.perform(get("/note/{id}", 1))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
//                .andExpect(jsonPath("$.id", is("1")))
//                .andExpect(jsonPath("$.text", is("Text1")))
//                .andExpect(jsonPath("$.user", is("User1")));
//
//        verify(noteRepository, times(1)).findById("1");
//        verifyNoMoreInteractions(noteRepository);
//    }
//
//    // =========================================== Create New User ========================================
//
//    @Test
//    public void testInsert() throws Exception {
//        Note note1 = new Note();
//        note1.setId("1");
//        note1.setDate(new Date().toString());
//        note1.setText("Text1");
//        note1.setUser("User1");
//
//        mockMvc.perform(
//                post("/note")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(asJsonString(note1)))
//                .andExpect(status().isOk());
//
//    }

//}