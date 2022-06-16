//package org.jointheleague.level7.cheetah.presentation;
//
//import org.jointheleague.level7.giraffe2.presentation.LocController;
//import org.jointheleague.level7.giraffe2.repository.dto.Result;
//import org.jointheleague.level7.giraffe2.service.LocService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.Collections;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.when;
//
//public class LocControllerTest {
//    private LocController locController;
//
//    @Mock
//    private LocService locService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//
//        locController = new LocController(locService);
//    }
////needs to be modified for new api
//    @Test
//    void givenGoodQuery_whenGetResults_thenReturnListOfResults() {
//        //given
//        String query = "Java";
//        Result result = new Result();
//        result.setTitle("TITLE");
//        result.setSubtitle("SUBTITLE");
//        result.setBodyText("BODY TEXT");
//        Result expectedResult = result;
//
//        when(locService.getResults(query))
//                .thenReturn(String.valueOf(expectedResult));
//
//        //when
//        String actualResults = locController.getResults(query);
//
//        //then
//        assertEquals(expectedResult, actualResults);
//    }
//    @Test
//    void givenBadQuery_whenGetResults_thenThrowsException() {
//        //given
//        String query = "Java";
//
//        //when
//        //then
//        Throwable exceptionThrown = assertThrows(ResponseStatusException.class, () -> locController.getResults(query));
//        assertEquals(exceptionThrown.getMessage(), "404 NOT_FOUND \"Result(s) not found.\"");
//    }
//}
