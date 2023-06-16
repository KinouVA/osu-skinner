package osuSkinner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Gui implements ActionListener {
	
	JFrame window;
	JButton btn;
	JMenuBar menu;
	JMenu mFile;
	JMenuItem iNew, iOpen, iSave, iSaveAs, iClose;

	Function_mFile file = new Function_mFile(this);
	
	public static void main(String[] args) {

		new Gui();
		
	}
	
	public Gui() {
		
		createWindow();
		createMenu();
		
		window.setVisible(true);
		
	}

	public void createWindow() {
		
		window = new JFrame("Osu!Skinner");
		window.setLocationRelativeTo(null);
		window.setSize(800,600);
		window.setResizable(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Osu!_Logo.png")));
		
		btn = new JButton();
		
	}
	
//	
//	Menu[Bar] and Menu[Bar] Items
//	
	
	public void createMenu() {
		
		menu = new JMenuBar();
		window.setJMenuBar(menu);
		
		mFile = new JMenu("File");
		menu.add(mFile);
		
//		Menu Items
		
		iNew = new JMenuItem("New");
		iNew.addActionListener(this);
		iNew.setActionCommand("New");
		mFile.add(iNew);
		
		iOpen = new JMenuItem("Open");
		iOpen.addActionListener(this);
		iOpen.setActionCommand("Open");
		mFile.add(iOpen);
		
		iSave = new JMenuItem("Save");
		iSave.addActionListener(this);
		iSave.setActionCommand("Save");
		mFile.add(iSave);
		
		iSaveAs = new JMenuItem("Save As");
		iSaveAs.addActionListener(this);
		iSaveAs.setActionCommand("Save");
		mFile.add(iSaveAs);
		
		iClose = new JMenuItem("Close");
		iClose.addActionListener(this);
		iClose.setActionCommand("Close");
		mFile.add(iClose);
		
	}

//	
//	SPACER
//	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		switch(command) {
//		case "New": file.newFile(); break;
//		case "Open": file.open(); break;
//		case "Save": file.save(); break;
//		case "Save As": file.saveAs(); break;
		case "Close": file.close(); break;
		
		}
	}
}