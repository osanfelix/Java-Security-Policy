
public class JavaSecurity
{
	public static void main(String[] args)
	{
		System.setSecurityManager(new SecurityManager());
		printInformation();
	}
	
	public static void printInformation()
	{
		try {
			System.out.println("Java Version \t==> " + System.getProperty("java.version"));
		} catch(Exception ex){System.err.println("Error: "+ ex.toString());}
		try {
			System.out.println("Java route \t==> " + System.getProperty("java.home"));
		} catch(Exception ex){System.err.println("Error: "+ ex.toString());}
		try {
			System.out.println("Java vendor \t==> " + System.getProperty("java.vendor"));
		} catch(Exception ex){System.err.println("Error: "+ ex.toString());}
		try {
			System.out.println("OS name \t==> " + System.getProperty("os.name"));
		} catch(Exception ex){System.err.println("Error: "+ ex.toString());}
		try {
			System.out.println("OS version \t==> " + System.getProperty("os.version"));
		} catch(Exception ex){System.err.println("Error: "+ ex.toString());}
		try {
			System.out.println("Dir. actual \t==> " + System.getProperty("user.dir"));
		} catch(Exception ex){System.err.println("Error: "+ ex.toString());}
		try {
			System.out.println("Home ruta \t==> " + System.getProperty("user.home"));
		} catch(Exception ex){System.err.println("Error: "+ ex.toString());}
		try {
			System.out.println("Nom usuari \t==> " + System.getProperty("user.name"));
		} catch(Exception ex){System.err.println("Error: "+ ex.toString());}
	}
}
