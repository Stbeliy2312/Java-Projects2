import by.factories.Body;
import by.factories.Head;
import java.util.Random;

public class Robot {
    private final String name;
    private final Body body;
    private final Head head;

    public Robot(Body body, Head head) {
        this.body = body;
        this.head = head;

        Random ran = new Random();
        int top = 3;
        char data = ' ';
        String dat = "";
        for (int i = 0; i <= top; i++) {
            data = (char) (ran.nextInt(25) + 97);
            dat = data + dat;
        }
            this.name = dat;
    }

    public Body getBody() {
        return body;
    }

    public Head getHead() {
        return head;
    }

    @Override
    public String toString() {
        return "Robot '" + name + "' with " + body + " and " + head;
    }

    public static void println(Robot robot){
        System.out.println(robot);
    }

}

