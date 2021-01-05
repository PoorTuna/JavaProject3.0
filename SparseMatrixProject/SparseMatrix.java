
public class SparseMatrix
{
	int[][] matrix;
	
	public SparseMatrix(int x, int y)
	{
		this.matrix = new int[x][y];
	}
		
	public boolean isEmpty()
	{ //הפעולה בודקת בלולאה אם יש איבר שלא שווה ל0 אם כן מחזירה false אחרת true
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
	{// הפעולה מקבלת אובייקט מסוג Position המכיל ערכים X ו-Y ומחזיר את הערך במיקום המבוקש.
		return this.matrix[p.getI()][p.getJ()];
	}
	public void setValue(Position p,int par)
	{// הפעולה מקבלת ערכים X ו-Y ומספר מסויים ומשנה את הערך במטריצה במיקום המסויים לפרטמטר.
		this.matrix[p.getI()][p.getJ()] = par;
	}
	
	public void insert(Position p,int par)
	{// הפעולה מקבלת ערכים X ו-Y ומספר מסויים ומשנה את הערך במטריצה במיקום המסויים לפרטמטר.
		this.matrix[p.getI()][p.getJ()] = par;
	}
	public void insertSorted(Position p,int par)
	{// הפעולה מקבלת ערכים X ו-Y ומספר מסויים ומשנה את הערך במטריצה במיקום המסויים לפרטמטר.
		this.matrix[p.getI()][p.getJ()] = par;
	}
	
	public void remove(Position p)
	{// הפעולה מקבלת ערכים X ו-Y ומספר מסויים ומשנה את הערך במטריצה במיקום המסויים ל0.
		
		this.matrix[p.getI()][p.getJ()] = 0;
	}
	public String toString()
	{ // הפעולה מדפיסה את כלל איברי המערך בסדר לפי שורה וטור.
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
