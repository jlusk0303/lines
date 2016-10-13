
// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;

public class GraphicsLab03st extends Applet {

	private int red;

	public void paint(Graphics g) {
		// Draw Grid
		g.drawRect(10, 10, 780, 580);
		g.drawLine(400, 10, 400, 590);
		g.drawLine(10, 300, 790, 300);

		Random rnd = new Random(1234);

		// Draw Random Lines
		for (int k = 1; k <= 1000; k++) {

			int x1 = rnd.nextInt(390) + 10;

			int y1 = rnd.nextInt(290) + 10;

			int x2 = rnd.nextInt(390) + 10;

			int y2 = rnd.nextInt(290) + 10;
			int red = rnd.nextInt(620);

			int green = rnd.nextInt(256);

			int blue = rnd.nextInt(2532);

			g.setColor(new Color(red, green, blue));
			g.drawLine(x1, y1, x2, y2);

		}

		// Draw Random Squares
		{

			{

				Random rndInt = new Random(12345);

				for (int k = 1; k <= 1000; k++)

				{

					int x = rndInt.nextInt(320) + 400;

					int y = rndInt.nextInt(230) + 10;

					int red = rndInt.nextInt(256);

					int green = rndInt.nextInt(656);

					int blue = rndInt.nextInt(256);

					g.setColor(new Color(red, green, blue));

					g.fillRect(x, y, 50, 50);

				}

			}

		}
		// Draw Random Circles
		{

			Random rndInt = new Random(12345);

			for (int k = 1; k <= 1000; k++)

			{

				int x = rndInt.nextInt(340) + 10;

				int y = rndInt.nextInt(230) + 300;

				int red = rndInt.nextInt(826);

				int green = rndInt.nextInt(256);

				int blue = rndInt.nextInt(256);

				g.setColor(new Color(red, green, blue));
				g.drawOval(x, y, 50, 50);
			}

		}
		// Draw 3-D Box
		{



	



			}



			}
	}
	
