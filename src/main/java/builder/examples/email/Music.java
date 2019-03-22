package builder.examples.email;

import java.util.Optional;
public  class Music extends CommonModule{

public Music() {
    super.moduleName = "音乐";
}

@Override
public String showInfo(String info) {
    return Optional.ofNullable(info).orElse("music : 新年好呀，新年好呀，祝贺大家新年好\n");
}

}
