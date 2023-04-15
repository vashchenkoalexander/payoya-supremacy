package payoya.com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @Column(name = "userId")
    private Integer userId;

    public Post(){}

    public Post(String title, String body){
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body, Integer userId){
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public Long getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public String getBody(){
        return this.body;
    }

    public void setBody(String body){
        this.body = body;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return this.userId;
    }



}
