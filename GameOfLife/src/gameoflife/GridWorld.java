package gameoflife;

/**
 * 2D Grid World
 * 
 * @author J. Hollingsworth
 */
import processing.core.PApplet;

public class GridWorld {

	private final int WIDTH = 800;
	private final int HEIGHT = 600;

	// possible colors
	public final int WHITE = -1;
	public final int BLACK = -16777216;
	public final int RED = -65536;
	public final int GREEN = -16711936;
	public final int YELLOW = -256;
	public final int NOCOLOR = 0;

	private int [][] grid;
	private int [][] second;
	private PApplet p;

	public GridWorld(PApplet pApplet, int nRows, int nCols) {
		// hold on to the PApplet object
		p = pApplet;

		// create the grid
		grid = new int[nRows][nCols];
		second = new int[nRows][nCols];

		// initialize both grids
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[0].length; c++) {
				grid[r][c] = WHITE;
				second[r][c] = WHITE;
			}
		}
	}
	
	// randomly place color into the grid
	public void randomize(float prob, int color) {
		for (int r = 1; r < grid.length - 1; r++) {
			for (int c = 1; c < grid[0].length - 1; c++) {
				if (Math.random() < prob) {
					grid[r][c] = color;
				}
			}
		}
	}

	public int getColor(int row, int col) {
		if (row >= 0 && row < grid.length) {
			if (col >= 0 && col < grid[0].length) {
				return grid[row][col];
			}
		}

		return NOCOLOR;
	}

	public void setColor(int row, int col, int color) {
		if (row >= 0 && row < grid.length) {
			if (col >= 0 && col < grid[0].length) {
				second[row][col] = color;
			}
		}
	}

	public void draw() {
		
		grid = second;
		second = new int[grid.length][grid[0].length];
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[0].length; c++) {
				second[r][c] = WHITE;
			}
		}
		
		float rectWidth = p.getWidth() / grid.length;
		float rectHeight = p.getHeight() / grid[0].length;

		int r = 0;
		int c = 0;
		for (int y = 0; y < p.getHeight(); y += rectHeight) {
			for (int x = 0; x < p.getWidth(); x += rectWidth) {
				p.noStroke();
				p.fill(grid[r][c]);
				p.rect(x,  y, rectWidth, rectHeight);
				c++;
			}
			r++;
			c = 0;
		}
	}

}
