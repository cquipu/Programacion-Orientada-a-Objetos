package views;

import java.awt.EventQueue;

public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				
					/*
					DashboardFrame frame = new DashboardFrame();
					frame.setVisible(true);
					*/
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
