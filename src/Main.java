public class Main {
    public static void main(String[] args) {
        TechMasterStudent itStudent=new ITStudent("Tiến","IT",8,9,9);
        TechMasterStudent bizStudent=new BizStudent("Hoàng","Biz",3,4);

        itStudent.output();
        System.out.println();
        bizStudent.output();
    }
}
