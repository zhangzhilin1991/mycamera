/**
  * Generated by smali2java 1.0.0.558
  * Copyright (C) 2013 Hensence.com
  */

package com.caihua.camera;

import android.os.Environment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilApp {
    public static final String BOOL_ROTATE_INTENT = "isRotate";
    public static final int CAMERA_TAKE_PHOTO = 0x4;
    public static final int CAMERA_TAKE_PHOTO_2 = 0x3ea;
    public static final int CAMERA_TAKE_PHOTO_3 = 0xd;
    public static final int CAMERA_TAKE_PHOTO_DATA_OK = 0xb;
    public static final int CAMERA_TAKE_PHOTO_ERROR = 0x9;
    public static final int CAMERA_TAKE_PHOTO_OK = 0xa;
    public static final String COLOR_TIP_INTENT = "color";
    public static final String CONTENT_TIP_INTENT = "tip";
    public static final String ISRECOGNALL = "ISRECOGNALL";
    public static final int LOAD_PIC = 0x8;
    public static final int ONLY_AUTOFOCUS = 0x6;
    public static final int RECOGN_FAIL = 0x3;
    public static final int RECOGN_LINE_IN_RECT = 0x7;
    public static final int RECOGN_LINE_NULL = 0x64;
    public static final int RECOGN_OK = 0x2;
    public static final int RECOGN_TAKE_PIC_OK_2 = 0xe;
    public static final int RESULT_CODE = 0xc8;
    public static final String RESULT_KEY = "id_card_info";
    public static final int RESULT_TYPE_BLUR = 0x4;
    public static final int RESULT_TYPE_NO_IDCARD = 0x2;
    public static final int RESULT_TYPE_NO_INRECT = 0x3;
    public static final int RESULT_TYPE_OK = 0x1;
    public static final int RESULT_TYPE_RECONG_FAIL = 0x5;
    public static final int RESULT_TYPE_START_TAKE_PHOTO = 0x6;
    public static final String SIZE_TIP_INTENT = "size";
    public static final int START_AUTOFOCUS = 0x5;
    public static final String WIDTH_TIP_INTENT = "width";
    private static final String SDCARD_ROOT_PATH = Environment.getExternalStorageDirectory().getPath();
    
    static {
    }
    private static final String SDCARD_PATH = "/ccIdCard/trandata/big";
    private static final String MANAGE_FOLDER = "/ccIdCard/tempImgs";
    private static final String CCTEST_FOLDER = "/ccIdCard/testImgs";
    private static final String CCID_FOLDER = "/ccIdCard";
    
    public static String completeManagePath() {
        return MANAGE_FOLDER;
    }
    
    public static String getSdcDir() {
        return SDCARD_PATH;
    }
    
    public static String getTestImgs() {
        return CCTEST_FOLDER;
    }
    
    public static String getCCIDFOLDER() {
        return CCID_FOLDER;
    }
    
    private static String getTime(String format) {
        SimpleDateFormat timeStampFormat = new SimpleDateFormat(format);
        return timeStampFormat.format(new Date());
    }
    
    public static String newHeadPath() {
        return "/" + getTime("yyMMddHHmmssSSS") + ".bmp";
    }
}