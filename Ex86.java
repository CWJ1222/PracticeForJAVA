import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Ex86 {
    public static void main(String[] args) {
        try {
            // Person 클래스를 로드합니다.
            Class<?> personClass = Class.forName("Person");

            // 클래스 이름 출력
            System.out.println("Class name: " + personClass.getName());

            // 필드 정보 출력
            Field[] fields = personClass.getDeclaredFields();
            System.out.println("\nDeclared Fields:");
            for (Field field : fields) {
                System.out.println(field.getType().getName() + " " + field.getName());
            }

            // 메서드 정보 출력
            Method[] methods = personClass.getDeclaredMethods();
            System.out.println("\nDeclared Methods:");
            for (Method method : methods) {
                System.out.print(method.getReturnType().getName() + " ");
                System.out.print(method.getName() + "(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (int i = 0; i < parameterTypes.length; i++) {
                    System.out.print(parameterTypes[i].getName());
                    if (i < parameterTypes.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println(")");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
