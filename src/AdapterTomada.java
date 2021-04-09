/**
 * Classe responsáve por adaptar a tomada de 3 pinos para tomada de 2 pinos
 * @author emersson
 *
 */
public class AdapterTomada implements ITomadaDeDoisPinos{
	
	private TomadaDeTresPinos t3;
	
	public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
		this.t3 = tomadaDeTresPinos;
	}

	@Override
	public void conectarTomadaDoisPinos() {
		// TODO Auto-generated method stub
		t3.conectarTomadaTresPinos();
	}

	@Override
	public void desconectarTomadaDoisPinos() {
		// TODO Auto-generated method stub
		t3.desconectarTomadaTresPinos();
	}

}
