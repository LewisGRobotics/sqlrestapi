package com.example.demo.thought;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ThoughtRepository extends JpaRepository<Thought, Long>{

    //@Query("SELECT s FROM Thought s WHERE s.upvotes > ?1")
    //Optional<Thought> findThoughtByUpvotes(Integer upvotes);

    
    //@Query("SELECT s FROM Thought s WHERE s.thought_text = ?1")
    //Optional<Thought> findThoughtByText(String text);
}
