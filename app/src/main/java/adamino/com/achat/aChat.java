package adamino.com.achat;

import android.app.Application;

import com.parse.Parse;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class aChat extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

		Parse.initialize(this, "zI6sDSBL11zLzPuvoK0DfYYrlqAN5bN3zYpms8Q4",
				"aaMc4ZMGoyHebweQ06arRzvQHTOrvDPMSPJWaF6E");

	}
}
