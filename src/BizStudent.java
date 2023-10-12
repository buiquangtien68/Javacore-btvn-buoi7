public class BizStudent extends TechMasterStudent{
    private double markettingScore;
    private double salesScore;

    public BizStudent(String name, String majors, double markettingScore, double salesScore) {
        super(name, majors);
        this.markettingScore = markettingScore;
        this.salesScore = salesScore;
    }

    @Override
    public double getScore() {
        return (2*markettingScore+salesScore)/3;
    }
}
