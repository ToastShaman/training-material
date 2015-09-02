package example01;

import java.util.logging.Logger;

public class VariousCodeSmells {

    private final static Logger log = Logger.getLogger(VariousCodeSmells.class.getName());

    public static double PI = 22/7;

    /**
     * @param input
     * @param isRadius
     * @return
     */
    public void circumference(double input, boolean isRadius, double[] ret) {
        try {
            if (ret.length == 2) {
                log.info("START circumference()");
                log.info("input: " + input);
                log.info("isRadius: " + isRadius);
                double result = 0;
                if (isRadius) {
                    log.info("Using radius formula");
                    result = PI * 2 * input;
                } else {
                    log.info("Using diameter formula");
                    result = PI * 2 * (input / 2);
                }
                log.info("END circumference()");
                ret[0] = input;
                ret[1] = result;
            }
        } catch (NullPointerException e) {
            log.warning(e.getMessage());
            ret = new double[2];
            ret[0] = -1;
            ret[1] = -1;
        }
    }

    public static void main(String[] args) {
        VariousCodeSmells codeSmells = new VariousCodeSmells();
        double[] result = new double[2];

        codeSmells.circumference(2, false, result);
        System.out.println(result[1]);

        codeSmells.circumference(2, true, result);
        System.out.println(result[1]);
        System.out.println("========================================");

        VariousCodeSmells.PI = 3.1;
        codeSmells.circumference(2, false, result);
        System.out.println(result[1]);

        codeSmells.circumference(2, true, result);
        System.out.println(result[1]);
        System.out.println("========================================");

        codeSmells.circumference(2, false, null);
        System.out.println(result[1]);
    }
}
