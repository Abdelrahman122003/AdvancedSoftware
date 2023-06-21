package liskovSubstitutionPrinciple;

public class LinkedPost implements Post{
        public void createPost(DatabasePosts d, String post){
        d.addLinkedPost();
    }
}
