import java.io.IOException;

public class RunApp {

public	String Spotifypath = null;
public	String Youtubepath = null;
public	String Cemupath = null;
public	String path = null;

	
	
	
	public void Spotify() {
		try
		{
		
		Runtime.getRuntime().exec("C:\\Users\\jamis\\AppData\\Roaming\\Spotify\\Spotify.exe");
		System.out.println("Spotify has launched");
		}
		catch (Exception e) {
			
		}
}
	
	
	public void Youtube() {
		
		try {
			Runtime.getRuntime().exec("C:\\Users\\jamis\\Desktop\\Youtube.url");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void Cemu() {
		try {
			Runtime.getRuntime().exec("D:\\Games OG\\Wii u\\Cemu.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	public void Opera() {
		try {
			Runtime.getRuntime().exec("C:\\Program Files\\Opera\\launcher.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		
}
	
	
	public void Steam() {
		try {
			Runtime.getRuntime().exec("C:\\Program Files (x86)\\Steam\\steam.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	
}
	
	
	
	
}

