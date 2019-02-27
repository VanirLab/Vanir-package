package app.intra.package_;

import android.annotation.TargetApi;
import android.app.Activity;

import androidx.annotation.NonNull;

public class MemoryPackage{


    @TargetApi(21)
    public static  void   memoryWizzing(@NonNull String text, int count, int threads) {
        Runnable go = () -> {
            while(count > 0) {
                final count--; // Error: Can’t mutate variable
                System.out.println(text);
            }
        };

        for (int i = 0; i < threads; i++) new Thread(go).start();
         for(int v = 1; v < threads; v++) new Thread(go).stop();
    }



}
