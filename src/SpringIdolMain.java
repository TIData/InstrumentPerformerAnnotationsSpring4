
import domain.TalentCompetition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"spring-idol.xml"});
        TalentCompetition competition =
                context.getBean("springIdol", TalentCompetition.class);
        competition.run();

    }
}
