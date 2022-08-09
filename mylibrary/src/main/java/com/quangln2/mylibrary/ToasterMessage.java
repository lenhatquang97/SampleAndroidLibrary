package com.quangln2.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void showToast(Context ctx, String message){
        Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
    }
}
