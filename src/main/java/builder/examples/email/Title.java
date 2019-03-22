package builder.examples.email;

import java.util.Optional;

public class Title extends CommonModule{

public Title() {
    super.moduleName = "标题";
}

@Override
public String showInfo(String info) {
    return Optional.ofNullable(info).orElse("title:【拜年】 \n");
}

}