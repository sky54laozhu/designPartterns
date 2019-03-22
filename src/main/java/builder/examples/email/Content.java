package builder.examples.email;

import java.util.Optional;

public class Content extends CommonModule{

public Content() {
    super.moduleName = "正文";
}

@Override
public String showInfo(String info) {
     return Optional.ofNullable(info).orElse("content : 新年快乐，666 \n") ;
}

}