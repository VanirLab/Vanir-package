
public class vanirSecurity extends Application {
 
 private static int VANIR_LOW = 0;
  private static int VANIR_MEDIUM = 1;
   private static int VANIR_HIGH = 2;
    private static int VANIR_EXTREME = 3;
 
 public static final boolean VANIR_MODE_DISABLED = false;
 public static final boolean VANIR_MODE_ENABLED = true;
 
 
 
 @Override
 public final void onCreate() {
 
 super.onCreate();
 
 if (VANIR_MODE_ENABLED) {
 StrictMode.enableDefaults();
 }
 if (VANIR_MODE_DISABLED) {
 StrictMode.disableDefaults();
 }
 
 }
 
 
}