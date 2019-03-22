package template_method.examples;

public class SuzukiStrom1000 extends DriveTemplate {

    @Override
    protected void openDoor() {
        System.out.println("no door actually");
    }

    @Override
    protected void gear() {
        System.out.println("gear with foot");
    }

    @Override
    protected void brake() {
        System.out.println("brake with hand");
    }
}