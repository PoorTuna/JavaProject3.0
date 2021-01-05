
public class SparseMatrix
{
	int[][] matrix;
	
	public SparseMatrix(int x, int y)
	{
		this.matrix = new int[x][y];
	}
		
	public boolean isEmpty()
	{ //������ ����� ������ �� �� ���� ��� ���� �0 �� �� ������ false ���� true
		for (int x = 0 ; x < this.matrix.length ; x++)
		{
			for (int y = 0 ; y < this.matrix[0].length ; y++) 
			{
				if (this.matrix[x][y] !=0)
					return false;
			}
		}
		return true;
		
	}
	public int getValue(Position p)
	{// ������ ����� ������� ���� Position ����� ����� X �-Y ������ �� ���� ������ ������.
		return this.matrix[p.getI()][p.getJ()];
	}
	public void setValue(Position p,int par)
	{// ������ ����� ����� X �-Y ����� ������ ����� �� ���� ������� ������ ������� �������.
		this.matrix[p.getI()][p.getJ()] = par;
	}
	
	public void insert(Position p,int par)
	{// ������ ����� ����� X �-Y ����� ������ ����� �� ���� ������� ������ ������� �������.
		this.matrix[p.getI()][p.getJ()] = par;
	}
	public void insertSorted(Position p,int par)
	{// ������ ����� ����� X �-Y ����� ������ ����� �� ���� ������� ������ ������� �������.
		this.matrix[p.getI()][p.getJ()] = par;
	}
	
	public void remove(Position p)
	{// ������ ����� ����� X �-Y ����� ������ ����� �� ���� ������� ������ ������� �0.
		
		this.matrix[p.getI()][p.getJ()] = 0;
	}
	public String toString()
	{ // ������ ������ �� ��� ����� ����� ���� ��� ���� ����.
		String string = "";
		for (int x = 0 ; x < matrix.length ; x++)
		{
			for (int y = 0 ; y < matrix[0].length ; y++)
			{
				string += matrix[x][y] + ","; 
			}
		}
	}
	public static void main(String[] args)
	{

	}

}
