public class ITStudent extends TechMasterStudent{
    private double javaScore;
    private double htmlScore;
    private double cssScore;

    public ITStudent(String name, String majors, double javaScore, double htmlScore, double cssScore) {
        super(name, majors);
        this.javaScore = javaScore;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
    }

    @Override
    public double getScore() {
        return (2*javaScore+htmlScore+cssScore)/4;
    }
}
