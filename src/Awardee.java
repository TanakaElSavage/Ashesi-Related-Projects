public class Awardee {
    //Data Fields
    private String fullName;
    private AwardCategory category;
    private String awardName;

    //Default constructor
    public Awardee(){
        this.fullName= "TBD";
        this.category= null;
        this.awardName="TBD";
    }
    //Constructor initialising all data fields
    public Awardee ( String fullName, AwardCategory category, String awardName ) {
        this.fullName = fullName;
        this.category = category;
        this.awardName = awardName;
    }
    //Accessors

    public String getFullName() {
        return fullName;
    }

    public AwardCategory getCategory() {
        return category;
    }

    public String getAwardName() {
        return awardName;
    }
    //Mutators

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCategory(AwardCategory category) {
        this.category = category;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
    //Receiver Acceptance Speech Method
    public String acceptanceSpeech() {
        return "I "+ fullName + " am so honored to receive the " + awardName + " award. I would like to thank " +
                "everyone.";
    }
    //toString Method Overriding
    public String toString(){
        return "Awardee : " + fullName +
                "\nAward Category : " + category +
                "\nAward : " + awardName;
    }
}
