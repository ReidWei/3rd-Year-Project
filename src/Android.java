//import javafx.scene.web.WebView;
import junit.framework.*;
import org.junit.*;
//import static org.junit.Assert.assertEquals;  

public class Android extends TestCase{
	
	MockObject obj = new MockObject();
	
	//private Enlighten_Webview_Main mActivity;
	//private WebView mWeb;
	//private WebViewClient mMockWebViewClient;
	
	public final void testLoadValidUrl() {
        assertEquals("http://www.google.com", obj.isValidURL());
    }

	public final void testLoadInValidUrl() {
        assertEquals("", obj.isInvalidURL());
        assertNotSame("asdf", obj.isValidURL());
    }
	
/*

    //private void assertLoadUrl(String url) {
        //mWeb.loadUrl(url);
        //sleep();

            //Added to hopefully let webview load all the way
        //getInstrumentation().waitForIdleSync();

        //assertTrue(!(mWeb.getProgress() < 100));            
    }

    private void sleep() {
        try {
            Thread.sleep(TIMEOUT);
        } catch (InterruptedException e) {
            fail("Unexpected timeout");
        }
    }
    public class MockWebViewClient extends WebViewClient {
        boolean mError;

        @Override
        public void onReceivedError(WebView view, int errorCode,
                String description, String failingUrl) {
            mError = true;
        }
    }
	
	public void testVideo(){
		assertTrue("This will succeed.", true);
	}
*/
	
}
