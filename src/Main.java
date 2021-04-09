/**
 * 
 * @author emersson
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TomadaDeTresPinos t3 = new TomadaDeTresPinos();

		AdapterTomada a = new AdapterTomada(t3);
		a.conectarTomadaDoisPinos();
		a.desconectarTomadaDoisPinos();
	}

}
