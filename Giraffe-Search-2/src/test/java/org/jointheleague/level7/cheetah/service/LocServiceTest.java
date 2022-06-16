//package org.jointheleague.level7.cheetah.service;
//
//import org.jointheleague.level7.giraffe2.repository.LocRepository;
//import org.jointheleague.level7.giraffe2.repository.dto.Result;
//import org.jointheleague.level7.giraffe2.service.LocService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.Collections;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//class LocServiceTest {
//
//    private LocService locService;
//
//    @Mock
//    private LocRepository locRepository;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//
//        locService = new LocService(locRepository);
//    }
////test must be changed for the other api /!\
//    @Test
//    void whenGetResults_thenReturnListOfResults() {
//        //given
//        String query = "Java";
//        Result result = new Result();
//        result.setTitle("TITLE");
//        result.setSubtitle("LINK");
//        result.setBodyText("BODY TEXT");
//        Result expectedResults = result;
//
//        when(locRepository.getResults(query))
//                .thenReturn(String.valueOf(expectedResults));
//
//        //when
//        String actualResults = locService.getResults(query);
//
//        //then
//        assertEquals(expectedResults, actualResults);
//    }
//
//}