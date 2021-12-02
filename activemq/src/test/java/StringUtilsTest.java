import org.springframework.util.StringUtils;

/**
 * @author kq
 * @date 2021-12-02 16:05
 * @since 2020-0630
 */
public class StringUtilsTest {

    public static void main(String[] args) {

        // 第一个参数明确有值的情况下，报了异常，导致SrpingBoot启不动
        String[] str = StringUtils.split("localhost",",");

        System.out.println(str.length);


    }

}
