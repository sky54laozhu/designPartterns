package builder.examples.email;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional ofOptional = Optional.of("zhangsan");
        System.out.println(ofOptional.get());
        Optional nullOfOptional = Optional.ofNullable(null);
        System.out.println(nullOfOptional.toString());
        //创建一个空的String类型的Optional对象
        Optional<String> emptyOptional1 = Optional.empty();
        System.out.println(emptyOptional1.toString());


        Optional<String> stringOptional = Optional.of("张三");
        System.out.println(stringOptional.orElse("zhangsan"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.orElse("李四"));

        Optional<String> stringOptional2 = Optional.of("张三");
        System.out.println(stringOptional2.orElseGet(() -> "zhangsan"));

        Optional<String> emptyOptional3 = Optional.empty();
        System.out.println(emptyOptional3.orElseGet(() -> "orElseGwwwet"));


//        Optional<String> stringOptional4 = Optional.of("张三");
//        System.out.println(stringOptional4.orElseThrow(CustomException::new));
//
//        Optional<String> emptyOptional5 = Optional.empty();
//        System.out.println(emptyOptional5.orElseThrow(CustomException::new));

        Optional<String> stringOptional6 = Optional.of("zhangsan");
        System.out.println(stringOptional6.filter(e -> e.length() > 5).orElse("王五"));
        stringOptional = Optional.empty();
        System.out.println(stringOptional.filter(e -> e.length() > 5).orElse("lisi"));

        //map方法执行传入的lambda表达式参数对Optional实例的值进行修改,修改后的返回值仍然是一个Optional对象
        Optional<String> stringOptional7 = Optional.of("zhangsan");
        System.out.println(stringOptional7.map(e -> e.toUpperCase()).orElse("失败"));

        stringOptional = Optional.empty();
        System.out.println(stringOptional.map(e -> e.toUpperCase()).orElse("失败"));

        //map方法中的lambda表达式返回值可以是任意类型，在map函数返回之前会包装为Optional。
        //但flatMap方法中的lambda表达式返回值必须是Optionl实例
        Optional<String> stringOptional8 = Optional.of("zhangsan");
        System.out.println(stringOptional8.flatMap(e -> Optional.of("lisi")).orElse("失败"));

        stringOptional = Optional.empty();
        System.out.println(stringOptional.flatMap(e -> Optional.empty()).orElse("失败"));

        //ifPresent方法的参数是一个Consumer的实现类，Consumer类包含一个抽象方法，该抽象方法对传入的值进行处理，只处理没有返回值。
        Optional<String> stringOptional9 = Optional.of("zhangsan");
        stringOptional9.ifPresent(e-> System.out.println("我被处理了。。。"+e));

        StringBuilder sb = new StringBuilder();
    }

    private static class CustomException extends RuntimeException {
        private static final long serialVersionUID = -4399699891687593264L;

        public CustomException() {
            super("自定义异常");
        }

        public CustomException(String message) {
            super(message);
        }
    }
}
