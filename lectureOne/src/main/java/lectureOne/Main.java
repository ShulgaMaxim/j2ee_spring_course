package lectureOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        new ClassPathXmlApplicationContext("/beans.xml");
    }

}
