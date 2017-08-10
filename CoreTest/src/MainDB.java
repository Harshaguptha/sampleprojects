
public class MainDB {

	/*
	 * static Logger log = Logger.getLogger( MainDB.class);
	 * 
	 * public static void main(String[] args) throws IOException,SQLException{
	 * 
	 * log.debug("Debug"); log.info("Info"); }
	 */
	
	public static void main(String[] args) {
		String str="madhu";
		byte[] b=str.getBytes();
		for(byte c:b){
			System.out.print(c+":");
			System.out.println((char)c);
			
		}
	}
}
