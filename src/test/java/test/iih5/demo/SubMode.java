package test.iih5.demo;

public class SubMode extends Mode {
    public SubMode(){
        TABLE="t_user";
    }



    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getAb() {
        return ab;
    }

    public void setAb(String ab) {
        this.ab = ab;
    }

    private String bb;
    private String ab;

}
