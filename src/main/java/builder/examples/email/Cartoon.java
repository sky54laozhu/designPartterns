package builder.examples.email;

import java.util.Optional;

public class Cartoon extends CommonModule{

public Cartoon() {
    super.moduleName = "动画效果";
}

@Override
public String showInfo(String info) {
    return Optional.ofNullable(info).orElse("动画，我是动画\n");
}

}