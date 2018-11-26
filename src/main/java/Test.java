import org.apache.log4j.Logger;
import sun.applet.Main;

/**
 * Created by win7 on 2018/11/26.
 */
public class Test {

    private static Logger logger = Logger.getLogger(Test.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println("This is println message.");

        // 记录debug级别的信息
        logger.debug("这是一个bug");
        // 记录info级别的信息
        logger.info("这是一个情报");
        // 记录error级别的信息
        logger.error("这是个错误");
    }

}
