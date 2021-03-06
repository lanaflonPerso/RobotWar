package com.m1miageprojet.gestionplugins.actionsswing;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.m1miageprojet.gestionplugins.SwingRepository;

public class ActionAttaque extends AbstractAction 
{
	private String nomplugins;
	private SwingRepository swing;
	
	public ActionAttaque(String name, SwingRepository swing)
	{
		super(name);
		nomplugins = name;
		this.swing = swing;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		swing.setNomPluginAttaqueSelectionne(nomplugins);
        swing.chargement(swing.getRepo());
        swing.getOutils().encodeToFile(swing.getApp().getRobots(), "Sauvegarde.xml");
	}

}
