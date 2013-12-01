//favoring composition over inheritance

public class NewPoint3 {
	private int z;
	private Point2 p;
	
	public NewPoint3(int x, int y, int z)
	{
		p = new Point2(x,y);
		this.z = z;
	}

	public int getX(){return p.getX();}
	public int getY(){return p.getY();}
	public int getZ(){return this.z;}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == this)
			return true;
		if(!(o instanceof NewPoint3))
			return false;
		NewPoint3 n = (NewPoint3)o;
		return n.z == z && n.p.equals(p);
	}
	
	@Override
	public int hashCode()
	{
		int result = 17;
		result = result * 31 + ((Integer)z).hashCode();
		result = result * 31 + p.hashCode();
		return result;
	}
}