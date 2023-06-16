package Utils;

import static java.lang.Thread.sleep;

public class UtilsForProject {


    public void pause(long msec){
        try {
            sleep(msec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
