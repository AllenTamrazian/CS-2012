package application;

abstract class PastureMap extends Coordinate{
	public PastureMap(int rows, int columns) {
		super(rows, columns);
		// TODO Auto-generated constructor stub
	}
	int[][] twoD_arr = new int[getRow()][getColumn()];
}
