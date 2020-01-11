import by.factories.Body;
import by.factories.BodyFactory;
import by.factories.Head;
import by.factories.HeadFactory;

public class Main {

    public static void main(String[] args) {
        HeadFactory headFactory = new HeadFactory();
        Head head1 = headFactory.makePart();
        Head head2 = headFactory.makePart();
        Head head3 = headFactory.makePart();
        Head head4 = headFactory.makePart();
        BodyFactory bodyFactory = new BodyFactory();
        Body body1 = bodyFactory.makePart();
        Body body2 = bodyFactory.makePart();
        Body body3 = bodyFactory.makePart();
        Body body4 = bodyFactory.makePart();
        Robot robot1 = new Robot(body1, head1);
        Robot robot2 = new Robot(body2, head2);
        Robot robot3 = new Robot(body3, head3);
        Robot robot4 = new Robot(body4, head4);
        Robot.println(robot1);
        Robot.println(robot2);
        Robot.println(robot3);
        Robot.println(robot4);
    }
}