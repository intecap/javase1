package chat;

import java.util.List;

import javax.swing.DefaultListModel;

public class ContactModel extends DefaultListModel<Contacto> {

	private static final long serialVersionUID = 5170073859722944797L;

	private List<Contacto> contactos = CargarContactos.obtenerContactos();

	@Override
	public Contacto getElementAt(int index) {
		return contactos.get(index);
	}

	@Override
	public int getSize() {
		return contactos.size();
	}
}
