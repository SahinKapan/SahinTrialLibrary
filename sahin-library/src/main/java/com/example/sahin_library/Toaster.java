package com.example.sahin_library;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static  void simpleToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    public static int findFaktor(int number){
        if(number == 0) return 0;
        else {
            int result =1;
            for(int i = 1; i <= number;i++  ){
                result = result*i;
            }
            return result;
        }
    }
}
