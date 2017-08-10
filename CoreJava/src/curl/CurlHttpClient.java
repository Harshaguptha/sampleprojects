package curl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.codec.binary.Base64;

public class CurlHttpClient {
	 

	public static void main(String args[]) throws IOException {

//curl -u symphoni1:11@@##33 https://registry.symphoni.io/v2/ef/cc/manifests/latest -v --header "Accept: application/vnd.docker.distribution.manifest.v2+json"
       // String stringUrl = " https://registry.symphoni.io/v2/ef/cc/manifests/v62";
      
        //uc.setRequestProperty("X-Requested-With", "Curl");
		String stringUrl = " https://registry.symphoni.io/v2/ef/cc/manifests/v62";
        URL url = new URL(stringUrl);
        URLConnection uc = url.openConnection();
        String userpass = "symphoni1" + ":" + "11@@##33";
        String basicAuth = "Basic " + new String(new Base64().encode(userpass.getBytes()));
        uc.setRequestProperty ("Authorization", basicAuth);
        InputStream in = uc.getInputStream();
        System.out.println(in);

    }
}
