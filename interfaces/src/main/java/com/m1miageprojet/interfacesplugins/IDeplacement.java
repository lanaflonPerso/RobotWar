/**
 * @author Nicolas Kircun
 * Date de creation 14 nov. 2016
 * Nom du projet interfaces
 * com.m1miageprojet.interfacesplugins - IDeplacement.java
 * Master 1 MIAGE - UNICE
 */
package com.m1miageprojet.interfacesplugins;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nicolas Kircun
 *
 */
public interface IDeplacement {
	public void move(IRobot r, List<IRobot> adversaires);
}
