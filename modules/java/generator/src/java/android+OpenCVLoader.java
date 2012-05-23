package org.opencv.android;

import android.content.Context;

/**
 * Helper class provides common initialization methods for OpenCV library
 */
public class OpenCVLoader
{
    /**
     * OpenCV Library version 2.4.x
     */
    public static final String OPEN_CV_VERSION_2_4 = "2.4";

    /**
     * Url for OpenCV Engine on Google Play (Android Market)
     */
    public static final String OPEN_CV_SERVICE_URL = "market://details?id=org.opencv.engine";

    /**
     * Load and initialize OpenCV library from current application package. Roughly it is analog of system.loadLibrary("opencv_java")
     * @return Return true is initialization of OpenCV was successful
     */
    public static boolean initStatic()
    {
        return StaticHelper.initOpenCV();
    }

    /**
     *  Load and initialize OpenCV library using OpenCV Engine service.
     * @param Version OpenCV Library version
     * @param AppContext Application context for connecting to service
     * @param Callback Object, that implements LoaderCallbackInterface for handling Connection status
     * @return Return true if initialization of OpenCV starts successfully
     */
    public static boolean initAsync(String Version, Context AppContext,
            LoaderCallbackInterface Callback)
    {
        return AsyncServiceHelper.initOpenCV(Version, AppContext, Callback);
    }
}
