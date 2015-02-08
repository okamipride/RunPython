import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RunPython extends JFrame implements WindowListener {

	JPanel panel = new JPanel();
	JButton runButton = new JButton("Run");
	JButton stopButton = new JButton("Stop");
	ProcessBuilder pb =  new ProcessBuilder("python","routinecheck.py");
	Process p = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Run Python begin");
	
		 new RunPython();
		 /*
		 ProcessBuilder pb = new ProcessBuilder("python","routinecheck.py");
				 try {
					System.out.println("begin process");
					Process p = pb.start();
				} catch (IOException e) {
					System.out.println(e);
					e.printStackTrace();
				} */
	}
	
	public RunPython() {
		super("Run Python Program");
		//this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		this.setSize(200, 100); 
		this.setResizable(true);
		this.setVisible(true);
		
		panel.add(runButton);
		panel.add(stopButton);
		
		runButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("run onclick");
				try {
					if (pb == null) {
						System.out.println("pb == null");
						 pb =  new ProcessBuilder("python","routinecheck.py");
					}
					System.out.println("pb start");
					p = pb.start();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Process Create Failed");
				}
			}			
		});
		
		stopButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("stop onclick");
				if (p!=null) {
					System.out.println("process destroy");
					p.destroy();
					pb = null;
				}
			}			
		});
		
		this.add(panel);
	}
	

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("windowActivated");				
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("windowClosed");			
	
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing");
		if (p!=null) {
			p.destroy();
			pb = null;
		}
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("windowDeactivated");				
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("windowDeiconified");				
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("windowIconified");				
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");				
	}
}
