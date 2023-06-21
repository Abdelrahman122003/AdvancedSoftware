package liskovSubstitutionPrinciple;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
    //** to Achieve liskov Substitution Principle
    // we have a post class that contains many class of posts tag post, mention post, ......
    // and we need to create with specific implementation of post without modified in general 
    // post class 
    Post p;
    ArrayList<String> posts = new ArrayList<>();
    DatabasePosts data = new DatabasePosts();
    String tagPost = "#post";
    String mentionPost = "@Mention";
    String linkedPost = "httpPost";
    String normalPost = "normal post";
    posts.add(linkedPost);
    posts.add(tagPost);
    posts.add(normalPost);
    posts.add(mentionPost);
    for(int i = 0; i < posts.size(); i++){
        if(posts.get(i).startsWith("#")){
        p = new TagPost();
        p.createPost(data, tagPost);
        }
        else if(posts.get(i).startsWith("@")){
            p = new MentionPost();
            p.createPost(data, mentionPost);
        }
        else if(posts.get(i).startsWith("http")){
            p = new LinkedPost();
            p.createPost(data, linkedPost);
        }
        else{
            p = new NormalPost();
            p.createPost(data, normalPost);
        }
    }
}
}
