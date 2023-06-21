package liskovSubstitutionPrinciple;

public class NormalPost implements Post {
    public void createPost(DatabasePosts d, String post){
        d.addPost();
    }
}
