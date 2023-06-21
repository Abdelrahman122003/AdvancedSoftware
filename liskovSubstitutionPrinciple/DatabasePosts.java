package liskovSubstitutionPrinciple;

public class DatabasePosts {
    public void addMentionPost(){
        System.out.println("Mention post");
    }
    public void addPost(){
        
        System.out.println("Normal post");
    }
    public void addTagPost(){
        
        System.out.println("Tag post");
    }
    public void addLinkedPost(){

        System.out.println("Linked post");
    }
}
