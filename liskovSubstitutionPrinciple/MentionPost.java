package liskovSubstitutionPrinciple;

public class MentionPost implements Post{
        public void createPost(DatabasePosts d, String post){
        d.addMentionPost();
    }
    
}
