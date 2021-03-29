package com.example.veriornek;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Utiliyt {
    public static void setNextActivity(Context context, Class<?> cls){
        Intent intent=new Intent(context,cls);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
    public static void showMessage(Context context, String message, boolean isShortMessage) {
        if (isShortMessage) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

}
