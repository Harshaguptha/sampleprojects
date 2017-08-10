package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnvTest {

	public static void main(String[] args) throws Exception {
	    String[] cmd = {"cmd.exe"};
	    String[] envp = {"SLALogger=truefhsjhsf"};
	    Process p = Runtime.getRuntime().exec(cmd, envp);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
	    String line = null;
	    while ((line = reader.readLine()) != null) {
	       System.err.println(line);
	    }
	  }
}
