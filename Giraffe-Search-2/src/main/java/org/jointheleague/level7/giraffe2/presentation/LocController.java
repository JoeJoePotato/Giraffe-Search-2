package org.jointheleague.level7.giraffe2.presentation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.jointheleague.level7.giraffe2.service.LocService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.jointheleague.level7.giraffe2.repository.dto.Result;

@RestController
public class LocController {

    private final LocService locService;

    public LocController(LocService locService) {
        this.locService = locService;
    }

    @GetMapping("/searchLocResults")
    @ApiOperation(value = "Searches for articles matching the search term",
            notes = "Response may include multiple Result values.",
            response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Result(s) found"),
            @ApiResponse(code = 404, message = "Result(s) not found")
    })
    public Result getResults(@RequestParam(value="q") String query){
        return locService.getResults(query);
    }


}
//test