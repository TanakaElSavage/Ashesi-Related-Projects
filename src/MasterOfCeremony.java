public class MasterOfCeremony {
    //Data Fields
    private String mcName;
    private String scriptSegment;
    private boolean onStage;

    //Constructor initialising all parameters
    public MasterOfCeremony ( String mcName, String scriptSegment, boolean onStage ) {
        this.mcName = mcName;
        this.scriptSegment = scriptSegment;
        this.onStage = onStage;
    }
    //Getter Methods

    public String getMcName() {
        return mcName;
    }

    public String getScriptSegment() {
        return scriptSegment;
    }
    public boolean getOnStage(){
        return onStage;
    }

    //Setter Methods

    public void setMcName(String mcName) {
        this.mcName = mcName;
    }

    public void setScriptSegment(String scriptSegment) {
        this.scriptSegment = scriptSegment;
    }

    public void setOnStage(boolean onStage) {
        this.onStage = onStage;
    }
    //Method that checks whether the MC is already on stage or not
    public String goToStage () {
        if (this.onStage) {
            return "Mc " + mcName + " on Stage";}
        else {
            return "Mc " + mcName + " is walking on to the stage ";
        }
    }
    //Methods for the MC Leaving the Stage
    public void leaveStage () {
        this.onStage = false ;
        System.out.println("The MC is leaving the Stage ");
    }

    //Method for MC reading his/her scriptSegment
    public String readScript () {
        if (onStage) {
            return mcName + " reads \"" +scriptSegment + "\" ";
        }else{
            return mcName + " \nthe MC is not on stage and cannot read the script";
        }

    }
    //toString method Overriding
    public String toString () {
        String onStageStatus = (onStage) ? "On Stage " : " Off Stage";
        return "MC + " + mcName + " (" + onStageStatus + " )\n" +
                " Current Script : \"" + scriptSegment + "\" \n";
    }
}
