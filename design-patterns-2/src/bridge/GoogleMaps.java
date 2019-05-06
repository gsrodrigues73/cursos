package bridge;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) {
		try {
			String googleMaps = "http://maps.google.com/maps?q=" + rua;
			URL url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			openStream.close();
			//...
			return "mapa";
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
