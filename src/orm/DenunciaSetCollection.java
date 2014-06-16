/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package orm;

import org.orm.*;

public class DenunciaSetCollection extends org.orm.util.ORMSet {
	public DenunciaSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public DenunciaSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persisten objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(Denuncia value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(Denuncia value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(Denuncia value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public Denuncia[] toArray() {
		return (Denuncia[]) super.toArray(new Denuncia[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>den_id</li>
	 * <li>den_tipo</li>
	 * <li>den_denuncia</li>
	 * <li>den_ciudad</li>
	 * <li>den_sector</li>
	 * <li>den_fecha_creacion</li>
	 * <li>den_fecha_modificacion</li>
	 * <li>den_usuario_creador</li>
	 * <li>den_usuario_modificador</li>
	 * <li>den_fecha_usuario_modifica</li>
	 * <li>den_desactivar</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public Denuncia[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>den_id</li>
	 * <li>den_tipo</li>
	 * <li>den_denuncia</li>
	 * <li>den_ciudad</li>
	 * <li>den_sector</li>
	 * <li>den_fecha_creacion</li>
	 * <li>den_fecha_modificacion</li>
	 * <li>den_usuario_creador</li>
	 * <li>den_usuario_modificador</li>
	 * <li>den_fecha_usuario_modifica</li>
	 * <li>den_desactivar</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public Denuncia[] toArray(String propertyName, boolean ascending) {
		return (Denuncia[]) super.toArray(new Denuncia[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return orm.ChileDenunciaPersistentManager.instance();
	}
	
}

