public class Name {
    
    private String title;
    
    private String givenName;
    
    private String initials;
    
    private String familyName;
    
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getGivenName() {
        return givenName;
    }
    
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    
    public void setInitials(String initials) {
        this.initials = initials;
    }
    
    public String getFamilyName() {
        return familyName;
    }
    
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    
    public String toString() {
        return title + " " + givenName + " " + initials + " " + familyName;
    }
    
}