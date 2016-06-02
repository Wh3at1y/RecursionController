package math.view;

import javax.swing.JFrame;

import math.controller.RecursionController;

public class RecursionFrame extends JFrame
	{
		private RecursionPanel basePanel;
		
		public RecursionFrame(RecursionController baseController)
		{
			basePanel = new RecursionPanel(baseController);
			
			buildFrame();
		}
		
		private void buildFrame()
		{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setContentPane(basePanel);
			setSize(500,500);
			setTitle("Recursion: (Noun), see Recursion");
			setVisible(true);
		}
	}
