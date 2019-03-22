package template_method.examples;

public class Client {
    public static void main(String[] args){
        DriveTemplate template = new SuzukiStrom1000();
        //DriveTemplate template = new SuzukiScross();
        template.drive();
    }
}
