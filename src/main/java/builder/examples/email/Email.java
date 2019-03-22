package builder.examples.email;

import java.util.ArrayList;
import java.util.List;

public class Email {

private List<Module> parts;

    public Email() {
        this.parts = new ArrayList<>(1 << 3);
    }

    public final void addComponent(Module module) {
        parts.add(module);
    }

    public void generateEmail() {
        parts.forEach(x -> System.out.println(x.showInfo(null)));
        System.out.println("==============================");
    }

}