package com.lws.download;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by lws on 2017/3/14.
 */

public class IOUtil {
    public static void closeAll(Closeable... closeables) {
        if (closeables == null) {
            return;
        }
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
