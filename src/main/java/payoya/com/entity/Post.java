package payoya.com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "posts")
//TODO Like, Dislike, time when post was create, how to add image in db
//TODO Sort by likes, timeWhenPostWasCreated.
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    //
    private Integer likes;

    private Integer dislike;

    private LocalDateTime timeWhenPostWasCreated;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Comment> commentList;

    public Post(){}

    public Post(String title, String body){
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body, User user){
        this.title = title;
        this.body = body;
        this.user = user;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setBody(String body){
        this.body = body;
    }

    public String getBody(){
        return this.body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getCommentList(){
        return this.commentList;
    }

    public void setCommentList(List<Comment> commentList){
        this.commentList = commentList;
    }

    public LocalDateTime getTimeWhenPostWasCreated(){
        return this.timeWhenPostWasCreated;
    }

    public void setTimeWhenPostWasCreated(LocalDateTime localDateTime){
        this.timeWhenPostWasCreated = localDateTime;
    }

    public Integer getCountOfLikes(){
        return this.likes;
    }

    public void setCountOfLikes(Integer likes){
            this.likes = likes;
    }

    public Integer getCountOfDislikes(){
        return this.dislike;
    }

    public void setCountOfDislike(Integer dislike){
            this.dislike = dislike;
    }

}
