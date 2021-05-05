package com.example.demo.thought;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ThoughtService {

	private final ThoughtRepository thoughtRepository;

	@Autowired
	public ThoughtService(ThoughtRepository thoughtRepository){
		this.thoughtRepository = thoughtRepository;
	}

    public List<Thought> getThoughts(){
		return thoughtRepository.findAll();
	}

	public void addNewThought(Thought thought) {
		//Optional<Thought> thoughtOptional = thoughtRepository.findThoughtByText(thought.getThoughtText());
		//if(thoughtOptional.isPresent()){
		//	throw new IllegalStateException("Thought is already in the database");
		//}

		thoughtRepository.save(thought);
	}

	public void deleteThought(Long thoughtId) {
		boolean exists = thoughtRepository.existsById(thoughtId);
		if(!exists){
			throw new IllegalStateException("Thought with id" + thoughtId + "does not exist");
		}
		thoughtRepository.deleteById(thoughtId);
	}

	@Transactional
    public void updateThought(Long id, String thoughtText) {
		Thought thought = thoughtRepository.findById(id).orElseThrow(() -> new IllegalStateException());
		
		if(thought != null && thoughtText.length() > 0 && !thoughtText.equals(thought.getThoughtText())){
			thought.setThoughtText(thoughtText);
		}
    }
	
}