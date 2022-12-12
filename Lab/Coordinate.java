package application;

public class Coordinate {
	int rows;
	int columns;
	public Coordinate(int rows, int columns)
	{
		this.rows=rows;
		this.columns=columns;
	}
	public void setRowAndColumn(int rows, int columns)
	{
		this.rows=rows;
		this.columns=columns;
	}
	public int getRow()
	{
		return rows;
	}
	public int getColumn()
	{
		return columns;
	}
}