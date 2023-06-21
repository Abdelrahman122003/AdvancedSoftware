package liskovSubstitutionPrinciple;

public class TagPost implements Post{
        public void createPost(DatabasePosts d, String post){
        d.addTagPost();
    }
}
