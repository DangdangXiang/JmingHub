package club.jming.utils;

import java.util.UUID;

/**
 * @author 78289
 */
public class GenerateUtils {

    /**
     * 返回一个UUID
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
