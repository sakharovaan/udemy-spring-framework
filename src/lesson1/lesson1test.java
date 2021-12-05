package lesson1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson1test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        lesson1 l1 = context.getBean("l1", lesson1.class);
        l1.say();

        lesson1b l1b = context.getBean("l1b", lesson1b.class);
        l1b.l1.say();
        l1b.zulu();

        context.close();
    }
}
