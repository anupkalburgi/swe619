public class Point2 {
	private int x,y;
	public Point2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}


	public int getY(){
		return this.x;
	}

	@Override
	public boolean equals(Object o)
	{
		if(o == this) 
			return true;
		if(!(o instanceof Point2))
			return false;
		Point2 n = (Point2)o;
		return n.x == x && n.y == y;
	}
	
	@Override
	public int hashCode()
	{
		int result = 17;
		result = result * 31 + ((Integer)x).hashCode();
		result = result * 31 + ((Integer)y).hashCode();
		return result;
	}
}