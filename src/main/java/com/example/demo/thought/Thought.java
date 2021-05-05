package com.example.demo.thought;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Thought {
    @Id
    @SequenceGenerator(
        name = "thought_sequence",
        sequenceName = "thought_sequence",
        allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "thought_sequence"
    )

    private Long id;
    private String thoughtText;
    private LocalDate dateOfInput;
    private Integer upvote;
    private Integer downvote;
    private Integer gibberish;

    public Thought(){

    }

    public Thought(Long id,
        String thoughtText,
        LocalDate dateOfInput,
        Integer upvote,
        Integer downvote,
        Integer gibberish){

        this.id = id;
        this.thoughtText = thoughtText;
        this.dateOfInput = dateOfInput;
        this.upvote = upvote;
        this.downvote = downvote;
        this.gibberish = gibberish;
    }

    public Thought(String thoughtText,
    LocalDate dateOfInput,
    Integer upvote,
    Integer downvote,
    Integer gibberish){

        this.thoughtText = thoughtText;
        this.dateOfInput = dateOfInput;
        this.upvote = upvote;
        this.downvote = downvote;
        this.gibberish = gibberish;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getThoughtText(){
        return thoughtText;
    }

    public void setThoughtText(String thoughtText){
        this.thoughtText = thoughtText;
    }
    
    public LocalDate getDateOfInput(){
        return dateOfInput;
    }

    public void setDateOfInput(LocalDate dateOfInput){
        this.dateOfInput = dateOfInput;
    }

    public Integer getUpvote(){
        return upvote;
    }

    public void setUpvote(Integer upvote){
        this.upvote = upvote;
    }
    
    public Integer getDownvote(){
        return downvote;
    }

    public void setDownvote(Integer downvote){
        this.downvote = downvote;
    }
    
    public Integer getGibberish(){
        return gibberish;
    }

    public void setGibberish(Integer gibberish){
        this.gibberish = gibberish;
    }
    
    @Override
    public String toString(){
        return "Thought{" + 
                "id=" + id + 
                ", thought ='" + thoughtText + '\'' +
                ", date ='" + dateOfInput + '\'' +
                ", upvote ='" + upvote + '\'' +
                ", downvote ='" + downvote + '\'' +
                ", gibberish ='" + gibberish + '\'' +
                '}';
    }
}
