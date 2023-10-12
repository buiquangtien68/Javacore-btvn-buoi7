public abstract class TechMasterStudent {
    private String name;
    private String majors;

    public TechMasterStudent(String name, String majors) {
        this.name = name;
        this.majors = majors;
    }

    public abstract double getScore();
    public String getClassify(){
        if (getScore()<5)
            return "Yếu";
        else if(getScore()>=5 && getScore()<6.5)
            return "Trung bình";
        else if (getScore()>=6.5 && getScore()<7.5)
            return "Khá";
        else return "Giỏi";
    };

    public void output(){
        System.out.println("Tên của sinh viên: "+name);
        System.out.println("Ngành học: "+majors);
        System.out.println("Điểm của sinh viên: "+getScore());
        System.out.println("Học lực của sinh viên: "+getClassify());
    }

}
