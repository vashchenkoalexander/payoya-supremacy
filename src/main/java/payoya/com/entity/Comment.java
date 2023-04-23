package payoya.com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;

// TODO Create this class like other entity Implement OneToMany ONE Post TO MANY Comment, fields, Service,
//  Controller, Repository
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    @JsonBackReference
    private Post post;

    @Column(name = "comments_text")
    private String text;

    @Column(name = "time_of_comment")
    private LocalDateTime timeOfComment;

    public Comment(){}

    public void setText(String text){
        this.text= text;
    }

    public String getText(){
        return this.text;
    }

    public void setPost(Post post){
        this.post=post;
    }

    public Post getPost(){
        return this.post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimeOfComment() {
        return timeOfComment;
    }

    public void setTimeOfComment(LocalDateTime timeOfComment) {
        this.timeOfComment = timeOfComment;
    }
}
