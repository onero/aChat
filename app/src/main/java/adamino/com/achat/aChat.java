package adamino.com.achat;

import android.app.Application;

import com.parse.Parse;

public class aChat extends Application {

    /* (non-Javadoc)
     * @see android.app.Application#onCreate()
     */
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "1TM83IXlQAKKibYkl7RbEZaEvQtzBThTdcQxz5Fx", "ixyrl0ZPQ06UEcePRwfBRmD0jwic6XeoJDb5246e");

    }
}
