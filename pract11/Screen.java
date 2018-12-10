import java.awt.*;
import javax.swing.*;

public class Screen extends JPanel  {

  public Screen(){
    repaint();
  }

  public void paint(Graphics g){
  
  	final int start_pos_x = 10;
	final int start_pos_y = 10;
	final int offset = 40;
	final int rec_width = 100;
	final int rec_height = 30;
	int[] rgb = new int[3];
	Color[] colors = {Color.RED,Color.GREEN,Color.BLUE,Color.MAGENTA};
	
	for(int i=0;i<4;i++){
		rgb[0] = colors[i].getRed();
		rgb[1] = colors[i].getGreen();
		rgb[2] = colors[i].getBlue();
    		g.setColor(colors[i]);
			switch(i){
				case 0: g.setFont(new Font(Font.MONOSPACED,Font.ITALIC,22)); break;
				case 1: g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,22)); break;
				case 2: g.setFont(new Font(Font.SERIF,Font.PLAIN,22)); break;
				case 3: g.setFont(new Font(Font.DIALOG,Font.TRUETYPE_FONT,22)); break;
			}
		g.fillRect(start_pos_x,start_pos_y+offset*i,rec_width,rec_height);
		g.drawString("Current RGB : " + rgb[0] + "  "+ rgb[1]  +  "  " + rgb[2] ,rec_width+offset,rec_height+offset*i);
	}	
  }
}
