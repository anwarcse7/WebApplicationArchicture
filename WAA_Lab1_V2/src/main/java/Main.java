import waa.MyAutowired;
import waa.MyInjector;
import waa.university.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("-----");
        MyInjector myInjector = new MyInjector();
        myInjector.scanForBean();
        System.out.println("----");
        System.out.println(myInjector.getBean(Course.class));
    }
}
