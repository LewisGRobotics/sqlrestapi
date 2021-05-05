package com.example.demo.thought;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/thought")
public class ThoughtController {

    private final ThoughtService thoughtService;

    @Autowired
    public ThoughtController(ThoughtService thoughtService){
        this.thoughtService = thoughtService;
    }

	@GetMapping
	public List<Thought> getThoughts(){
		return thoughtService.getThoughts();
	}

    @PostMapping
    public void registerNewThought(@RequestBody Thought thought){
        thoughtService.addNewThought(thought);
    }

    @DeleteMapping(path = "{thoughtId}")
    public void deleteThought(@PathVariable("thoughtId") Long thoughtId){
        thoughtService.deleteThought(thoughtId);
    }

    @PutMapping(path = "{thoughtId}")
	public void updateThought(
        @PathVariable("thoughtId") Long thoughtId, 
        @RequestParam(required = false) String thoughtText){
        thoughtService.updateThought(thoughtId, thoughtText);
	}
}
