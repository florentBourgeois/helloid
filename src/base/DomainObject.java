package base;

/// <summary>
/// Base class for domain objects that provides basic 
/// functionality across all objects.
/// </summary>
public class DomainObject
{
	protected String name = "";
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.name;
    }
    
    public DomainObject()
    {
    }
    public DomainObject(String name)
    {
        this.name = name;
    }
    
    public void print() {
    	System.out.println(this);
    }
}