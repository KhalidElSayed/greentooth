package ws.android

import com.github.jbrechtel.robospecs.RoboSpecs
import org.specs2.mock.Mockito
import android.net.ConnectivityManager
import android.content.Intent

class ConnectedServiceTest extends RoboSpecs with Mockito {

  "A connected service" should {
    "connect as soon as a connection is available" in {
      "1" must be_==( "1")
    }
  }


}