package com.cj.util.utils.toast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;



/**
 * Toast 本地封装
 * Created By CaiJing On 2022/10/19
 */
public class ToastUtil extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public ToastUtil(Context context) {
        super(context);
    }

    public static void Show(Context context,String msg){
        Toast.makeText(context, msg+"", Toast.LENGTH_SHORT).show();
    }
}
