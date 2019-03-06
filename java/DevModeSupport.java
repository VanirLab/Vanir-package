public class DevMode extends AppCompatActivity {


    public static final boolean DEVELOPER_MODE = true;

    public static final boolean VANIR_MODE = true;
    public static final boolean POLY_MODE = true;



    @Override
    public final void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        if (DEVELOPER_MODE) {
            StrictMode.enableDefaults();
        }
        if (VANIR_MODE){
            StrictMode.enableDefaults();
        }
        if(POLY_MODE){
            StrictMode.getThreadPolicy();
        }
        else{
           StrictMode.allowThreadDiskReads(); //Reads disk threads
           StrictMode.allowThreadDiskWrites();//Write disk threads
        }
    }


}
